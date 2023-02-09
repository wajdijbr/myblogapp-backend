package com.blog.demo.Services;
// 

import java.util.List;

import org.springframework.data.crossstore.ChangeSetPersister.NotFoundException;

import com.blog.demo.Entities.Comment;

public interface CommentServices {

    Comment saveComment(Comment p);

    Comment updateComment(Comment p);

    void deleteComment(Comment p);

    void deleteCommentById(Long id);

    Comment getComment(Long id) throws NotFoundException;

    List<Comment> getAllComments();
}
