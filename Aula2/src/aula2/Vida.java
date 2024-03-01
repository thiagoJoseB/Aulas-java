package aula2;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Vida extends Pessoa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Pessoa pessoa1 = new Pessoa();
		
		// get and setters
		pessoa1.setNome("Lucas Fresno");
		pessoa1.setIdade(30);
		
		
		/// Usuario pode inserir os dados na caixa de texto
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Informe o nome do usuario");
		pessoa1.nome = scanner.nextLine();
		
		System.out.println("Informe a idade do usuario");
		pessoa1.idade = scanner.nextInt();
		
	
		JOptionPane.showMessageDialog(null, "Nome da pessoa1 é: " + pessoa1.getNome() +
		"\n Idade da pessoa1 é: " + pessoa1.getIdade() + " anos");
		
		
		
		

	}

}
