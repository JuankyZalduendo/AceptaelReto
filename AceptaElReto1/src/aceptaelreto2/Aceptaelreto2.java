/*
 https://www.aceptaelreto.com/pub/problems/v002/83/st/statements/Spanish/index.html
 */
package aceptaelreto2;

import java.util.Scanner;

/**
 * @author juan
 */
public class Aceptaelreto2 {

    static int contador=0;
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        
        while(sc.hasNext()){
            contador=0;
            int mayor=0;
            int fila=sc.nextInt();
            
            int col=sc.nextInt();
            
            char datos[][]=new char[fila][col];
            sc.nextLine();
            for(int i=0;i<fila;i++)
            {                                
                    
                    datos[i]=sc.nextLine().toCharArray();               
            }
                                 
            System.out.println();
            for(int i=0;i<fila-1;i++)
                for(int j=0;j<col;j++)
                {
                    int temp=parcelas(datos,i,j);
                    if(temp>=mayor)
                        mayor=temp;                                      
                }
            System.out.println(mayor);
        }
    }
    static int parcelas(char[][] a,int fila, int col)
    {
      
        int tamaño=0;
        if(fila<0||col<0||fila>=a.length||col>=a[0].length)
            return 0;
        
        if(a[fila][col]==' ')
            return 0;
        
        if(a[fila][col]=='#')
        {
            a[fila][col]=' ';
            tamaño++;
            tamaño+=parcelas(a,fila+1,col);
            tamaño+=parcelas(a,fila,col+1);
            tamaño+=parcelas(a,fila-1,col);
            tamaño+=parcelas(a,fila,col-1);
            return tamaño;           
        }      
        return 0;  
    }
    
}
