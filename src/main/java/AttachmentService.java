import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;

public class AttachmentService {

    private RestTemplate restTemplate=new RestTemplate();

    public String findAttachmentTypes(){

        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.add(HttpHeaders.CONTENT_TYPE, "application/json");


        ResponseEntity<String> response =  restTemplate.exchange("http://localhost:8080/documentTyps",
                                                HttpMethod.GET,
                                                new HttpEntity(httpHeaders),
                                                String.class);

        return response.getBody();
    }
}
