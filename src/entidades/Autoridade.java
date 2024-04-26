package entidades;

public class Autoridade extends Pessoa {
    private String cargo;
    private String instituicao;

    // Construtor padrão
    public Autoridade() {
    }

    // Construtor sobrecarregado
    public Autoridade(int id, String nome, String contato, String cargo, String instituicao, String cpf) {
        super(id, nome, contato,cpf);
        this.cargo = cargo;
        this.instituicao = instituicao;
    }

    // Getters e Setters
    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getInstituicao() {
        return instituicao;
    }

    public void setInstituicao(String instituicao) {
        this.instituicao = instituicao;
    }
}

