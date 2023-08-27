package saulo.io.projetoCRUD.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import saulo.io.projetoCRUD.entity.Perfil;
import saulo.io.projetoCRUD.enun.StatusPerfil;
import saulo.io.projetoCRUD.repository.PerfilRepository;

@Service
public class PerfilServices {

	@Autowired
	public PerfilRepository perfilRepository;

	public List<Perfil> buscar() {

		return this.perfilRepository.findAll();
	}

	public Perfil save(Perfil perfil) {

		return this.perfilRepository.save(perfil);
	}

	public Perfil update(Perfil perfil) {
                      
		return this.perfilRepository.save(perfil);
	}

	public void delete(Long id) {
        
		this.perfilRepository.deleteById(id);
	}
	
	public void savePerfil() {

		Perfil perfil1 = new Perfil("Saulo Costa", StatusPerfil.ATIVO);
		Perfil perfil2 = new Perfil("Gabriel Costa", StatusPerfil.ATIVO);
		Perfil perfil3 = new Perfil("João Mariano", StatusPerfil.INATIVO);
		Perfil perfil4 = new Perfil("Felciano Augusto", StatusPerfil.INATIVO);
		Perfil perfil5 = new Perfil("Pedro Silva", StatusPerfil.ATIVO);

		this.perfilRepository.save(perfil1);
		this.perfilRepository.save(perfil2);
		this.perfilRepository.save(perfil3);
		this.perfilRepository.save(perfil4);
		this.perfilRepository.save(perfil5);
	}
}
