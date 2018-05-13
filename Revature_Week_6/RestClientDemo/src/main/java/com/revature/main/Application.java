package com.revature.main;

import java.util.HashSet;
import java.util.Set;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;
import com.revature.beans.*;

public class Application {
	
    private static final Logger log = LoggerFactory.getLogger(Application.class);

    public static void main(String args[]) {
    	//String requestUrl = "http://rest-demo-env-1.x6swqk9te8.us-east-2.elasticbeanstalk.com/users/3";
    	String requestUrl = "http://localhost:8000/users/3";
    	
        RestTemplate restTemplate = new RestTemplate();
        
        try {
        	User user = restTemplate.getForObject(requestUrl, User.class);
        	log.info("Resource consumption successful");
        	log.info(user.toString());
        } catch(Exception e) {
        	log.error("Resource consumption unsuccessful");
        }
        
//        
//    	String postUrl = "http://localhost:8000/users";
        String postUrl = "http://rest-demo-env-1.x6swqk9te8.us-east-2.elasticbeanstalk.com/users";

        User userB = new User("Polly", "Lama", "lam@gmail.com", "dlama","chckennuggets");
        try {
        	User user = restTemplate.postForObject(postUrl, userB, User.class);
        	log.info("'Posted': "+ user.toString());
        } catch(Exception e) {
        	log.error("Post unsuccessful");
        }
    	


    }

}
