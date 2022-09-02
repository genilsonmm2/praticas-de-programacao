package com.example.api.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.api.model.Usuario;
import com.example.api.service.UsuarioService;

@RestController
@RequestMapping(path = "/usuario", produces = "application/json")
public class UsuarioController {
	
	@Autowired
	private UsuarioService usuarioService;
	
	@PostMapping()
	public ResponseEntity<String> cadastrar(@RequestBody @Valid Usuario usuario){
		try {
			usuarioService.cadastrar(usuario);
			return new ResponseEntity<String>("Usuário cadastrado com sucesso", HttpStatus.OK);
		} 
		catch (Exception e) {
			return new ResponseEntity<String>(HttpStatus.BAD_REQUEST);
		}
	}
	
}
