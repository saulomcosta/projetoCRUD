package saulo.io.projetoCRUD.repository;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import saulo.io.projetoCRUD.entity.Perfil;
import saulo.io.projetoCRUD.enun.StatusPerfil;

	
@Repository
public interface PerfilRepository extends JpaRepository<Perfil, Long>{

	List<Perfil> findBystatusPerfil(StatusPerfil status);	
	
	Page<Perfil> findAll(Pageable value);
}
