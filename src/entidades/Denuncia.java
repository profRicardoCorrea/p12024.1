package entidades;

import java.util.Date;

public class Denuncia {
    private int id;
    private String descricao;
    private Date data;
    private Autoridade autoridadeDenunciada;
    private String status;
    private Denunciante denunciante;

    // Construtor padrão
    public Denuncia() {
    }

    // Construtor sobrecarregado
    public Denuncia(int id, String descricao, Date data, Autoridade autoridadeDenunciada, String status, Denunciante denunciante) {
        this.id = id;
        this.descricao = descricao;
        this.data = data;
        this.autoridadeDenunciada = autoridadeDenunciada;
        this.status = status;
        this.denunciante = denunciante;
    }

    // Getters e Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public Autoridade getAutoridadeDenunciada() {
        return autoridadeDenunciada;
    }

    public void setAutoridadeDenunciada(Autoridade autoridadeDenunciada) {
        this.autoridadeDenunciada = autoridadeDenunciada;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Denunciante getDenunciante() {
        return denunciante;
    }

    public void setDenunciante(Denunciante denunciante) {
        this.denunciante = denunciante;
    }
}

