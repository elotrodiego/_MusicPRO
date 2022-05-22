package dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import model.Usuario;
import model.Producto;

@Repository
public class musicproImpl implements musicproDao {

	@Autowired
	UsuarioJpaSpring _usuario;
	@Autowired
	ProductoJpaSpring _producto;
	
	@Override
	public void agregarUsuario(Usuario usuario) {
		_usuario.save(usuario);
	}

	/*@Override
	public Usuario recuperarUsuario(String correo) {
		// TODO Auto-generated method stub
		return musicpro.findByEmail(correo)
	}

	@Override
	public void eliminarUsuario(String correo) {
		// TODO Auto-generated method stub
		musicpro.eliminarPorEmail(correo);
		
	}*/

	@Override
	public List<Usuario> devolverUsuarios() {
		// TODO Auto-generated method stub
		return _usuario.findAll();
		//
	}

	@Override
	public void eliminarUsuario(int idUser) {
		// TODO Auto-generated method stub
		_usuario.deleteById(idUser);
	}

	@Override
	public Usuario recuperarUsuario(int idUser) {
		// TODO Auto-generated method stub
		return _usuario.findById(idUser).orElse(null);
	}

	@Override
	public void actualizarUsuario(Usuario usuario) {
		// TODO Auto-generated method stub
		_usuario.save(usuario);
	}
	
	//producto
	@Override
	public void agregarProducto(Producto producto) {
		_producto.save(producto);
	}
	
	@Override
	public List<Producto> devolverProductos() {
		return _producto.findAll();
	}
	
	@Override
	public void eliminarProducto(int id) {
		_producto.deleteById(id);
	}
	
	@Override
	public Producto recuperarProducto(int id) {
		return _producto.findById(id).orElse(null);
	}

	@Override
	public void actualizarProducto(Producto producto) {
		// TODO Auto-generated method stub
		_producto.findAll();
	}
	
	
}
