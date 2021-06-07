package br.com.senai.pessoa;

import java.util.ArrayList;
import java.util.List;

public class ProgramaPrincipal {

	public static void main(String[] args) {
		List<Pessoa> pessoas = new ArrayList<>();
		
		PessoaController pessoaController = new PessoaController();
		
		boolean sair = false;
		
		do {
			pessoaController.menu();

			int opcao = pessoaController.lerOpcao();
				
			switch(opcao){
				case 1:
					pessoas.add(pessoaController.cadastrarPessoa());
					System.out.println("                     ");
					break;
					
				case 2:
					pessoaController.listarPessoas(pessoas);
					break;
					
				case 9:
					sair = true;
					break;
					
				default:
					System.out.println("Op��o inv�lida.");
					
					System.out.println("                     ");
					break;
				}
			
		}while(!sair);
			System.out.print("Sistema finalizado.");
		}
		
	}

