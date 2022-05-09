package service;

import java.util.List;
import model.Usuario;

public interface musicproService {
	boolean agregarUsuario(Usuario usuario);
	
	List<Usuario> recuperarUsuarios();
	
	void actualizarUsuario(Usuario usuario);
	
	boolean eliminarUsuario(int idUser);
	
	Usuario buscarUsuario(int idUser);
	
}
