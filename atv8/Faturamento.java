/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atv8;

import java.util.Scanner;

/**
 *
 * @author 11211100857@alunos.umc.br
 */
public class Faturamento {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       double valor_total = 0;
       for(int x = 0; x<5;x++){
        System.out.println("código do produto");
        Scanner scanner = new Scanner(System.in);
        int codigo = scanner.nextInt();
        scanner.nextLine();
        System.out.println(" descrição do produto");
        String descricao = scanner.nextLine();
        System.out.println(" valor da unidade");
        double valor_unit = scanner.nextDouble();
        System.out.println(" quantidade");
        int qtd_vendida = scanner.nextInt();
        Produto a1 = new Produto(codigo, descricao, valor_unit, qtd_vendida);
        
        a1.calcularTotal();
        valor_total += a1.getTotal_vendas();
        
        System.out.println("o valor total é: " + a1.getTotal_vendas());
       }
    System.out.println("o valor total dos produtos é: "+valor_total);
    }

}
