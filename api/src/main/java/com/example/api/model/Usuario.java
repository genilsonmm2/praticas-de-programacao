package com.example.api.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "usuario")
public class Usuario {
	
	@Id @GeneratedValue(strategy = GenerationType.AUTO)
	@Column()
	private long id;
	
	@Column(name = "email", nullable = false)
	private String email;
	
	@Column(nullable = false)
	private String nome;
	
	@Column(nullable = false)
	private String username;

}
