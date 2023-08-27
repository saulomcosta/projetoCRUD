package saulo.io.projetoCRUD.entity;
	
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import saulo.io.projetoCRUD.enun.StatusPerfil;

@Entity
public class Perfil {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@Column(name = "NM_NOME")
	private String nome;

	@Enumerated(EnumType.STRING)
	@Column(name = "STATUS")
	private StatusPerfil statusPerfil;

	public Perfil() {
	}

	public Perfil(String nome, StatusPerfil statusPerfil) {

		this.nome = nome;
		this.statusPerfil = statusPerfil;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public StatusPerfil getStatusPerfil() {
		return statusPerfil;
	}

	public void setStatusPerfil(StatusPerfil statusPerfil) {
		this.statusPerfil = statusPerfil;
	}

}
