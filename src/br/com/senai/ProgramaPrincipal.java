package br.com.senai;

public class ProgramaPrincipal {

	public static void main(String[] args) {
		
		Pessoa pessoa1 = new Pessoa();
		
		pessoa1.setNome("Lays");
		pessoa1.setAnoDeNascimento(2004);
		pessoa1.setSexo("F");
		
		System.out.println(pessoa1.getNome());
		System.out.println(pessoa1.getAnoDeNascimento());
		System.out.println(pessoa1.getSexo());


	}

}
