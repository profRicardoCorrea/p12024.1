package view;

import java.util.Scanner;

import entidades.Autoridade;
import entidades.Denunciante;
import servicos.AutoridadeService;
import servicos.DenunciaService;
import servicos.DenuncianteService;

public class MainScanner {
    private static DenunciaService denunciaService = new DenunciaService();
    private static AutoridadeService autoridadeService = new AutoridadeService();
    private static DenuncianteService denuncianteService = new DenuncianteService();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean sair = false;
        while (!sair) {
            exibirMenuPrincipal();
            int opcao = scanner.nextInt();
            scanner.nextLine(); // Consumir nova linha
            switch (opcao) {
                case 1:
                    adicionarAutoridade();
                    break;
                case 2:
                    adicionarDenunciante();
                    break;
                case 3:
                    registrarDenuncia();
                    break;
                case 4:
                    listarDenuncias();
                    break;
                case 0:
                    sair = true;
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
                    break;
            }
        }
    }

    private static void exibirMenuPrincipal() {
        System.out.println("\n### Sistema de Denúncia de Autoridades ###");
        System.out.println("1. Adicionar Autoridade");
        System.out.println("2. Adicionar Denunciante");
        System.out.println("3. Registrar Denúncia");
        System.out.println("4. Listar Todas as Denúncias");
        System.out.println("0. Sair");
        System.out.println("Escolha uma opção: ");
    }

    private static void adicionarAutoridade() {
        System.out.println("Adicionar nova Autoridade:");
        System.out.print("Nome: ");
        String nome = scanner.nextLine();
        System.out.print("Contato: ");
        String contato = scanner.nextLine();
        System.out.print("Cargo: ");
        String cargo = scanner.nextLine();
        System.out.print("Instituição: ");
        String instituicao = scanner.nextLine();
        Autoridade autoridade = new Autoridade(0, nome, contato, cargo, instituicao);
        try {
            autoridadeService.adicionarAutoridade(autoridade);
            System.out.println("Autoridade adicionada com sucesso!");
        } catch (Exception e) {
            System.out.println("Erro ao adicionar autoridade: " + e.getMessage());
        }
    }

    private static void adicionarDenunciante() {
        System.out.println("Adicionar novo Denunciante:");
        System.out.print("Nome: ");
        String nome = scanner.nextLine();
        System.out.print("Contato: ");
        String contato = scanner.nextLine();
        System.out.print("CPF: ");
        String cpf = scanner.nextLine();
        Denunciante denunciante = new Denunciante(0, nome, contato, cpf);
        try {
            denuncianteService.adicionarDenunciante(denunciante);
            System.out.println("Denunciante adicionado com sucesso!");
        } catch (Exception e) {
            System.out.println("Erro ao adicionar denunciante: " + e.getMessage());
        }
    }

    private static void registrarDenuncia() {
        // Implementação similar a adicionarAutoridade e adicionarDenunciante
    }

    private static void listarDenuncias() {
        // Implementação para listar denúncias
    }
}

