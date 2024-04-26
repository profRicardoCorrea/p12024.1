package view;

import javax.swing.JOptionPane;

import entidades.Autoridade;
import entidades.Denunciante;
import servicos.AutoridadeService;
import servicos.DenunciaService;
import servicos.DenuncianteService;

public class MainJOptionPane {
    private static DenunciaService denunciaService = new DenunciaService();
    private static AutoridadeService autoridadeService = new AutoridadeService();
    private static DenuncianteService denuncianteService = new DenuncianteService();

    public static void main(String[] args) {
        boolean sair = false;
        while (!sair) {
            String opcao = JOptionPane.showInputDialog(null, 
                "### Sistema de Denúncia de Autoridades ###\n"
                + "1. Adicionar Autoridade\n"
                + "2. Adicionar Denunciante\n"
                + "3. Registrar Denúncia\n"
                + "4. Listar Todas as Denúncias\n"
                + "0. Sair\n"
                + "Escolha uma opção:", 
                "Menu Principal", JOptionPane.QUESTION_MESSAGE);

            if (opcao == null) {
                sair = true; // Usuário clicou em cancelar
            } else {
                switch (opcao) {
                    case "1":
                        adicionarAutoridade();
                        break;
                    case "2":
                        adicionarDenunciante();
                        break;
                    case "3":
                        registrarDenuncia();
                        break;
                    case "4":
                        listarDenuncias();
                        break;
                    case "0":
                        sair = true;
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Opção inválida! Tente novamente.", "Erro", JOptionPane.ERROR_MESSAGE);
                        break;
                }
            }
        }
    }

    private static void adicionarAutoridade() {
        String nome = JOptionPane.showInputDialog(null, "Nome da Autoridade:", "Adicionar Autoridade", JOptionPane.QUESTION_MESSAGE);
        String contato = JOptionPane.showInputDialog(null, "Contato da Autoridade:", "Adicionar Autoridade", JOptionPane.QUESTION_MESSAGE);
        String cargo = JOptionPane.showInputDialog(null, "Cargo da Autoridade:", "Adicionar Autoridade", JOptionPane.QUESTION_MESSAGE);
        String instituicao = JOptionPane.showInputDialog(null, "Instituição da Autoridade:", "Adicionar Autoridade", JOptionPane.QUESTION_MESSAGE);
        Autoridade autoridade = new Autoridade(0, nome, contato, cargo, instituicao);
        try {
            autoridadeService.adicionarAutoridade(autoridade);
            JOptionPane.showMessageDialog(null, "Autoridade adicionada com sucesso!", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao adicionar autoridade: " + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }

    private static void adicionarDenunciante() {
        String nome = JOptionPane.showInputDialog(null, "Nome do Denunciante:", "Adicionar Denunciante", JOptionPane.QUESTION_MESSAGE);
        String contato = JOptionPane.showInputDialog(null, "Contato do Denunciante:", "Adicionar Denunciante", JOptionPane.QUESTION_MESSAGE);
        String cpf = JOptionPane.showInputDialog(null, "CPF do Denunciante:", "Adicionar Denunciante", JOptionPane.QUESTION_MESSAGE);
        Denunciante denunciante = new Denunciante(0, nome, contato, cpf);
        try {
            denuncianteService.adicionarDenunciante(denunciante);
            JOptionPane.showMessageDialog(null, "Denunciante adicionado com sucesso!", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao adicionar denunciante: " + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }

    private static void registrarDenuncia() {
        // Implementação de registrar denúncia com JOptionPane
    }

    private static void listarDenuncias() {
        // Implementação de listar denúncias com JOptionPane
    }
}

