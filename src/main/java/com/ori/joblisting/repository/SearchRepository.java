package com.ori.joblisting.repository;

import com.ori.joblisting.model.Post;

import java.util.List;

public interface SearchRepository
{
    List<Post> findByText(String text);
}
