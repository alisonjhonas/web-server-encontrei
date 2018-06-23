package com.ufrn.imd.encontrei.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ufrn.imd.encontrei.model.Post;
import com.ufrn.imd.encontrei.repository.Posts;

@RestController
public class PostResource {
	
	@Autowired
	Posts posts;

	@GetMapping("/post")
	public String getPost() {
		return "Hello world.";
	}
	
	@PostMapping("/post")
	public void newPost(@RequestBody Post post) {
		posts.save(post);
	}
	
	@DeleteMapping("/post/{id}")
	public void deletePost(@PathVariable Integer id) {
		posts.deleteById(id);
	}
	
	@PutMapping("/post")
	public void update(@RequestBody Post post) {
		posts.save(post);
	}
	
	@GetMapping("/posts/{idUser}")
	public List<Post> list(@PathVariable Integer idUser) {
		return posts.findUsersByIdUser(idUser);
	}
	
	@GetMapping("/posts")
	public List<Post> listAll() {
		return posts.findAll();
	}
}
