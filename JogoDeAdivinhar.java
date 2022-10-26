

package com.mycompany.jogodeadivinhar;

/**
 *
 * @author alexs
 */

import java.util.Scanner;
import java.util.Random;
public class JogoDeAdivinhar {

    public static void main(String[] args) {
        int num;
        int a;
        int t=0;
        Scanner ler = new Scanner(System.in);
        Random aleatorio = new Random (); 
         a=aleatorio.nextInt(100);
        do {  
            
            System.out.println(" digite um numero : "  );
           num=ler.nextInt();
        if(num == a ){System.out.println("“Parabéns, você ganhou o jogo!” ");}
        if (num - a == 1 || num + 1 == a  ){System.out.println(" esta quente ");}
        if (num<a  ) {System.out.println(" É maior ");}
        
        if (num>a  ) {System.out.println(" É menor ");}
        t++;
            }while((t!=5) && ( num !=a ));
        if (num !=a){System.out.println("game over!!! ");}
        
        System.out.println("\n \n O numero era exatamente  " +  a );
}
}