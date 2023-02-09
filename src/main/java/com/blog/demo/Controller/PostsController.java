package com.blog.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.crossstore.ChangeSetPersister.NotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import com.blog.demo.Entities.Posts;
import com.blog.demo.Services.PostsServices;

import java.util.List;
@RestController

@RequestMapping("/posts")
@CrossOrigin("*")
public class PostsController {
    @Autowired
    private PostsServices services;

    @RequestMapping(method = RequestMethod.GET)
    public List<Posts> getAllPosts() {
        return services.getAllPosts();
    }

    @RequestMapping(value="/{id}",method = RequestMethod.GET)
    public Posts getPostsById(@PathVariable("id") Long id) throws NotFoundException
    {
        return services.getPosts(id);
    }
    


    @RequestMapping(method = RequestMethod.POST)
    public Posts createPosts(@RequestBody Posts posts) {
        return services.savePosts(posts) ;
    }

    @RequestMapping(method = RequestMethod.PUT)
    public Posts updatePosts(@RequestBody Posts posts) {
        return services.updatePosts(posts);

    }

    @RequestMapping(value="/{id}",method = RequestMethod.DELETE)
    public void deleteProduit(@PathVariable("id") Long id)
    {
        Posts p = null;
        try {
            p = services.getPosts(id);
        } catch (NotFoundException e) {
            throw new ResponseStatusException(
                    HttpStatus.NOT_FOUND, "Get post");
        }
        services.deletePosts(p);
    }



}