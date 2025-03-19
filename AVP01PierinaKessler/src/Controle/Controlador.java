package Controle;

import Modelo.EletricosM;
import java.util.ArrayList;

public class Controlador {
    private ArrayList<EletricosM> listaEletricos;

    public Controlador() {
        this.listaEletricos = new ArrayList<>();
    }

    public void CadastroMaquina(EletricosM eletrico) {
        listaEletricos.add(eletrico);
    }

    public String BuscaPorMarca(String marcao) {
        StringBuilder resultado = new StringBuilder();
        boolean encontrado = false;

        for (EletricosM e : listaEletricos) {
            if (e.getMarca().equalsIgnoreCase(marcao)) {
                resultado.append(e.toString()).append("\n-----------------\n");
                encontrado = true;
            }
        }
        return encontrado ? resultado.toString() : "Produto não encontrado.";
    }

    public int BuscaPorTipo(char tipo) {
        int contador = 0;
        for (EletricosM e : listaEletricos) {
            if (e.getTipo() == tipo) {
                contador++;
            }
        }
        return contador;
    }

    public boolean Remocao(EletricosM eletrico) {
        return listaEletricos.remove(eletrico);
    }

    public ArrayList<EletricosM> getListaEletricos() {
        return listaEletricos;
    }
}
