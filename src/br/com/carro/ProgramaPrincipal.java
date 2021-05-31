package br.com.carro;

public class ProgramaPrincipal {

	public static void main(String[] args) {
		System.out.println("--PESSOA 1--");
		Carro carro1 = new Carro;
		carro1.setNome("Lays");
		carro1.setAnoDeNascimento(2004);
		carro1.setSexo("F");
		
		System.out.println(carro1.getNome());
		System.out.println(carro1.getAnoDeNascimento());
		System.out.println(carro1.getSexo());
		
		System.out.println("--PESSOA 2--");
		Pessoa carro2 = new Pessoa();
		carro2.setNome("Lucas");
		carro2.setAnoDeNascimento(1998);
		carro2.setSexo("M");
		
		System.out.println(carro2.getNome());
		System.out.println(carro2.getAnoDeNascimento());
		System.out.println(carro2.getSexo());
		
		System.out.println("--PESSOA 3--");
		Pessoa carro3 = new Pessoa();
		carro3.setNome("Marlene");
		carro3.setAnoDeNascimento(1959);
		carro3.setSexo("F");
		
		System.out.println(carro3.getNome());
		System.out.println(carro3.getAnoDeNascimento());
		System.out.println(carro3.getSexo());
		
		System.out.println("--PESSOA 4--");
		Pessoa carro4 = new Pessoa();
		carro4.setNome("Isabela");
		carro4.setAnoDeNascimento(2013);
		carro4.setSexo("F");
		
		System.out.println(carro4.getNome());
		System.out.println(carro4.getAnoDeNascimento());
		System.out.println(carro4.getSexo());


	}

}
