package com.example.data;


import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * Created by Amir on 6/15/2016.
 */
public class PostSummary {

    private Integer id;
    private String title;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

}
