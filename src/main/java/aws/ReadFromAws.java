package aws;

import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.AWSStaticCredentialsProvider;
import com.amazonaws.auth.BasicAWSCredentials;

import com.amazonaws.regions.Regions;
import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.AmazonS3Client;
import com.amazonaws.services.s3.AmazonS3ClientBuilder;
import com.amazonaws.services.s3.model.Bucket;
import org.apache.commons.logging.Log;

import java.io.File;
import java.util.List;


public class ReadFromAws {

    public static void main(String[] args) {

        AWSCredentials credentials = new BasicAWSCredentials("XXXXXXXXXXXXXX", "XXXXXXXXXXXXXXXXXXXXXXXXXXXX");
        AmazonS3 s3client = AmazonS3ClientBuilder.standard().withCredentials(new AWSStaticCredentialsProvider(credentials))
                .withRegion(Regions.US_EAST_1)
                .build();

        String bucketName = "baeldung-bucket12";


        //if(s3client.doesBucketExist(bucketName)) {
        // Log.info("Bucket name is not available." + " Try again with a different Bucket name.");
        // return;
        //     }

        //s3client.createBucket(bucketName) ;

        List<Bucket> buckets = s3client.listBuckets();


        for (Bucket bucket : buckets) {
            System.out.println(bucket.getName());
        }

        System.out.println(buckets.get(0).toString());


        if(buckets.get(0).getName().equals("karthikkentucky"))
        {
            System.out.printf("this is karthikkentucky bucket");
            //s3client.putObject("karthikkentucky","s3test/sample.json",new File("C:\\Users\\karth\\OneDrive\\Desktop\\sample.json"));
            s3client.dow
        }
        else{
            System.out.println("The names didn't match");
        }




    }



}
