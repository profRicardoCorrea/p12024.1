package compartilhamento;

import java.util.ArrayList;

import entidades.Pessoa;

public class Main {
	public static ArrayList<Pessoa> pessoas=new ArrayList<Pessoa>();
	
	public static void main(String[] args) {
		PessoaServico ps=new PessoaServico(pessoas);
		FuncionarioServico fs=new FuncionarioServico(pessoas);
		ps.salvar(new Pessoa("A"));
		fs.salvar(new Pessoa("F"));
		ps.listar();
		fs.listar();
		fs.salvar(new Pessoa("G"));
		ps.salvar(new Pessoa("B"));
		fs.salvar(new Pessoa("H"));
		ps.salvar(new Pessoa("C"));
		//ps.listar();
		//fs.listar();
		
		
		
		
		
		
		
		
	}

}
