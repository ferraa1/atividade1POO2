package atividade1POO2;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Funcionario extends Usuario {

	private String nome;
	private String email;
	private char sexo;
	private List<Double> horasTrabalhadas = new ArrayList<Double>();
	private List<Double> valorHora = new ArrayList<Double>();
	private Date dataNascimento;

	public Funcionario() {
		super();
	}

	public Funcionario(String usuario, String senha) {
		super(usuario, senha);
	}

	public Funcionario(String usuario, String senha, String nome, String email, char sexo, Date dataNascimento) {
		super(usuario, senha);
		this.nome = nome;
		this.email = email;
		this.sexo = sexo;
		this.dataNascimento = dataNascimento;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		if (nome.length() > 0)
			this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		if (email.length() > 0)
			this.email = email;
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		if (sexo == 'f' || sexo == 'm')
			this.sexo = sexo;
	}

	public List<Double> getHorasTrabalhadas() {
		return horasTrabalhadas;
	}

	public void setHorasTrabalhadas(List<Double> horasTrabalhadas) {
		if (horasTrabalhadas != null)
			this.horasTrabalhadas = horasTrabalhadas;
	}

	public List<Double> getValorHora() {
		return valorHora;
	}

	public void setValorHora(List<Double> valorHora) {
		if (valorHora != null)
			this.valorHora = valorHora;
	}

	public Date getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Date dataNascimento) {
		if (dataNascimento != null)
			this.dataNascimento = dataNascimento;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Funcionario [nome=");
		builder.append(nome);
		builder.append(", email=");
		builder.append(email);
		builder.append(", sexo=");
		builder.append(sexo);
		builder.append(", horasTrabalhadas=");
		builder.append(horasTrabalhadas);
		builder.append(", valorHora=");
		builder.append(valorHora);
		builder.append(", dataNascimento=");
		builder.append(dataNascimento);
		builder.append(", toString()=");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}

}
