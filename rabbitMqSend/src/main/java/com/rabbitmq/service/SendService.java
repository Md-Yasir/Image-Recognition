package com.rabbitmq.service;

import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;

import antlr.collections.List;

import java.io.File;
import java.nio.charset.StandardCharsets;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SendService {
	
	private final static String QUEUE_NAME = "hello";
	
//	@Autowired
//	private DriverService driverService;
//	
//	private String fileId = 1;
//	
//	public String addImage() {
//		
//		File[] files;
//		for (File file : files) {
//			fileId = driverService.uploadFile(file, filePath);
//			Send(fileId);
//		}
//		
//		return "done";
//	}

    public String Send(String fileId) throws Exception {
    	   	
        ConnectionFactory factory = new ConnectionFactory();
        factory.setHost("localhost");
        try (Connection connection = factory.newConnection();
             Channel channel = connection.createChannel()) {
            channel.queueDeclare(QUEUE_NAME, false, false, false, null);
            channel.basicPublish("", QUEUE_NAME, null, fileId.toString().getBytes(StandardCharsets.UTF_8));
            System.out.println(" Image Sent '" + fileId + "'");
        }
		return fileId + "sent";
    }

}
