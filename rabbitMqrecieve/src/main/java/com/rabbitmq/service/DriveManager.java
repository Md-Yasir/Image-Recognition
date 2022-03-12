package com.rabbitmq.service;

import org.springframework.stereotype.Service;

@Service
public class DriveManager {
	
	/** Application name. */
//    private static final String APPLICATION_NAME = "Yass Learning";
    /** Global instance of the JSON factory. */
//    private static final JsonFactory JSON_FACTORY = JacksonFactory.getDefaultInstance();
    /** Directory to store authorization tokens for this application. */
//    private static final String TOKENS_DIRECTORY_PATH = "tokens";
    
//    private static final List<String> SCOPES = Collections.singletonList(DriveScopes.DRIVE);
//    private static final String CREDENTIALS_FILE_PATH = "\\credentials.json";
//    
//    public Drive getInstance() throws GeneralSecurityException, IOException {
//		// Build a new authorized API client service.
//		final NetHttpTransport HTTP_TRANSPORT = GoogleNetHttpTransport.newTrustedTransport();
//		Drive service = new Drive.Builder(HTTP_TRANSPORT, JSON_FACTORY, getCredentials(HTTP_TRANSPORT))
//				.setApplicationName(APPLICATION_NAME)
//				.build();
//		return service;
//
//	}
//    
//    private static Credential getCredentials(final NetHttpTransport HTTP_TRANSPORT) throws IOException {
//        // Load client secrets.
//        InputStream in = DriveManager.class.getResourceAsStream(CREDENTIALS_FILE_PATH);
//        if (in == null) {
//            throw new FileNotFoundException("Resource not found: " + CREDENTIALS_FILE_PATH);
//        }
//        GoogleClientSecrets clientSecrets = GoogleClientSecrets.load(JSON_FACTORY, new InputStreamReader(in));

        // Build flow and trigger user authorization request.
//        GoogleAuthorizationCodeFlow flow = new GoogleAuthorizationCodeFlow.Builder(
//                HTTP_TRANSPORT, JSON_FACTORY, clientSecrets, SCOPES)
//                .setDataStoreFactory(new FileDataStoreFactory(new java.io.File(TOKENS_DIRECTORY_PATH)))
//                .setAccessType("offline")
//                .build();
//        LocalServerReceiver receiver = new LocalServerReceiver.Builder().setPort(8888).build();
//        Credential credential = new AuthorizationCodeInstalledApp(null, receiver).authorize("user");
//        //returns an authorized Credential object.
//        return credential;
//    }
    
 
}
