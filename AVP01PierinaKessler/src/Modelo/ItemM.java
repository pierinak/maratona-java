package Modelo;

import java.sql.SQLOutput;

public class ItemM {
    public String nome;

    public float precoUnitario;

    public int quantidade;


    public ItemM(String nome, float precoUnitario, int quantidade) {
        this.nome = nome;
        this.precoUnitario = precoUnitario;
        this.quantidade = quantidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getPrecoUnitario() {
        return precoUnitario;
    }

    public void setPrecoUnitario(float precoUnitario) {
        this.precoUnitario = precoUnitario;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public void ImprimeItem(){
        System.out.println("...::ITEMS::...");
        System.out.println("Nome: "+this.nome);
        System.out.println("Valor do item: "+this.precoUnitario);
        System.out.println("Quantidade de itens: "+this.quantidade);

    }
}
