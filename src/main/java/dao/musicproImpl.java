package dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import model.Usuario;

@Repository
public class musicproImpl implements musicproDao {

	@Autowired
	musicproJpaSpring musicpro;
	
	@Override
	public void agregarUsuario(Usuario usuario) {
		musicpro.save(usuario);
		System.out.println("asd");
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
		return musicpro.findAll();
		//
	}

	@Override
	public void eliminarUsuario(int idUser) {
		// TODO Auto-generated method stub
		musicpro.deleteById(idUser);
	}

	@Override
	public Usuario recuperarUsuario(int idUser) {
		// TODO Auto-generated method stub
		return musicpro.findById(idUser).orElse(null);
	}

	@Override
	public void actualizarUsuario(Usuario usuario) {
		// TODO Auto-generated method stub
		musicpro.save(usuario);
	}
	
}
