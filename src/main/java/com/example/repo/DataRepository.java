package com.example.repo;

import com.example.data.PostDetail;
import com.example.data.PostSummary;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Amir on 6/15/2016.
 */

public class DataRepository  {

    public List<PostSummary> getPosts() {
        RestTemplate restTemplate = new RestTemplate();
        List<HttpMessageConverter<?>> messageConverters = new ArrayList<>();
        messageConverters.add(new MappingJackson2HttpMessageConverter());
        restTemplate.setMessageConverters(messageConverters);
        return Arrays.asList(restTemplate.getForObject("http://jsonplaceholder.typicode.com/posts", PostSummary[].class));
    }

    public PostDetail getPost(Integer id) {
        RestTemplate restTemplate = new RestTemplate();
        List<HttpMessageConverter<?>> messageConverters = new ArrayList<>();
        messageConverters.add(new MappingJackson2HttpMessageConverter());
        restTemplate.setMessageConverters(messageConverters);
        return restTemplate.getForObject("http://jsonplaceholder.typicode.com/posts/" + (id != null ? id.toString() : ""), PostDetail.class);
    }

}
