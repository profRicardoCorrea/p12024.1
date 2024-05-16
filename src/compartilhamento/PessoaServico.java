package compartilhamento;

import java.util.ArrayList;

import entidades.Pessoa;

public class PessoaServico {
	private ArrayList<Pessoa> pessoas=null;
	public PessoaServico(ArrayList<Pessoa> pessoas) {
		this.pessoas=pessoas;
	}
	 public void salvar(Pessoa p) {
		 pessoas.add(p);
	 }
	 public void listar() {
		 for(Pessoa p:pessoas) {
			 System.out.println("Nome:"+p.getNome());
		 }
	 }

}
