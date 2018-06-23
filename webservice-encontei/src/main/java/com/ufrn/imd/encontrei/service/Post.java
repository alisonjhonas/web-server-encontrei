package com.ufrn.imd.encontrei.service;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Post {
	
	@GetMapping("/post")
	public String getPost() {
		return "Hello world.";
	}
	
	@PostMapping("/post")
	public void newPost(@RequestBody Post post) {
		//TODO
	}
	
	@DeleteMapping("/post/{id}")
	public void deletePost(@PathVariable Integer id ) {
		//TODO
	}
	
	@PutMapping("/post")
	public void update(@RequestBody Post post) {
		//TODO
	}
	
	@GetMapping("/posts/{idUser}")
	public List<Post> list(@PathVariable Integer idUser) {
		//TODO
		return null;
	}
	
	@GetMapping("/posts")
	public List<Post> listAll() {
		//TODO
		return null;
	}
}
