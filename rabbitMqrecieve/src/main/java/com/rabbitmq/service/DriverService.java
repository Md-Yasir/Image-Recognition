package com.rabbitmq.service;

import org.springframework.stereotype.Service;

@Service
public class DriverService {

//	  @Autowired
//	  private DriveManager googleDriveManager;
//	  
//	  /** Application name. */
//	    private static final String APPLICATION_NAME = "Yass Learning";
//	    /** Global instance of the JSON factory. */
//	    private static final JsonFactory JSON_FACTORY = JacksonFactory.getDefaultInstance();
	    /** Directory to store authorization tokens for this application. */
//	    private static final String TOKENS_DIRECTORY_PATH = "tokens";
	    
//	    private static final List<String> SCOPES = Collections.singletonList(DriveScopes.DRIVE);
//	    private static final String CREDENTIALS_FILE_PATH = "\\credentials.json";
//	    
//	    public java.io.File getCredFile() {
//			try {
//				return new ClassPathResource("yass-learning-343812-b4fafb3208ec.p12").getFile();
//			} catch (IOException e) {
//				e.printStackTrace();
//			}
//			return null;
//		}
//	    
//	    private Credential getCredentials(final NetHttpTransport HTTP_TRANSPORT) throws Exception {
//
//			GoogleCredential credential = new GoogleCredential.Builder()
//					.setTransport(HTTP_TRANSPORT)
//					.setJsonFactory(JSON_FACTORY)
//					.setServiceAccountId("yass-learning@yass-learning-343812.iam.gserviceaccount.com")
//					.setServiceAccountProjectId("yass-learning-343812")
//					.setServiceAccountPrivateKeyFromP12File(getCredFile())
//					.setServiceAccountScopes(SCOPES)
//					.build();
//
//			return credential;
//
//		}	  
	
//		public InputStream getFile(String fileId) {
//		try {
//	
//			NetHttpTransport HTTP_TRANSPORT = GoogleNetHttpTransport.newTrustedTransport();
//	
//			Drive driveService = new Drive.Builder(HTTP_TRANSPORT, JSON_FACTORY, getCredentials(HTTP_TRANSPORT))
//					.setApplicationName(APPLICATION_NAME)
//					.build();
//	
//			
//			return driveService.files().get(fileId).executeMediaAsInputStream();
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//		return null;
//	}
	
//		public void deleteFile(String fileId) throws Exception {
//			googleDriveManager.getInstance().files().delete(fileId).execute();
//		}
//
//		public String uploadFile(MultipartFile file, String filePath) {
//			try {
//				String folderId = getFolderId(filePath);
//				if (null != file) {
//					File fileMetadata = new File();
//					fileMetadata.setParents(Collections.singletonList(folderId));
//					fileMetadata.setName(file.getOriginalFilename());
//					File uploadFile = googleDriveManager.getInstance()
//							.files()
//							.create(fileMetadata, new InputStreamContent(
//									file.getContentType(),
//									new ByteArrayInputStream(file.getBytes()))
//							)
//							.setFields("id").execute();
//					return uploadFile.getId();
//				}
//			} catch (Exception e) {
//			System.out.println("Error: " + e);
//			}
//			return null;
//		}
//
//		public String getFolderId(String path) throws Exception {
//			String parentId = null;
//			String[] folderNames = path.split("/");
//
//			Drive driveInstance = googleDriveManager.getInstance();
//			for (String name : folderNames) {
//				parentId = findOrCreateFolder(parentId, name, driveInstance);
//			}
//			return parentId;
//		}
//
//		private String findOrCreateFolder(String parentId, String folderName, Drive driveInstance) throws Exception {
//			String folderId = searchFolderId(parentId, folderName, driveInstance);
//			// Folder already exists, so return id
//			if (folderId != null) {
//				return folderId;
//			}
//			//Folder dont exists, create it and return folderId
//			File fileMetadata = new File();
//			fileMetadata.setMimeType("application/vnd.google-apps.folder");
//			fileMetadata.setName(folderName);
//
//			if (parentId != null) {
//				fileMetadata.setParents(Collections.singletonList(parentId));
//			}
//			return driveInstance.files().create(fileMetadata)
//					.setFields("id")
//					.execute()
//					.getId();
//		}
//
//		private String searchFolderId(String parentId, String folderName, Drive service) throws Exception {
//			String folderId = null;
//			String pageToken = null;
//			FileList result = null;
//
//			File fileMetadata = new File();
//			fileMetadata.setMimeType("application/vnd.google-apps.folder");
//			fileMetadata.setName(folderName);
//
//			do {
//				String query = " mimeType = 'application/vnd.google-apps.folder' ";
//				if (parentId == null) {
//					query = query + " and 'root' in parents";
//				} else {
//					query = query + " and '" + parentId + "' in parents";
//				}
//				result = service.files().list().setQ(query)
//						.setSpaces("drive")
//						.setFields("nextPageToken, files(id, name)")
//						.setPageToken(pageToken)
//						.execute();
//
//				for (File file : result.getFiles()) {
//					if (file.getName().equalsIgnoreCase(folderName)) {
//						folderId = file.getId();
//					}
//				}
//				pageToken = result.getNextPageToken();
//			} while (pageToken != null && folderId == null);
//
//			return folderId;
//		}
//	    

}
