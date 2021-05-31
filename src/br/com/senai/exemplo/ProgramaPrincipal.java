package br.com.senai.exemplo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import br.com.carro.MetodoController;

public class ProgramaPrincipal {

	public static void main(String[] args) {
		
		List<Pessoa> pessoa = new ArrayList<Pessoa>();
		Pessoa pessoa1 = new Pessoa();
		
		System.out.println("--- PESSOAS CADASTRADAS ---");
		//"--PESSOA 1--
		pessoa1.setNome("Lays");
		pessoa1.setAnoDeNascimento(2004);
		pessoa1.setSexo("F");
		
		//--PESSOA 2--
		Pessoa pessoa2 = new Pessoa();
		pessoa2.setNome("Lucas");
		pessoa2.setAnoDeNascimento(1998);
		pessoa2.setSexo("M");
		
		//--PESSOA 3--
		Pessoa pessoa3 = new Pessoa();
		pessoa3.setNome("Marlene");
		pessoa3.setAnoDeNascimento(1959);
		pessoa3.setSexo("F");

		//--PESSOA 4
		Pessoa pessoa4 = new Pessoa();
		pessoa4.setNome("Isabela");
		pessoa4.setAnoDeNascimento(2013);
		pessoa4.setSexo("F");
		
		pessoa.add(pessoa1);
		pessoa.add(pessoa2);
		pessoa.add(pessoa3);
		pessoa.add(pessoa4);
		
		for(Pessoa people : pessoa) {
			System.out.println(people);
			System.out.println("--------------------------------------------");
		}
		
		Scanner tec = new Scanner(System.in);
		MetodoController metodoController = new MetodoController();
		
		System.out.println("---TABUADA---");
		metodoController.multiplicar();
		System.out.println("---------------------------");
		
		System.out.println("--- SOMA DE DOIS VALORES ---");
		System.out.println("A soma dá:" + metodoController.somar());
		System.out.println("---------------------------");
		
		System.out.println("--- SUBTRAÇÃO DE VALORES por parâmetro ---");
		System.out.print("Informe o primeiro valor: ");
		int valor1 = tec.nextInt();
		System.out.print("Informe o segundo valor: ");
		int valor2 = tec.nextInt();
		System.out.println("A subtração dá: " + metodoController.subtrair(valor1,valor2));
		System.out.println("---------------------------");
		
	//	System.out.println("-> " + pessoa.get(0).getNome());
		
	}
}
