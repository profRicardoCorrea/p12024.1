package entidades;

public class Denunciante extends Pessoa {
    private int codigo;

    // Construtor padrão
    public Denunciante() {
    }

    // Construtor sobrecarregado
    public Denunciante(int id,int codigo, String nome, String contato, String cpf) {
        super(id, nome, contato,cpf);
        this.codigo=codigo;
        
    }

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

    
}

