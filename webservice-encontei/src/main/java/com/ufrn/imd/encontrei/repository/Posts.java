package com.ufrn.imd.encontrei.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.ufrn.imd.encontrei.model.Post;

public interface Posts extends JpaRepository<Post, Integer>{
	@Query("select p from Post p where p.user.id = ?1")
	List<Post> findUsersByIdUser(Integer id);
}
