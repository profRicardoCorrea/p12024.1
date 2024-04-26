package servicos;

import java.util.ArrayList;
import java.util.List;

import entidades.Autoridade;
import repositorios.AutoridadeRepository;

public class AutoridadeService {
	private AutoridadeRepository autoridadeRepository;
    public AutoridadeService(AutoridadeRepository autoridadeRepository) {
		 
		this.autoridadeRepository = autoridadeRepository;
	}

	 
    // Adiciona uma nova autoridade ao sistema
    public void adicionarAutoridade(Autoridade autoridade) throws Exception {
        validarAutoridade(autoridade);
        this.autoridadeRepository.adicionarAutoridade(autoridade);
    }

 // Atualiza uma autoridade existente
    public void atualizarAutoridade(Autoridade autoridade) throws Exception {
        validarAutoridade(autoridade);
        autoridadeRepository.atualizarAutoridade(autoridade);
    }

    // Deleta uma autoridade
    public void deletarAutoridade(Autoridade autoridade) {
    	Autoridade autoridade_busca = autoridadeRepository.buscarPorId(autoridade.getId());
        autoridadeRepository.removerAutoridade(autoridade_busca);
    }

    // Busca uma autoridade pelo ID
    public Autoridade buscarAutoridadePorId(int id) {
        return autoridadeRepository.buscarPorId(id);
    }

    // Lista todas as autoridades
    public List<Autoridade> listarTodasAutoridades() {
        return autoridadeRepository.listarAutoridades();
    }

    
    // Valida os dados de uma autoridade
    private void validarAutoridade(Autoridade autoridade) throws Exception {
        if (autoridade.getNome() == null || autoridade.getNome().trim().isEmpty()) {
            throw new Exception("Nome da autoridade é obrigatório!");
        }
        if (autoridade.getCargo() == null || autoridade.getCargo().trim().isEmpty()) {
            throw new Exception("Cargo da autoridade é obrigatório!");
        }
        if (autoridade.getInstituicao() == null || autoridade.getInstituicao().trim().isEmpty()) {
            throw new Exception("Instituição da autoridade é obrigatória!");
        }
    }
}

