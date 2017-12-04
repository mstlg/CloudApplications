package cloudAssignment;

import com.google.cloud.storage.Bucket;

/**
 * @author stlaumade created on 04/12/2017
 */

//This class will merge two buckets
public class MergeBucket {

	//Returns the new bucket
	public Bucket mergeBucket(String projectid, String credentials_path, String bucket_name1, String bucket_name2, String merge_bucket_name){

		//Create new bucket
		BuildBucket b = new BuildBucket(); 
		b.createBucket(projectid, credentials_path, merge_bucket_name);
		
		//Put the two buckets to merge in it
		//Iterate over the buckets to put it into the new bucket
		
		//Clear the original buckets
		//Delete the original buckets
		BucketMethods bm = new BucketMethods();
		bm.deleteBucket();
		
		return null;

	}
}
