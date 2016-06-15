package com.example.service;

import com.example.data.PostDetail;
import com.example.data.PostSummary;
import com.example.repo.DataRepository;
import com.example.service.dto.PostDetailDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by Amir on 6/15/2016.
 */
@RestController
public class MyRestController {

    private final DataRepository dataRepository;

    @Autowired
    public MyRestController(DataRepository dataRepository) {
        this.dataRepository = dataRepository;
    }

    @RequestMapping(method = RequestMethod.GET,
            value = "/api/posts")
    public List<PostSummary> getPosts() {
        return dataRepository.getPosts();
    }

    @RequestMapping(method = RequestMethod.GET,
            value = "/api/posts/{id}")
    public PostDetail getPost(@PathVariable("id")Integer id) {
        return dataRepository.getPost(id);
    }
}
