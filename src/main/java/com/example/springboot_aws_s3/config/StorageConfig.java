package com.example.springboot_aws_s3.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.AWSStaticCredentialsProvider;
import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.AmazonS3ClientBuilder;

@Configuration
public class StorageConfig {

    @Value("${cloud.aws.credentials.access-key}")
    public String accesKey;

    @Value("${cloud.aws.credentials.secret-key}")
    public String secretKey;

    @Value("${cloud.aws.region.static}")
    public String region;

    @Bean
    public AmazonS3 generateS3Client(){
        AWSCredentials credentials = new BasicAWSCredentials(accesKey, secretKey);
        return AmazonS3ClientBuilder.standard()
                                    .withCredentials(new AWSStaticCredentialsProvider(credentials))
                                    .withRegion(region)
                                    .build();

    } 

    
}
