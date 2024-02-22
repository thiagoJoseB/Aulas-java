package Aula_1;

import javax.swing.JOptionPane;

public class Vida extends Pessoa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Pessoa pessoa1 = new Pessoa();
		pessoa1.nome = "Messi";
		pessoa1.idade = 12;
		
		Pessoa pessoa2 = new Pessoa();
		pessoa2.nome = "Cristiano";
		pessoa2.idade = 16;
		
		
		System.out.println("O nome da pessoa1 é " + pessoa1.nome);
		JOptionPane.showMessageDialog(null, "Idade da pessoa2 é : " + pessoa2.idade);
		

	}

}
