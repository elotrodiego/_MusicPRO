package controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import model.Usuario;
import service.musicproService;

@CrossOrigin(origins = "*")
@RestController
public class UsuariosController {
	
	@Autowired
	musicproService service;
	
	@GetMapping(value = "usuario", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Usuario> recuperarContactos() {
		return service.recuperarUsuarios();
	}

	@GetMapping(value = "usuario/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	public Usuario recuperarContactos(@PathVariable("id") int id) {
		return service.buscarUsuario(id);
	}

	@PostMapping(value = "usuario", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.TEXT_PLAIN_VALUE)
	public String guardarContacto(@RequestBody Usuario usuario) {
		System.out.println("HOLA");
		return String.valueOf(service.agregarUsuario(usuario));
	}

	@PutMapping(value = "usuario", consumes = MediaType.APPLICATION_JSON_VALUE)
	public void actualizarContacto(@RequestBody Usuario usuario) {
		service.actualizarUsuario(usuario);;
	}

	@DeleteMapping(value = "usuario/{id}")
	public void eliminarPorId(@PathVariable("id") int idUser) {
		service.eliminarUsuario(idUser);

	}
}
