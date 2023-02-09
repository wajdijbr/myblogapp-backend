package com.blog.demo.Services;
// 

import java.util.List;

import org.springframework.data.crossstore.ChangeSetPersister.NotFoundException;

import com.blog.demo.Entities.Posts;

public interface PostsServices {

    Posts savePosts(Posts p);

    Posts updatePosts(Posts p);
    void deletePosts(Posts p);
    void deletePostsById(Long id);
    Posts getPosts(Long id) throws NotFoundException;
    List<Posts> getAllPosts();
}
