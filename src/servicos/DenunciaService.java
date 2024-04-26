package servicos;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import entidades.Denuncia;

public class DenunciaService {
    private List<Denuncia> denuncias = new ArrayList<>();

    // Adiciona uma nova denúncia ao sistema
    public void adicionarDenuncia(Denuncia denuncia) throws Exception {
        validarDenuncia(denuncia);
        denuncia.setStatus("Aberta");
        denuncias.add(denuncia);
    }
    
 // Atualiza um denunciante existente
    public void atualizarDenunciante(Denunciante denunciante) throws Exception {
        validarDenunciante(denunciante);
        denuncianteRepository.atualizarDenunciante(denunciante);
    }

    // Deleta um denunciante
    public void deletarDenunciante(int id) {
        denuncianteRepository.removerDenunciante(id);
    }

    // Busca um denunciante pelo ID
    public Denunciante buscarDenunciantePorId(int id) {
        return denuncianteRepository.buscarPorId(id);
    }

    // Lista todos os denunciantes
    public List<Denunciante> listarTodosDenunciantes() {
        return denuncianteRepository.listarDenunciantes();
    }

    // Atualiza uma denúncia existente
    public void atualizarDenuncia(Denuncia denuncia) throws Exception {
        validarDenuncia(denuncia);
        int index = denuncias.indexOf(denuncia);
        if (index != -1) {
            denuncias.set(index, denuncia);
        } else {
            throw new Exception("Denúncia não encontrada!");
        }
    }

    // Valida os dados de uma denúncia
    private void validarDenuncia(Denuncia denuncia) throws Exception {
        if (denuncia.getDescricao() == null || denuncia.getDescricao().trim().isEmpty()) {
            throw new Exception("Descrição da denúncia é obrigatória!");
        }
        if (denuncia.getData() == null || denuncia.getData().after(new Date())) {
            throw new Exception("Data da denúncia não pode ser futura!");
        }
        if (denuncia.getAutoridadeDenunciada() == null) {
            throw new Exception("Autoridade denunciada deve ser especificada!");
        }
    }
}
