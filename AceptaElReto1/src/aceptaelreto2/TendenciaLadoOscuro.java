/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aceptaelreto2;

import java.util.Scanner;

/**
 *
 * @author juan
 */
public class TendenciaLadoOscuro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner b=new Scanner(System.in);
        int dato=b.nextInt();
        String guardar[]=new String[dato+1];
        
        for(int i=0;i<dato;i++)
        {
            int temp=b.nextInt();
            String base5=base(temp, 5);
            guardar[i]=base5;
            
           // System.out.println(base5);
        }
        
        
    }
    static String base(int num, int b) //convertir a base 5
    {
        if(num==0)
            return "";
        else
            return base((num/b), b) + (num%b);
    }
    
}
