package cloudAssignment;

//Main method to test my project
public class MainMethod {

	public static void main(String[] args) {
		
		String projectid = "sinuous-ally-187922";
		String credentials = "C:Users/stlaumade/Desktop/SWEN503/Credentials.Json";
		String bucketname = "maddie_test_bucket";
		
		//Create a new bucket
		BuildBucket b = new BuildBucket();
		b.createBucket(projectid, credentials , bucketname);
		
		

	}

}
