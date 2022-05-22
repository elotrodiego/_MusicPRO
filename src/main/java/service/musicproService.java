package service;

import java.util.List;
import model.Usuario;
import model.Producto;

public interface musicproService {
	//usuario
	
	boolean agregarUsuario(Usuario usuario);
	
	List<Usuario> recuperarUsuarios();
	
	void actualizarUsuario(Usuario usuario);
	
	boolean eliminarUsuario(int idUser);
	
	Usuario buscarUsuario(int idUser);
	
	//producto
	
	boolean agregarProducto(Producto producto);
	
	List<Producto> recuperarProductos();
	
	void actualizarProducto(Producto producto);
	
	boolean eliminarProducto(int id);
	
	Producto buscarProducto(int id);
	
}
