/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atv8;

/**
 *
 * @author alunocmc
 */
//classe
public class Produto {
    
    //atributos
    private int codigo;
    private String descricao;
    private double valor_unit;
    private int qtd_vendida;
    private double total_vendas;
    
    //método construtor
    public Produto(int codigo, String descricao, double valor_unit, int qtd_vendida) {
        this.codigo = codigo;
        this.descricao = descricao;
        this.valor_unit = valor_unit;
        this.qtd_vendida = qtd_vendida;

    }

    public int getCodigo() {
        return codigo;
    }

    public String getDescricao() {
        return descricao;
    }
    public double getTotal_vendas() {
        return total_vendas;
    }    

    public void calcularTotal() {       
        total_vendas = valor_unit * qtd_vendida;
    }
 

}
