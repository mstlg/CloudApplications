package cloudAssignment;

import com.google.api.services.storage.model.Bucket;
import com.google.cloud.storage.BlobId;
import com.google.cloud.storage.Storage;
import com.google.cloud.storage.StorageOptions;
import com.google.cloud.storage.StorageOptions.Builder;

/**
 * @author stlaumade created on 04/12/2017
 */

//These are the methods that will modify an existing bucket
public class BucketMethods {

	public void selectBucket(String bucket_name, String credential, String uri){
//		
//		GoogleCredential credentials = GoogleCredential.fromStream(new FileInputStream(credential)).createScoped(Collections.singleton(STORAGE_SCOPE));
//		HttpTransport httpTransport = GoogleNetHttpTransport.newTrustedTransport();
//		HttpRequestFactory requestFactory = httpTransport.createRequestFactory(credentials);
//		GenericUrl url = new GenericUrl(uri);
//		HttpRequest request = requestFactory.buildGetRequest(url);
//		
//		HttpResponse response = request.execute();
//		String content = response.parseAsString();
//		System.out.println(content);
	
	}
	
	public void uploadFiles(Bucket b, String blob_name){
		
//		InputStream content = new ByteArrayInputStream("Hello, World!".getBytes(UTF_8));
//		Blob blob = b.create(blob_name, content, "text/plain");
//		b.
	}
	
	public void browseObjects(){
		
	}
	
	public void downloadObjects(){
		
	}
	
	public void renameBucket(){
		
	}
	
	public Boolean deleteBlob(String bucket_name, String blob_name){
		
		BlobId blobId = BlobId.of(bucket_name, blob_name);
		Builder builder = StorageOptions.newBuilder();
		Storage storage = builder.build().getService();
		
		boolean deleted = storage.delete(blobId);
		if (deleted){
			System.out.println("Bucket successfully deleted");
		} else {
			System.out.println("Could not delete bucket");
		}
		return deleted;
	}
	
	public void deleteBucket(){
//		Storage storage = StorageOptions.getDefaultInstance().getService();
//		boolean deleted = bucket.delete(BucketSourceOption.metagenerationMatch());
//		
	}
	
	public void changePermissions(){
		
	}
	
	public void changeStorageClass(){
		
	}
	
	public void sharePublicly(){
		
	}
	
}
