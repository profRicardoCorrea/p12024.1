package repositorios;

import java.util.ArrayList;
import java.util.List;

import entidades.Denuncia;

public class DenunciaRepository {
    private List<Denuncia> denuncias = new ArrayList<>();

    // Adiciona uma nova denúncia
    public void adicionarDenuncia(Denuncia denuncia) {
        denuncias.add(denuncia);
    }
    
 // Atualiza uma denúncia existente
    public void atualizarDenuncia(Denuncia denuncia) {
        Denuncia found = buscarPorId(denuncia.getId());
        if (found != null) {
            found.setDescricao(denuncia.getDescricao());
            found.setData(denuncia.getData());
            found.setAutoridadeDenunciada(denuncia.getAutoridadeDenunciada());
            found.setStatus(denuncia.getStatus());
            found.setDenunciante(denuncia.getDenunciante());
        }
    }

    // Remove uma denúncia
    public void removerDenuncia(Denuncia denuncia) {
        denuncias.remove(denuncia);
    }

    // Busca uma denúncia pelo ID
    public Denuncia buscarPorId(int id) {
        for (Denuncia denuncia : denuncias) {
            if (denuncia.getId() == id) {
                return denuncia;
            }
        }
        return null;
    }

    // Lista todas as denúncias
    public List<Denuncia> listarDenuncias() {
        return new ArrayList<>(denuncias);
    }
}

