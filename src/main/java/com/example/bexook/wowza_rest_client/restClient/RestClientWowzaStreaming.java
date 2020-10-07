package com.example.bexook.wowza_rest_client.restClient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLParameters;
import java.io.IOException;
import java.net.Authenticator;
import java.net.CookieHandler;
import java.net.ProxySelector;
import java.net.http.HttpClient;
import java.net.http.HttpResponse;
import java.time.Duration;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;

@Service
public class RestClientWowzaStreaming {


    public void getDataFromService(){
        RestTemplate restTemplate = new RestTemplate();
        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.setContentType(MediaType.APPLICATION_JSON);
        httpHeaders.setAccept(Collections.singletonList(MediaType.APPLICATION_JSON));


        httpHeaders.set("wsc-api-key","QIrVROVeA9ick0Mv7NZHHhGDejpGiMH6gaZbNXUjdRjO8QrBuHEsQN3ZEjQw333f");
        httpHeaders.set("wsc-access-key","UrH3U0lkYoUI5JTOgxNOnPbg7Lt8cbm0nSsJhybbPNwx2rxM3t29B7a40wis3426");



        Map<String, Object> stringObjectMap = new HashMap<>();
        stringObjectMap.put("aspect_ratio_height", 1080);
        stringObjectMap.put("aspect_ratio_width", 1920);
        stringObjectMap.put( "billing_mode", "pay_as_you_go");
        stringObjectMap.put("broadcast_location","eu_germany");
        stringObjectMap.put( "encoder","wowza_gocoder");
        stringObjectMap.put("name", "My Live Stream");
        stringObjectMap.put("transcoder_type", "transcoded");
        stringObjectMap.put("closed_caption_type", "none");
        stringObjectMap.put("delivery_method", "push");
        stringObjectMap.put( "delivery_protocols", "wowz");
        stringObjectMap.put("delivery_type","single-bitrate");
        stringObjectMap.put( "disable_authentication",false);
        stringObjectMap.put("hosted_page",true);
        stringObjectMap.put("hosted_page_description","My Hosted Page Description");
        stringObjectMap.put("hosted_page_logo_image","none");
        stringObjectMap.put("hosted_page_sharing_icons", true);
        stringObjectMap.put("hosted_page_title", "My Hosted Page");
        stringObjectMap.put("low_latency", false);
        stringObjectMap.put("password", "68332313");
        stringObjectMap.put("player_countdown", true);
        stringObjectMap.put("player_countdown_at", "2020-02-01T17:00:00.000Z");
        stringObjectMap.put("player_logo_image", "[Base64-encoded string representation of GIF, JPEG, or PNG file]");
        stringObjectMap.put("player_logo_position", "top-right");
        stringObjectMap.put("player_responsive", false);
        stringObjectMap.put("player_type", "wowza_player");
        stringObjectMap.put("player_video_poster_image", "none");
        stringObjectMap.put("player_width", 640);
        stringObjectMap.put("recording", true );
        stringObjectMap.put("remove_hosted_page_logo_image",true);
        stringObjectMap.put("remove_player_logo_image", true);
        stringObjectMap.put("remove_player_video_poster_image", true);
        stringObjectMap.put("source_url", "xyz.streamlock.net/vod/mp4:Movie.mov" );
        stringObjectMap.put("target_delivery_protocol", "hls-https" );
        stringObjectMap.put("use_stream_source", false );
        stringObjectMap.put("username", "client2" );
        stringObjectMap.put("vod_stream", true);



        HttpEntity<Map<String,Object>> entity = new HttpEntity<>(stringObjectMap,httpHeaders);


        ResponseEntity<String> stringResponseEntity = restTemplate.postForEntity("https://api-sandbox.cloud.wowza.com/api/beta/live_streams",entity,String.class);
        if(stringResponseEntity.getStatusCode()==HttpStatus.CREATED){
            System.out.println("Created");
        }

/*
        String request = new String("curl -X POST \\\\\\n\" +\n" +
                "                \"-H \\\"Content-Type: application/json\\\" \\\\\\n\" +\n" +
                "                \"-H \\\"wsc-api-key: QIrVROVeA9ick0Mv7NZHHhGDejpGiMH6gaZbNXUjdRjO8QrBuHEsQN3ZEjQw333f\\\" \\\\\\n\" +\n" +
                "                \"-H \\\"wsc-access-key: UrH3U0lkYoUI5JTOgxNOnPbg7Lt8cbm0nSsJhybbPNwx2rxM3t29B7a40wis3426\\\" \\\\\\n\" +\n" +
                "                \"-d '{\\n\" +\n" +
                "                \"   \\\"live_stream\\\": {\\n\" +\n" +
                "                \"     \\\"aspect_ratio_height\\\": 1080,\\n\" +\n" +
                "                \"     \\\"aspect_ratio_width\\\": 1920,\\n\" +\n" +
                "                \"     \\\"billing_mode\\\": \\\"pay_as_you_go\\\",\\n\" +\n" +
                "                \"     \\\"broadcast_location\\\": \\\"us_west_california\\\",\\n\" +\n" +
                "                \"     \\\"closed_caption_type\\\": \\\"none\\\",\\n\" +\n" +
                "                \"     \\\"delivery_method\\\": \\\"push\\\",\\n\" +\n" +
                "                \"     \\\"encoder\\\": \\\"wowza_gocoder\\\",\\n\" +\n" +
                "                \"     \\\"hosted_page\\\": true,\\n\" +\n" +
                "                \"     \\\"hosted_page_sharing_icons\\\": true,\\n\" +\n" +
                "                \"     \\\"name\\\": \\\"MyLiveStream\\\",\\n\" +\n" +
                "                \"     \\\"player_responsive\\\": true,\\n\" +\n" +
                "                \"     \\\"player_type\\\": \\\"wowza_player\\\",\\n\" +\n" +
                "                \"     \\\"transcoder_type\\\": \\\"transcoded\\\"\\n\" +\n" +
                "                \"   }\\n\" +\n" +
                "                \"}' \\\"https://api-sandbox.cloud.wowza.com/api/beta/live_streams");

        restTemplate.postForEntity("https://api-sandbox.cloud.wowza.com/api/beta/live_streams",request,String.class);
*/

    }



}
