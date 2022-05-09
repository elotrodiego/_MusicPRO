package dao;

import java.util.List;
import model.Usuario;

public interface musicproDao {
	
	void agregarUsuario(Usuario usuario);
	
	/*Usuario recuperarUsuario(String correo);
	
	void eliminarUsuario(String correo);*/
	
	List<Usuario> devolverUsuarios();
	
	void eliminarUsuario(int idUser);
	
	Usuario recuperarUsuario(int idUser);
	
	void actualizarUsuario(Usuario usuario);
}
