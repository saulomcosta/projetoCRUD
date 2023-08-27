package saulo.io.projetoCRUD;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import saulo.io.projetoCRUD.services.PerfilServices;


@Component
public class Initializer implements ApplicationListener<ContextRefreshedEvent> {

	@Autowired
	private PerfilServices perfilServices;

	@Override
	public void onApplicationEvent(ContextRefreshedEvent event) {

		this.perfilServices.savePerfil();

	}

}
