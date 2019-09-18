package van.api;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

@Configuration
public class ApiCall {
    private static final String URL = "http://localhost:8000";

    private final RestTemplate restTemplate;

    public ApiCall(RestTemplateBuilder restTemplateBuilder) {
        this.restTemplate = restTemplateBuilder.build();
    }

    public <T> T Call(String path, HttpMethod httpMethod, Class<T> type) {
        UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl(URL + path);

        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.set(HttpHeaders.ACCEPT, MediaType.APPLICATION_JSON_VALUE);
        httpHeaders.set(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON_VALUE);

        HttpEntity<?> httpEntity = new HttpEntity<>(httpHeaders);
        String body = restTemplate.exchange(builder.toUriString(), httpMethod, httpEntity, String.class).getBody();

        Gson gson = new Gson();
        T result = gson.fromJson(body, type);

        return result;
    }
}
