package com.example.bexook.wowza_rest_client;

import com.example.bexook.wowza_rest_client.restClient.RestClientWowzaStreaming;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class WowzaRestClientApplication {


	public static void main(String[] args) {
		SpringApplication.run(WowzaRestClientApplication.class, args);
	}


}
