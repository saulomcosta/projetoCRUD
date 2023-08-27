package saulo.io.projetoCRUD.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import saulo.io.projetoCRUD.entity.Perfil;
import saulo.io.projetoCRUD.services.PerfilServices;

@RestController
@RequestMapping("/user")
public class PerfilController {

	@Autowired
	private PerfilServices perfilServices;

	@RequestMapping(value = "", method = RequestMethod.GET)
	public List<Perfil> buscar() {
		return this.perfilServices.buscar();
	}

	@RequestMapping(value = "", method = RequestMethod.POST)
	public Perfil save(@RequestBody Perfil perfil) {
		return this.perfilServices.save(perfil);
	}

	@RequestMapping(value = "", method = RequestMethod.PUT)
	public Perfil update(@RequestBody Perfil perfil) {
		return this.perfilServices.update(perfil);
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	public void delete(@PathVariable Long id) {
		this.perfilServices.delete(id);
	}
}
