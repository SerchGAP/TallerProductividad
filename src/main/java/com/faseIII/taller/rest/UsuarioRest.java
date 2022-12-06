package com.faseIII.taller.rest;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.faseIII.taller.entity.Usuario;

@RestController
@RequestMapping("usuarios")
public class UsuarioRest {
	
	@GetMapping
	public ResponseEntity<Usuario> getUsuario() {
		Usuario usuario = new Usuario();
		usuario.setId(1L);
		usuario.setName("Usuario 1");
		return ResponseEntity.ok(usuario);

	}

	// @GetMapping //localhost:8080
	// @RequestMapping(value="hello", method=RequestMethod.GET)
	public String hello() {
		return "Hola Mundo";
	}

}
