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

import model.Producto;
import service.musicproService;

@CrossOrigin(origins = "*")
@RestController
public class ProductosController {
	
	@Autowired
	musicproService service;
	
	@GetMapping(value = "producto", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Producto> recuperarProductos() {
		return service.recuperarProductos();
	}

	@GetMapping(value = "producto/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	public Producto recuperarProducto(@PathVariable("id") int id) {
		return service.buscarProducto(id);
	}

	@PostMapping(value = "producto", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.TEXT_PLAIN_VALUE)
	public String guardarProducto(@RequestBody Producto producto) {
		System.out.println("HOLA");
		return String.valueOf(service.agregarProducto(producto));
	}

	@PutMapping(value = "producto", consumes = MediaType.APPLICATION_JSON_VALUE)
	public void actualizarProducto(@RequestBody Producto producto) {
		service.actualizarProducto(producto);;
	}

	@DeleteMapping(value = "producto/{id}")
	public void eliminarPorId(@PathVariable("id") int id) {
		service.eliminarProducto(id);

	}
}
