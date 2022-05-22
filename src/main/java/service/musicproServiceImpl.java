package service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dao.musicproDao;
import model.Producto;
import model.Usuario;

@Service
public class musicproServiceImpl implements musicproService {

	@Autowired
	musicproDao dao;
	
	@Override
	public boolean agregarUsuario(Usuario usuario) {
		// añadir usuario si no existe
		if (dao.recuperarUsuario(usuario.getIdUser()) == null) {
			dao.agregarUsuario(usuario);
			return true;
		}
		return false;
	}

	@Override
	public List<Usuario> recuperarUsuarios() {
		// TODO Auto-generated method stub
		return dao.devolverUsuarios();
	}

	@Override
	public void actualizarUsuario(Usuario usuario) {
		// eliminar contacto si existe
		if (dao.recuperarUsuario(usuario.getIdUser()) != null) {
			dao.actualizarUsuario(usuario);
		}
	}

	@Override
	public boolean eliminarUsuario(int idUser) {
		// TODO Auto-generated method stub
		if (dao.recuperarUsuario(idUser) != null) {
			dao.eliminarUsuario(idUser);
			return true;
		}
		return false;
	}

	@Override
	public Usuario buscarUsuario(int idUser) {
		// TODO Auto-generated method stub
		return dao.recuperarUsuario(idUser);
	}

	@Override
	public boolean agregarProducto(Producto producto) {
		//añadir producto si no existe
		if (dao.recuperarProducto(producto.getId()) == null) {
			dao.agregarProducto(producto);
			return true;
		}
		return false;
	}

	@Override
	public List<Producto> recuperarProductos() {
		// TODO Auto-generated method stub
		return dao.devolverProductos();
	}

	@Override
	public void actualizarProducto(Producto producto) {
		if (dao.recuperarProducto(producto.getId()) != null) {
			dao.actualizarProducto(producto);
		}
		
	}

	@Override
	public boolean eliminarProducto(int id) {
		if (dao.recuperarProducto(id) != null) {
			dao.eliminarProducto(id);
			return true;
		}
		return false;
	}

	@Override
	public Producto buscarProducto(int id) {
		// TODO Auto-generated method stub
		return dao.recuperarProducto(id);
	}
	

}
