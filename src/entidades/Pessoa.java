package entidades;

public  class Pessoa {
    private int id;
    private String nome;
    private String contato;
    private String cpf;

    // Construtor padrão
    public Pessoa(String nome) {
    	this.nome =nome;
    }
    
    public Pessoa(String nome,String cpf) {
    	this.nome =nome;
    	this.cpf=cpf;
    }

    // Construtor sobrecarregado
    public Pessoa(int id, String nome, String contato, String cpf) {
        this.id = id;
        this.nome = nome;
        this.contato = contato;
        this.cpf = cpf;
    }
    
   // public Pessoa() {}

    // Getters e Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getContato() {
        return contato;
    }

    public void setContato(String contato) {
        this.contato = contato;
    }
    
    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}

