package br.com.curso.model;

/**
 * @author Marcelo
 */
public class Usuario{

	private String login;
	private String senha;

	public String getUsuario() {
		return login;
	}

	public void setUsuario(String login) {
		this.login = login;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}
}
