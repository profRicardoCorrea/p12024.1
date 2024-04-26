package repositorios;

import java.util.ArrayList;
import java.util.List;

import entidades.Denunciante;

public class DenuncianteRepository {
    private List<Denunciante> denunciantes = new ArrayList<>();

    // Adiciona um novo denunciante
    public void adicionarDenunciante(Denunciante denunciante) {
        denunciantes.add(denunciante);
    }
    public void atualizarDenunciante(Denunciante denunciante) {
        Denunciante found = buscarPorId(denunciante.getId());
        if (found != null) {
            found.setNome(denunciante.getNome());
            found.setContato(denunciante.getContato());
            found.setCpf(denunciante.getCpf());
        }
    }
    // Remove um denunciante
    public void removerDenunciante(Denunciante denunciante) {
        denunciantes.remove(denunciante);
    }

    // Busca um denunciante pelo ID
    public Denunciante buscarPorId(int id) {
        for (Denunciante denunciante : denunciantes) {
            if (denunciante.getId() == id) {
                return denunciante;
            }
        }
        return null;
    }

    // Lista todos os denunciantes
    public List<Denunciante> listarDenunciantes() {
        return new ArrayList<>(denunciantes);
    }
}

