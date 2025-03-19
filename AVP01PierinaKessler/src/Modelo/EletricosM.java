package Modelo;

public class EletricosM extends ItemM {
    private int potencia;
    private int tensao;
    private int rotacao;
    private int capacidade;
    private char tipo; // 'J' para jardinagem, 'P' para paisagismo
    private String marca;

    // Construtor
    public EletricosM(String nome, float precoUnitario, int quantidade, int potencia, int tensao, int rotacao, int capacidade, char tipo, String marca) {
        super(nome, precoUnitario, quantidade);
        this.potencia = potencia;
        this.tensao = tensao;
        this.rotacao = rotacao;
        this.capacidade = capacidade;
        this.tipo = tipo;
        this.marca = marca;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public int getTensao() {
        return tensao;
    }

    public void setTensao(int tensao) {
        this.tensao = tensao;
    }

    public int getRotacao() {
        return rotacao;
    }

    public void setRotacao(int rotacao) {
        this.rotacao = rotacao;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    public char getTipo() {
        return tipo;
    }

    public void setTipo(char tipo) {
        this.tipo = tipo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
}