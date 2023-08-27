package saulo.io.projetoCRUD.entity;

import jakarta.persistence.*;

@Entity
public class Usuario {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@Column(name = "NM_NOME")
	private String nome;

	@Column(name = "NM_EMAIL")
	private String email;

	/*
	 * EAGER -> Carregamento instantaneo das associoações LEAZY -> Carregamento por
	 * demanda
	 */
	@ManyToOne(cascade = CascadeType.PERSIST, fetch = FetchType.EAGER)
	private Perfil perfil;

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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Perfil getPerfil() {
		return perfil;
	}

	public void setPerfil(Perfil perfil) {
		this.perfil = perfil;
	}

}
