package com.blog.demo.Repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.blog.demo.Entities.Comment;

@RepositoryRestResource
public interface CommentRepos extends JpaRepository<Comment, Long> {
    public List<Comment> findAll();

    public static Comment saveComment(Comment comment) {
        return null;
    }
}
