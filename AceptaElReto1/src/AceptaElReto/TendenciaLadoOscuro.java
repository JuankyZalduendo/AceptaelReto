package AceptaElReto;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


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
        for(int i=0;i<dato;i++)
        {
            int temp=b.nextInt();
            String base5=base(temp, 5);
            if(cuantos4(base5)>1)
                System.out.println("SI");
            else
                System.out.println("NO");
        }      
    }
    static String base(int num, int b) //convertir a base 5
    {
        if(num==0)
            return "";
        else
            return base((num/b), b) + (num%b);
    }
    
    static int cuantos4(String numero)
    {
        char temp[]=numero.toCharArray();
        int cantidad=0;
        for(int i=0;i<temp.length;i++)
        {
            if(temp[i]=='4')
                cantidad++;
        }
        
        if(cantidad>1)
            return cantidad;
        else
            return 1;
    }
    
}
