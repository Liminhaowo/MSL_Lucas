import java.util.ArrayList;
import java.util.Scanner;

public class SistemaGerenciamentoNomes {

    public static void main(String[] args) {
        
        ArrayList<String> nomes = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int opcao = 0;

        System.out.println("=== Bem-vindo ao Progama de Gerenciamento de Nicknames ===");

        while (opcao != 5) {
         
            System.out.println("\n--- MENU ---");
            System.out.println("1 - Cadastrar nick");
            System.out.println("2 - Listar nick's cadastrados");
            System.out.println("3 - Atualizar um nick existente");
            System.out.println("4 - Remover um nick");
            System.out.println("5 - Fugir do sistema");
            System.out.print("Escolha uma opção: ");

            
            if (scanner.hasNextInt()) {
                opcao = scanner.nextInt();
                scanner.nextLine(); 
            } else {
                System.out.println("Please, digite um número adequado.");
                scanner.nextLine(); 
                continue; 
            }

            
            switch (opcao) {
                case 1:
                    System.out.print("Digite o nick para cadastrar: ");
                    String novoNome = scanner.nextLine();
                    nomes.add(novoNome);
                    System.out.println("Nick cadastrado com sucesso!");
                    break;

                case 2: 
                    System.out.println("\n--- Lista de Nicks ---");
                    if (nomes.isEmpty()) {
                        System.out.println("A lista está vazia.");
                    } else {
                        for (int i = 0; i < nomes.size(); i++) {
                            
                            System.out.println((i + 1) + ". " + nomes.get(i));
                        }
                    }
                    break;

                case 3: 
                    System.out.println("\n--- Atualizar Nome ---");
                    if (nomes.isEmpty()) {
                        System.out.println("Não há nick para atualizar.");
                    } else {
                        
                        for (int i = 0; i < nomes.size(); i++) {
                            System.out.println((i + 1) + ". " + nomes.get(i));
                        }
                        
                        System.out.print("Digite o número do nick que deseja atualizar: ");
                        int indiceAtualizar = scanner.nextInt() - 1; 
                        scanner.nextLine(); 

                        if (indiceAtualizar >= 0 && indiceAtualizar < nomes.size()) {
                            System.out.print("Digite o nick nome: ");
                            String nomeAtualizado = scanner.nextLine();
                            nomes.set(indiceAtualizar, nomeAtualizado);
                            System.out.println("Nick atualizado com sucesso!");
                        } else {
                            System.out.println("Número inválido.");
                        }
                    }
                    break;

                case 4: 
                    System.out.println("\n--- Remover Nick ---");
                    if (nomes.isEmpty()) {
                        System.out.println("Não há nick's para remover.");
                    } else {
                        for (int i = 0; i < nomes.size(); i++) {
                            System.out.println((i + 1) + ". " + nomes.get(i));
                        }

                        System.out.print("Digite o número do nick que deseja remover: ");
                        int indiceRemover = scanner.nextInt() - 1; 
                        scanner.nextLine(); 

                        if (indiceRemover >= 0 && indiceRemover < nomes.size()) {
                            String nomeRemovido = nomes.remove(indiceRemover);
                            System.out.println("O nome '" + nomeRemovido + "' foi removido.");
                        } else {
                            System.out.println("Número inválido.");
                        }
                    }
                    break;

                case 5: 
                    System.out.println("Encerrando o sistema...");
                    break;

                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
        }

        scanner.close();
    }
}