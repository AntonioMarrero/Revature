package com.revature.main;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.web.client.RestTemplate;

import com.revature.beans.Dennis;

public class Application {
	
	private static final Logger log = LoggerFactory.getLogger(Application.class);

	public static void main(String[] args) {
		String oneRequestUrl = "http://theateamservice-env.euifdgnmpt.us-east-2.elasticbeanstalk.com/dennis/2";
		String  requestUrl = "http://theateamservice-env.euifdgnmpt.us-east-2.elasticbeanstalk.com/dennis";
		Dennis d = new Dennis();
		RestTemplate restTemplate = new RestTemplate();
		
		try {
			ResponseEntity<Dennis[]> responseEntity = restTemplate.getForEntity(requestUrl, Dennis[].class);
			Dennis[] da = responseEntity.getBody();
			MediaType contentType = responseEntity.getHeaders().getContentType();
			HttpStatus statusCode = responseEntity.getStatusCode(); 
			log.info("Resource consumption successful");
			for(Dennis dennis: da) {
				log.info(dennis.toString());
			}
		} catch (Exception e) {
			log.error("Resource consumption failed!!!!");
		}
		
//		String postUrl = "http://theateamservice-env.euifdgnmpt.us-east-2.elasticbeanstalk.com/dennis";
//		
//		Dennis d1 = new Dennis("Cray-Cray", "Nerd", 9l, 190000l);
//		try {
//			d1 = restTemplate.postForObject(postUrl, d1, Dennis.class);
//			log.info("'Posted': " + d1.toString());
//		} catch (Exception e) {
//			log.error("Post FAILED!!!!");
//		}
//		
		String patchUrl = "http://theateamservice-env.euifdgnmpt.us-east-2.elasticbeanstalk.com/dennis";
		
		// -------------------------
        // used to update our Dennis
        // -------------------------
		Dennis update = new Dennis(21l, "Cray-Cray", "Nerd", 9l, 190000l);
//		
        HttpHeaders headers = new HttpHeaders();
        MediaType mediaType = new MediaType("application", "json");
        headers.setContentType(mediaType);

        HttpEntity<Dennis> entity = new HttpEntity<Dennis>(update, headers);

        HttpComponentsClientHttpRequestFactory requestFactory = new HttpComponentsClientHttpRequestFactory();
        RestTemplate restTemplatePatch = new RestTemplate(requestFactory);

        try {
            restTemplatePatch.exchange(patchUrl, HttpMethod.PATCH, entity, Void.class);
            log.info("'Patched': ");
        } catch(Exception e) {
            log.error("Patch unsuccessful");
        }

        try {
           d = restTemplate.getForObject(oneRequestUrl, Dennis.class);
           log.info("Resource consumption successful");
           log.info(d.toString());
       } catch(Exception e) {
           log.error("Resource consumption unsuccessful");
       }
        
        
        // -----------------
        // Delete our Dennis
        // -----------------
        
//        String deleteUrl = "http://theateamservice-env.euifdgnmpt.us-east-2.elasticbeanstalk.com/dennis/delete/22";
//        
//        try {
//            restTemplate.delete(deleteUrl);
//        } catch (Exception e) {
//            log.error("Deletion failed!!");
//        }

	}
}
