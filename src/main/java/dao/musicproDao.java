package dao;

import java.util.List;
import model.Usuario;
import model.Producto;

public interface musicproDao {
	//usuarios
	void agregarUsuario(Usuario usuario);
	
	/*Usuario recuperarUsuario(String correo);
	
	void eliminarUsuario(String correo);*/
	
	List<Usuario> devolverUsuarios();
	
	void eliminarUsuario(int idUser);
	
	Usuario recuperarUsuario(int idUser);
	
	void actualizarUsuario(Usuario usuario);
	
	//productos
	void agregarProducto(Producto producto);
	
	List<Producto> devolverProductos();
	
	void eliminarProducto(int producto);
	
	Producto recuperarProducto(int id);
	
	void actualizarProducto(Producto producto);
	
}
