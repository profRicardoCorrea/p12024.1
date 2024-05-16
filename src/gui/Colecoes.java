package gui;

import java.util.ArrayList;
import java.util.Iterator;

import entidades.Pessoa;

public class Colecoes {
	public static void main(String[] args) {
		Pessoa[] myNum = {null,null,null};
		Pessoa p1=new Pessoa();
		p1.setNome("Fulano");
		Pessoa p2=new Pessoa();
		p2.setNome("Ciclano");
		myNum[0]=p1;
		myNum[0]=p2;
		ArrayList<Pessoa> lista_pessoas = new ArrayList<Pessoa>();
		lista_pessoas.add(p1);
		lista_pessoas.add(new Pessoa("Beltrano"));
		lista_pessoas.add(new Pessoa("Beltrano"));
		lista_pessoas.add(new Pessoa("Beltrano"));
		lista_pessoas.add(new Pessoa("Beltrano"));
		lista_pessoas.add(new Pessoa("Beltrano"));
		lista_pessoas.add(new Pessoa("Beltrano"));
		lista_pessoas.add(new Pessoa("Beltrano"));
		lista_pessoas.add(new Pessoa("Beltrano"));
		lista_pessoas.add(new Pessoa("Beltrano"));
		lista_pessoas.add(p2);
		//lista_pessoas.add(0,p2);
		lista_pessoas.contains(p1);
		System.out.println(p2);
		//lista_pessoas.forEach(null);
		
		for (Pessoa p: lista_pessoas) {
			if(p.getNome().equals("Beltrano")) {
				System.out.println(p.getNome());
				break;
			}
			
		}
		
	}

}
