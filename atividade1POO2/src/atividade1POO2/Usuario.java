package atividade1POO2;

import java.math.BigInteger;
import java.security.MessageDigest;

public class Usuario {

	private String usuario;
	private String senha;

	public Usuario() {
	}

	public Usuario(String usuario, String senha) {
		this.usuario = usuario;
		this.senha = senha;
	}

	public String getUsuario() {
		return usuario;
	}
	

	public void setUsuario(String usuario) {
		if (usuario.length() > 0)
			this.usuario = usuario;
	}
	

	public String getSenha() {
		return senha;
	}
	

	public void setSenha(String senha) {
		if (senha.length() >= 8 && senha != usuario) {
			try {
			MessageDigest digest = MessageDigest.getInstance("SHA-1");
			digest.reset();
			digest.update(senha.getBytes("utf8"));
			this.senha = String.format("%040x", new BigInteger(1, digest.digest()));
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Usuario [usuario=");
		builder.append(usuario);
		builder.append(", senha=");
		builder.append(senha);
		builder.append("]");
		return builder.toString();
	}

}
