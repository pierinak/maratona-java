package Modelo;

public class ComprasM extends ItemM {
    private boolean porAtacado;

    public boolean isPorAtacado() {
        return porAtacado;
    }

    public void setPorAtacado(boolean porAtacado) {
        this.porAtacado = porAtacado;
    }

    public ComprasM(String nome, float precoUnitario, int quantidade, boolean porAtacado) {
        super(nome, precoUnitario, quantidade);
        this.porAtacado = porAtacado;


        if (porAtacado) {
            setPrecoUnitario(getPrecoUnitario() * 0.75f);
        }

    }
    public void ImprimeCompras(){
        System.out.println("..::Imprime Compras::..");
        System.out.println("Nome: "+this.nome);
        System.out.println("Valor unitario: "+this.precoUnitario);
    }
}

