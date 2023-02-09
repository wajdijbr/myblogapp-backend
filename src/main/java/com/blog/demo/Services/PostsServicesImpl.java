package com.blog.demo.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.crossstore.ChangeSetPersister.NotFoundException;
import org.springframework.stereotype.Service;

import com.blog.demo.Entities.Posts;
import com.blog.demo.Repos.PostsRepos;

import java.util.List;
@Service
public class PostsServicesImpl implements PostsServices{
    @Autowired
    private PostsRepos postsRepository;
    @Override
    public Posts savePosts(Posts p) {
        return postsRepository.save(p);
    }

    @Override
    public Posts updatePosts(Posts p) {
        return postsRepository.save(p);
    }
    @Override
    public void deletePosts(Posts p) {
        postsRepository.delete(p);;
    }
    @Override
    public void deletePostsById(Long id) {
        postsRepository.deleteById(id);
    }
    @Override
    public Posts getPosts(Long id) throws NotFoundException {
        Posts post = postsRepository.findById(id).get();
        if(post  ==  null) throw new NotFoundException();
        return post;
    }

    @Override
    public List<Posts> getAllPosts() {
        return postsRepository.findAll();
    }



}
