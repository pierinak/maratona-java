package Controle;
import java.util.ArrayList;
import Modelo.ComprasM;

public class  ComprasC {
    private ArrayList<ComprasM> VETCOMPRAS;

    public ComprasC() {
        VETCOMPRAS = new ArrayList<>();
    }

    public void CadastroCompras(ComprasM compra) {
        VETCOMPRAS.add(compra); // Adiciona o objeto compra ao ArrayList
    }

    public void BuscaCompras(String nome) {
        boolean encontrado = false;

        for (ComprasM compra : VETCOMPRAS) {
            if (compra.getNome().equals(nome)) {
                // Caso encontre, imprime os detalhes da compra
                System.out.println("Compra encontrada:");
                System.out.println("Nome: " + compra.getNome());
                System.out.println("Preço Unitário: " + compra.getPrecoUnitario());
                System.out.println("Quantidade: " + compra.getQuantidade());
                System.out.println("Por Atacado: " + compra.isPorAtacado());
                encontrado = true;
                break;
            }
        }

        if (!encontrado) {
            System.out.println("Compra não identificada");
        }
    }

    public void ImprimirCompras() {
        for (ComprasM compra : VETCOMPRAS) {
            System.out.println("Nome: " + compra.getNome() +
                    ", Preço Unitário: " + compra.getPrecoUnitario() +
                    ", Quantidade: " + compra.getQuantidade() +
                    ", Por Atacado: " + compra.isPorAtacado());
        }
    }

}
