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
        
        
        //while(sc.hasNext()){
            contador=0;
            System.out.println("temp:fila");
            int fila=sc.nextInt();
            System.out.println("temp:col");
            int col=sc.nextInt();


            char datos[][]=new char[fila][col];
            sc.nextLine();
            for(int i=0;i<fila;i++)
            {
                //for(int a=0;a<col;a++)
                //{
                    System.out.println("f:"+i);
                    datos[i]=sc.nextLine().toCharArray();



                //}


            }

            for(int i=0;i<fila;i++)
            {
                System.out.println("");
                //for(int a=0;a<col;a++)
                //{
                    System.out.print(datos[i]);                                                          
                //}  
            }
            
            /*for(int i=0;i<fila;i++)
            {
                
                for(int a=0;a<col;a++)
                {*/
                    System.out.println("res:"+parcelas(datos,fila-1,col-1));                                                          
                //}  
            //}
    
        //}
    
    }
    static int parcelas(char[][] a,int fila, int col)
    {
         System.out.println();
        char temp;System.out.print(fila);System.out.print(col);
        System.out.println();
        if(fila>=0)
        {
            
            temp=a[fila][col];
            if(temp=='#')
                contador++;
                
            return parcelas(a,fila-1,col);
            
        }
       
        else if(col>=0 && fila==0)
        {
                        
            temp=a[fila][col];
            if(temp=='#')
                contador++;
                
            return parcelas(a,fila,col-1);
        }
            
        else
            return contador;
    }
    
}
