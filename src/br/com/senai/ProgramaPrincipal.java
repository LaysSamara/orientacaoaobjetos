package br.com.senai;

public class ProgramaPrincipal {

	public static void main(String[] args) {
		
		Pessoa pessoa1 = new Pessoa();
		
		System.out.println("--PESSOA 1--");
		pessoa1.setNome("Lays");
		pessoa1.setAnoDeNascimento(2004);
		pessoa1.setSexo("F");
		
		System.out.println(pessoa1.getNome());
		System.out.println(pessoa1.getAnoDeNascimento());
		System.out.println(pessoa1.getSexo());
		
		System.out.println("--PESSOA 2--");
		Pessoa pessoa2 = new Pessoa();
		pessoa2.setNome("Lucas");
		pessoa2.setAnoDeNascimento(1998);
		pessoa2.setSexo("M");
		
		System.out.println(pessoa2.getNome());
		System.out.println(pessoa2.getAnoDeNascimento());
		System.out.println(pessoa2.getSexo());
		
		System.out.println("--PESSOA 3--");
		Pessoa pessoa3 = new Pessoa();
		pessoa3.setNome("Marlene");
		pessoa3.setAnoDeNascimento(1959);
		pessoa3.setSexo("F");
		
		System.out.println(pessoa3.getNome());
		System.out.println(pessoa3.getAnoDeNascimento());
		System.out.println(pessoa3.getSexo());
		
		System.out.println("--PESSOA 4--");
		Pessoa pessoa4 = new Pessoa();
		pessoa4.setNome("Isabela");
		pessoa4.setAnoDeNascimento(2013);
		pessoa4.setSexo("F");
		
		System.out.println(pessoa4.getNome());
		System.out.println(pessoa4.getAnoDeNascimento());
		System.out.println(pessoa4.getSexo());

	}

}
