import Controle.Controlador;
import Modelo.EletricosM;
import Modelo.ComprasM;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Teste com ComprasM
        ComprasM compra1 = new ComprasM("Arroz", 10.0f, 20, true);
        System.out.println("Preço Unitário com Desconto (se atacado): " + compra1.getPrecoUnitario());

        ComprasM compra2 = new ComprasM("Feijão", 8.0f, 10, false);
        System.out.println("Preço Unitário sem Desconto: " + compra2.getPrecoUnitario());

        // Controle de Equipamentos Elétricos
        Scanner scanner = new Scanner(System.in);
        Controlador controlador = new Controlador();

        while (true) {
            System.out.println("\n=== MENU ===");
            System.out.println("1 - Cadastrar Equipamento");
            System.out.println("2 - Buscar por Marca");
            System.out.println("3 - Buscar por Tipo");
            System.out.println("4 - Remover Equipamento");
            System.out.println("5 - Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine(); // Consumir a quebra de linha

            switch (opcao) {
                case 1:
                    System.out.print("Nome: ");
                    String nome = scanner.nextLine();
                    System.out.print("Preço Unitário: ");
                    float preco = scanner.nextFloat();
                    System.out.print("Quantidade: ");
                    int quantidade = scanner.nextInt();
                    System.out.print("Potência (W): ");
                    int potencia = scanner.nextInt();
                    System.out.print("Tensão (V): ");
                    int tensao = scanner.nextInt();
                    System.out.print("Rotação (RPM): ");
                    int rotacao = scanner.nextInt();
                    System.out.print("Capacidade (L): ");
                    int capacidade = scanner.nextInt();
                    System.out.print("Tipo (J/P): ");
                    char tipo = scanner.next().charAt(0);
                    scanner.nextLine(); // Consumir quebra de linha
                    System.out.print("Marca: ");
                    String marca = scanner.nextLine();

                    EletricosM novo = new EletricosM(nome, preco, quantidade, potencia, tensao, rotacao, capacidade, tipo, marca);
                    controlador.CadastroMaquina(novo);
                    System.out.println("Equipamento cadastrado com sucesso!");
                    break;

                case 2:
                    System.out.print("Digite a marca: ");
                    String buscaMarca = scanner.nextLine();
                    System.out.println(controlador.BuscaPorMarca(buscaMarca));
                    break;

                case 3:
                    System.out.print("Digite o tipo (J/P): ");
                    char buscaTipo = scanner.next().charAt(0);
                    System.out.println("Quantidade: " + controlador.BuscaPorTipo(buscaTipo));
                    break;

                case 4:
                    System.out.print("Digite a marca do equipamento a remover: ");
                    String marcaRemover = scanner.nextLine();
                    EletricosM remover = null;

                    for (EletricosM e : controlador.getListaEletricos()) {
                        if (e.getMarca().equalsIgnoreCase(marcaRemover)) {
                            remover = e;
                            break;
                        }
                    }

                    if (remover != null && controlador.Remocao(remover)) {
                        System.out.println("Equipamento removido com sucesso!");
                    } else {
                        System.out.println("Equipamento não encontrado.");
                    }
                    break;

                case 5:
                    System.out.println("Saindo...");
                    scanner.close();
                    return;

                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
        }
    }
}
