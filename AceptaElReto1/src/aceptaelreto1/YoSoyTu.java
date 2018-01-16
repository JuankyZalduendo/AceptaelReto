/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aceptaelreto1;

import java.util.Scanner;

/**
 *
 * @author juan
 */
public class YoSoyTu {

    
    public static void main(String[] args) {
        
        
        Scanner b=new Scanner(System.in);
        int dato=b.nextInt();
        dato=dato*2;
        String nombre[]=new String[dato+10];
        for(int i=0;i<dato;i++)
        {
            nombre[i]=b.next();
        }
        for(int i=0;i<dato;i++)
        {
            if(nombre[i+1].equals("padre"))
            {
                System.out.println("TOP SECRET");
                i+=2;
            }
            System.out.println(nombre[i]+", yo soy tu "+nombre[i+1]);
            i++;
        }
    }
    
}
