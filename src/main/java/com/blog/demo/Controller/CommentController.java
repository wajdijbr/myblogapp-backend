package com.blog.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.crossstore.ChangeSetPersister.NotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import com.blog.demo.Entities.Comment;
import com.blog.demo.Services.CommentServices;

import java.util.List;

@RestController

@RequestMapping("/comments")
@CrossOrigin("*")
public class CommentController {
    @Autowired
    private CommentServices services;

    @RequestMapping(method = RequestMethod.GET)
    public List<Comment> getAllComments() {
        return services.getAllComments();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Comment getCommentById(@PathVariable("id") Long id) throws NotFoundException {
        return services.getComment(id);
    }

    @RequestMapping(method = RequestMethod.POST)
    public Comment createComment(@RequestBody Comment comment) {
        return services.saveComment(comment);
    }

    @RequestMapping(method = RequestMethod.PUT)
    public Comment updateComment(@RequestBody Comment comment) {
        return services.updateComment(comment);

    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public void deleteComment(@PathVariable("id") Long id) {
        Comment comment = null;
        try {
            comment = services.getComment(id);
        } catch (NotFoundException e) {
            throw new ResponseStatusException(
                    HttpStatus.NOT_FOUND, "Get post");
        }
        services.deleteComment(comment);
    }

}