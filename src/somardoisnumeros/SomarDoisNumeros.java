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
          //Criando variaveis
        int n1, n2, soma;
    
     //Criando o objeto de leitura de dados
      
      Scanner sc= new Scanner(System.in);
      System.out.print("Digite o 1° numero:");
      n1 = sc.nextInt();
      System.out.print("Digite o 2° numero:");
      n2 = sc.nextInt();
      
      //Calculando a soma de N1 e N2
      soma = n1 + n2;
      
      //Exibindo resultado da soma
      System.out.print("A soma é:" + soma);
    }
    
}
