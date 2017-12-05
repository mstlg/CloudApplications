package cloudAssignment;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import com.google.api.gax.paging.Page;
import com.google.auth.oauth2.ServiceAccountCredentials;
import com.google.cloud.PageImpl;
import com.google.cloud.storage.Blob;
import com.google.cloud.storage.Bucket;
import com.google.cloud.storage.BucketInfo;
import com.google.cloud.storage.Storage;
import com.google.cloud.storage.Storage.BlobListOption;
import com.google.cloud.storage.StorageOptions;
import com.google.cloud.storage.StorageOptions.Builder;
/**
 * @author stlaumade created on 04/12/2017
 */

//This class creates a new bucket
public class BuildBucket {

	//This method takes in 3 strings for the project id, credentials path, and bucket name 
	//Returns a bucket
	public Bucket createBucket(String project_id, String credentials_path, String bucket_name){
				
		Builder builder = StorageOptions.newBuilder();
		
		try {
			builder.setCredentials(ServiceAccountCredentials.fromStream(new FileInputStream(credentials_path)));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		builder.setProjectId(project_id);
		
		Storage storage = builder.build().getService();
		
		Bucket bucket = storage.create(BucketInfo.of(bucket_name));
		
		System.out.printf("\nBucket %s created.%n", bucket.getName());
		
		return bucket;
		
	}
}
