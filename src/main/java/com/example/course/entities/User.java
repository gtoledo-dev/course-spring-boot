package com.example.course.entities;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class User implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	private String cpf;
	private String decription;

	
	public User() {
		
	}


	public User(Long id, String name, String cpf, String decription) {
		super();
		this.id = id;
		this.name = name;
		this.cpf = cpf;
		this.decription = decription;
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getCpf() {
		return cpf;
	}


	public void setCpf(String cpf) {
		this.cpf = cpf;
	}


	public String getDecription() {
		return decription;
	}


	public void setDecription(String decription) {
		this.decription = decription;
	}


	@Override
	public int hashCode() {
		return Objects.hash(id);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		return Objects.equals(id, other.id);
	}


	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", cpf=" + cpf + ", decription=" + decription + "]";
	}

	



	
	
	
	
	

}
