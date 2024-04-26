package servicos;

import java.util.ArrayList;
import java.util.List;

import entidades.Denunciante;

public class DenuncianteService {
    private List<Denunciante> denunciantes = new ArrayList<>();

    // Adiciona um novo denunciante ao sistema
    public void adicionarDenunciante(Denunciante denunciante) throws Exception {
        validarDenunciante(denunciante);
        denunciantes.add(denunciante);
    }
 // Atualiza uma denúncia existente
    public void atualizarDenuncia(Denuncia denuncia) throws Exception {
        validarDenuncia(denuncia);
        denunciaRepository.atualizarDenuncia(denuncia);
    }

    // Deleta uma denúncia
    public void deletarDenuncia(int id) {
        denunciaRepository.removerDenuncia(id);
    }

    // Busca uma denúncia pelo ID
    public Denuncia buscarDenunciaPorId(int id) {
        return denunciaRepository.buscarPorId(id);
    }

    // Lista todas as denúncias
    public List<Denuncia> listarTodasDenuncias() {
        return denunciaRepository.listarDenuncias();
    }

    // Valida os dados de um denunciante
    private void validarDenunciante(Denunciante denunciante) throws Exception {
        if (denunciante.getNome() == null || denunciante.getNome().trim().isEmpty()) {
            throw new Exception("Nome do denunciante é obrigatório!");
        }
        if (denunciante.getCpf() == null || denunciante.getCpf().trim().isEmpty()) {
            throw new Exception("CPF do denunciante é obrigatório!");
        }
    }
}

