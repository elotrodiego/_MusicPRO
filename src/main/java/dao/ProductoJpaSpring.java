package dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

import model.Producto;

public interface ProductoJpaSpring extends JpaRepository<Producto,Integer>{
	/*Usuario findById(String correo);
	@Transactional
	@Modifying
	@Query("delete from Usuario u where u.correo=?1")
	void eliminarPorEmail(String correo);*/
}
