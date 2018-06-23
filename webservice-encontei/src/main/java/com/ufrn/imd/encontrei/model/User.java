package com.ufrn.imd.encontrei.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id_user")
	private Integer id;
    private String name;
    private String login;
    private String email;
    private String phoneNumber;
    private Integer idPhoto;
    private String keyPhoto;
    private String matricila;
    private String curso;

    public User() {
    }

    public User(Integer id, String username, String contact) {
        this.id = id;
        this.name = username;
        this.email = contact;
    }

    public User(Integer id, String name, String login, String email, String phoneNumber, Integer idPhoto, String matricila, String curso, String keyPhoto) {
        this.id = id;
        this.name = name;
        this.login = login;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.idPhoto = idPhoto;
        this.keyPhoto = keyPhoto;
        this.matricila = matricila;
        this.curso = curso;

    }

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public Integer getIdPhoto() {
		return idPhoto;
	}

	public void setIdPhoto(Integer idPhoto) {
		this.idPhoto = idPhoto;
	}

	public String getKeyPhoto() {
		return keyPhoto;
	}

	public void setKeyPhoto(String keyPhoto) {
		this.keyPhoto = keyPhoto;
	}

	public String getMatricila() {
		return matricila;
	}

	public void setMatricila(String matricila) {
		this.matricila = matricila;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}
}
