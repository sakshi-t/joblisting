package com.ori.joblisting.repository;

import com.ori.joblisting.model.Post;
import org.springframework.data.mongodb.repository.MongoRepository;



public interface PostRepository extends MongoRepository<Post,String>
{

}
