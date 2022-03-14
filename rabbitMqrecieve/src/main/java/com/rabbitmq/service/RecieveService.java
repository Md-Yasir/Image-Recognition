package com.rabbitmq.service;

import java.io.IOException;
import java.nio.charset.StandardCharsets;

import org.springframework.stereotype.Service;

import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;
import com.rabbitmq.client.DeliverCallback;

@Service
public class RecieveService {

//	@Autowired 
//	private CloudVisionTemplate cloudVisionTemplate;
	
//	@Autowired
//	private DriverService driverservice;

	private final static String QUEUE_NAME = "hello";
	String fileId = null;

	public String recieve() throws Exception {
		ConnectionFactory factory = new ConnectionFactory();
		factory.setHost("localhost");
		Connection connection = factory.newConnection();
		Channel channel = connection.createChannel();
		
		channel.queueDeclare(QUEUE_NAME, false, false, false, null);
		System.out.println("Waiting..");

		DeliverCallback deliverCallback = (consumerTag, delivery) -> {
			fileId = new String(delivery.getBody(), StandardCharsets.UTF_8);
			System.out.println("Received : '" + fileId + "'");
			detectSafeSearch(fileId);
		};
		System.out.println(channel.basicConsume(QUEUE_NAME, true, deliverCallback, consumerTag -> { }));
		return "sent";
	}
	
	


//
//	 Detection of Exploit Images using google cloud vision
	

	
	public String detectSafeSearch(String fileId) throws IOException {
	
//		InputStream imgBytes = driverservice.getFile(fileId);
	
//		String finalResult = null;
//		List<AnnotateImageRequest> requests = new ArrayList<>();
//
//		X ByteString imgBytes = ByteString.readFrom(new FileInputStream(filePath));
//
//		Image img = Image.newBuilder().setContent(imgBytes).build();
//		Feature feat = Feature.newBuilder().setType(Feature.Type.SAFE_SEARCH_DETECTION).build();
//		AnnotateImageRequest request =
//				AnnotateImageRequest.newBuilder().addFeatures(feat).setImage(img).build();
//		requests.add(request);
//

//		try (ImageAnnotatorClient client = ImageAnnotatorClient.create()) {
//			BatchAnnotateImagesResponse response = client.batchAnnotateImages(requests);
//			List<AnnotateImageResponse> responses = response.getResponsesList();
//
//			for (AnnotateImageResponse res : responses) {
//				if (res.hasError()) {
//					System.out.format("Error: %s%n", res.getError().getMessage());
////					return;
//				}
//
//				SafeSearchAnnotation annotation = res.getSafeSearchAnnotation();
//				finalResult = annotation.getViolence().toString();
//				System.out.format(
//						"adult: %s%n medical: %s%n spoofed: %s%n violence: %s%n racy: %s%n",
//						annotation.getAdult(),
//						X annotation.getMedical(),
//						X annotation.getSpoof(),
//						X annotation.getViolence(),
//						X annotation.getRacy());
//			}                                   //returns confidence 
//		}
//		if(annotation.getAdult() > 60) {
//			driverservice.deleteFile(fileId);
//		}
		return fileId;
	}
}