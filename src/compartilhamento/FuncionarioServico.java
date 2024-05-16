package compartilhamento;

import java.util.ArrayList;

import entidades.Pessoa;

public class FuncionarioServico {
	ArrayList<Pessoa> funcionarios=null;
	
	public FuncionarioServico(ArrayList<Pessoa> funcionarios) {
		this.funcionarios=funcionarios;
	}
	 public void salvar(Pessoa p) {
		 funcionarios.add(p);
	 }
	 public void listar() {
		 for(Pessoa f:funcionarios) {
			 System.out.println("Nome:"+f.getNome());
		 }
	 }
}
