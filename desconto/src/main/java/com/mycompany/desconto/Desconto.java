package com.mycompany.desconto;

/**
 *
 * @author alexs
 */
     import java.util.Scanner;
public class Desconto {
    public static void main(String[]args) {
        Scanner ler = new Scanner(System.in);
        Double v;
        System.out.println("Valor do produto : ");
        v=ler.nextDouble();
         if (v>=300){
           System.out.println("vc terá o desconto de 20% que será : "+((v*20/100)));
           System.out.print("Com o desconto vc pagará :" +(v-(v*20/100)));
         }
        else{
           System.out.println ("vc  terá o desconto de 15% que será "+((v*15/100)));
           System.out.print("Com o desconto vc pagará :" +(v-(v*15/100)));
         }
        
        
    }
    
}