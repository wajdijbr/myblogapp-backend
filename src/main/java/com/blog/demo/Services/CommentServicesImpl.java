package com.blog.demo.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.crossstore.ChangeSetPersister.NotFoundException;
import org.springframework.stereotype.Service;

import com.blog.demo.Entities.Comment;
import com.blog.demo.Repos.CommentRepos;

import java.util.List;

@Service
public class CommentServicesImpl implements CommentServices {
    @Autowired
    private CommentRepos commentRepository;

    @Override
    public Comment saveComment(Comment comment) {
        return commentRepository.save(comment);
    }

    @Override
    public Comment updateComment(Comment comment) {
        return commentRepository.save(comment);
    }

    @Override
    public void deleteComment(Comment comment) {
        commentRepository.delete(comment);
        ;
    }

    @Override
    public void deleteCommentById(Long id) {
        commentRepository.deleteById(id);
    }

    @Override
    public Comment getComment(Long id) throws NotFoundException {
        Comment comment = commentRepository.findById(id).get();
        if (comment == null)
            throw new NotFoundException();
        return comment;
    }

    @Override
    public List<Comment> getAllComments() {
        return commentRepository.findAll();
    }

}
