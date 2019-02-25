/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package somardoisnumeros;

import java.util.Scanner;

/**
 *
 * @author sala302b
 */
public class SomarDoisNumeros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        // Declaração de variáveis
        int a;
        int b, soma;
        //Entrada de dados (numeros)
        Scanner leitor = new Scanner(System.in);
        System.out.print("Digite o primeiro numero: ");
        a = leitor.nextInt();
        System.out.print("Digite o segundo numero: ");
        b = leitor.nextInt();
        
       //Operação e atribuição
       soma = a + b;
       
       //Exibição do resultado
       System.out.println("Soma = " + soma);
       
        
        
    }
    
}
