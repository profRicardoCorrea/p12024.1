package repositorios;

import java.util.ArrayList;
import java.util.List;

import entidades.Autoridade;

public class AutoridadeRepository {
    private List<Autoridade> autoridades = new ArrayList<>();

    // Adiciona uma nova autoridade
    public void adicionarAutoridade(Autoridade autoridade) {
        autoridades.add(autoridade);
    }
 // Atualiza uma autoridade existente
    public void atualizarAutoridade(Autoridade autoridade) {
        Autoridade found = buscarPorId(autoridade.getId());
        if (found != null) {
            found.setNome(autoridade.getNome());
            found.setContato(autoridade.getContato());
            found.setCargo(autoridade.getCargo());
            found.setInstituicao(autoridade.getInstituicao());
        }
    }
    // Remove uma autoridade
    public void removerAutoridade(Autoridade autoridade) {
        autoridades.remove(autoridade);
    }

    // Busca uma autoridade pelo ID
    public Autoridade buscarPorId(int id) {
        for (Autoridade autoridade : autoridades) {
            if (autoridade.getId() == id) {
                return autoridade;
            }
        }
        return null;
    }
    
 // Busca uma autoridade pelo ID
    public Autoridade buscarPorNome(String nome) {
        for (Autoridade autoridade : autoridades) {
            if (autoridade.getNome() == nome) {
                return autoridade;
            }
        }
        return null;
    }

    // Lista todas as autoridades
    public List<Autoridade> listarAutoridades() {
        return new ArrayList<>(autoridades);
    }
}

