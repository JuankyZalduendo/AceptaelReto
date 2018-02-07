/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AceptaElReto;


import java.util.Scanner;

/**
 *
 * @author juasan
 */    

public class EscapandoFuerzasImperiales {

    public static void main(String[] args) {
        
        
        Scanner a= new Scanner(System.in);
        while(a.hasNext())
        {
            
            int v1=0;
            int v2=0;           
            int f=a.nextInt();
            int c=a.nextInt();
            char mapa[][] =new char[f][c];
            for (int x=0;x<f;x++)
                {
                    String sup =a.next();
                    for(int y=0;y<c;y++)
                    {                       
                        mapa[x][y]=sup.charAt(y); 
                        if(mapa[x][y]=='S')
                        {
                            v1=x;
                            v2=y;
                        }
                    }
                }           
            if(sitio(mapa, v1, v2))
                System.out.println("SI");
            else
                System.out.println("NO");
        }
        
    }  
    public static boolean sitio(char[][]mapa,int x, int y)
    {
        if (x < 0 || y < 0 || x >=mapa.length || y >=mapa[0].length) 
           return false;
        
        if(mapa[x][y]=='.' || mapa[x][y]=='S')
        {
            mapa[x][y]='*';
            if(sitio(mapa, x ,y-1))            
                return true;
            
            else if(sitio(mapa, x ,y+1))            
                return true;
            
            else if(sitio(mapa, x-1 ,y))            
                return true;
            
            else if(sitio(mapa, x+1 ,y))            
                return true;
            else
                return false;            
        }
        if(mapa[x][y]=='F')
            return true;
        
        if(mapa[x][y]=='*')
            return false;
               
        return false;
    }
}


