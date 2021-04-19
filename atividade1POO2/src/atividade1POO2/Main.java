package atividade1POO2;

import java.util.Calendar;
import java.util.Date;

public class Main {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {

		Funcionario funcionario = new Funcionario();
		funcionario.setUsuario("alberto123");
		funcionario.setSenha("salgadinho7777");
		funcionario.setNome("Alberto");
		funcionario.setEmail("albertinho@email.com");
		funcionario.setSexo('m');
		funcionario.setDataNascimento(new Date(90, (12)-1, 15));
		
		funcionario.getHorasTrabalhadas().add(62.0);
		funcionario.getHorasTrabalhadas().add(61.0);
		funcionario.getHorasTrabalhadas().add(61.5);
		funcionario.getHorasTrabalhadas().add(62.0);
		funcionario.getHorasTrabalhadas().add(62.0);
		funcionario.getHorasTrabalhadas().add(61.0);
		funcionario.getHorasTrabalhadas().add(61.5);
		funcionario.getHorasTrabalhadas().add(62.0);
		funcionario.getHorasTrabalhadas().add(62.0);
		funcionario.getHorasTrabalhadas().add(61.0);
		funcionario.getHorasTrabalhadas().add(61.5);
		funcionario.getHorasTrabalhadas().add(62.0);
		funcionario.getHorasTrabalhadas().add(62.0);
		funcionario.getHorasTrabalhadas().add(61.0);
		funcionario.getHorasTrabalhadas().add(61.5);
		funcionario.getHorasTrabalhadas().add(62.0);
		
		funcionario.getValorHora().add(30.0);
		funcionario.getValorHora().add(30.0);
		funcionario.getValorHora().add(35.0);
		funcionario.getValorHora().add(35.0);
		funcionario.getValorHora().add(36.0);
		funcionario.getValorHora().add(36.0);
		funcionario.getValorHora().add(37.0);
		funcionario.getValorHora().add(37.0);
		funcionario.getValorHora().add(30.0);
		funcionario.getValorHora().add(30.0);
		funcionario.getValorHora().add(35.0);
		funcionario.getValorHora().add(35.0);
		funcionario.getValorHora().add(36.0);
		funcionario.getValorHora().add(36.0);
		funcionario.getValorHora().add(37.0);
		funcionario.getValorHora().add(37.0);
		
		System.out.println(funcionario.toString());
		
		System.out.println("Salário por mês:");
		double maiores[] = new double[2];
		maiores[0] = Double.MIN_VALUE;
		maiores[1] = Double.MIN_VALUE;
		double menores[] = new double[2];
		menores[0] = Double.MAX_VALUE;
		menores[1] = Double.MAX_VALUE;
		double total = 0;
		double trabalhado = 0;
		for (int i = 0; i < funcionario.getHorasTrabalhadas().size(); i++) {
			double salario = funcionario.getHorasTrabalhadas().get(i) * funcionario.getValorHora().get(i);
			System.out.println(i + " = " + salario);
			total += salario;
			
			if (salario > maiores[0]) {
				maiores[1] = maiores[0];
				maiores[0] = salario;
			}
			if (salario < menores[0]) {
				menores[1] = menores[0];
				menores[0] = salario;
			}
			trabalhado += funcionario.getHorasTrabalhadas().get(i);
		}
		System.out.println("Valor total de todos os salários: " + total);
		System.out.println("Média de salários: " + total/funcionario.getHorasTrabalhadas().size());
		System.out.println("Maiores salários:");
		for (int i = 0; i < maiores.length; i++) {
			System.out.println(maiores[i]);
		}
		System.out.println("Menores salários:");
		for (int i = 0; i < menores.length; i++) {
			System.out.println(menores[i]);
		}
		trabalhado = trabalhado/24;
		int anos = (int) (trabalhado/365);
		int meses = (int) ((trabalhado%365)/30.416);
		System.out.println("Número de meses trabalhados: " + meses + " meses");
		System.out.println("Número de anos e meses trabalhados: " + anos + " anos e " + meses + " meses");
		
		int anoIdade;
		if (funcionario.getSexo() == 'f') {
			anoIdade = funcionario.getDataNascimento().getYear()+1962;
			System.out.println("Ano de aposentadoria (idade): " + anoIdade);
		} else {
			anoIdade = funcionario.getDataNascimento().getYear()+1965;
			System.out.println("Ano de aposentadoria (idade): " + anoIdade);
		}
		
		int anoContribuicao = Calendar.getInstance().get(Calendar.YEAR) + 35; 
		System.out.println("Ano de aposentadoria (contribuição): " + anoContribuicao);
		
		if (anoContribuicao > anoIdade) {
			System.out.println("Ano de aposentadoria (mínimo): " + anoContribuicao);
		} else {
			System.out.println("Ano de aposentadoria (mínimo): " + anoIdade);
		}
		
	}

}
