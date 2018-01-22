package AceptaElReto;

import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author juasan
 */
public class OrganizandoHangares {
    static boolean gameover=false;
    public static void main(String[] args) {
        
        while(!gameover)
        {
            Scanner a= new Scanner(System.in);
            System.out.println("hangares");//temporal
            int h=a.nextInt();
            if(h!=0)
            {
                int hangares[]=new int[h];
                for(int i=0;i<h;i++)
                {
                    hangares[i]=a.nextInt();
                }
                
                System.out.println("naves");//temporal
                int cantidad=a.nextInt();                
                int naves[]=new int[cantidad];
                
                for(int i=0;i<cantidad;i++)
                {
                    naves[i]=a.nextInt();
                }
                
                
                int dato=funcion(hangares, naves);
                
                if(dato>=0)
                    System.out.println("SI");
                else
                    System.out.println("NO");
                
            }
            else
                gameover=true;
        }
    }
    
    public static int funcion(int []hangar, int []naves)
    {
        
        return 0;//temp
    }
}
