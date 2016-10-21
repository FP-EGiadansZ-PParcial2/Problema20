/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema12;
import java.util.*;
/**
 *
 * @author Eduardo
 */
public class Problema12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) { 
        int n1,n2,n3,n4,n5,n6,n7,n8,n9,n10; //declaramos 10 variables para ejecutar un mismo metodo 
        n1=getNum("1");
        n2=getNum("2");
        n3=getNum("3");
        n4=getNum("4");
        n5=getNum("5");
        n6=getNum("6");
        n7=getNum("7");
        n8=getNum("8");
        n9=getNum("9");
        n10=getNum("10");
       arreglo(n1,n2,n3,n4,n5,n6,n7,n8,n9,n10); //metodo par calcular la media 
                
    }
    public static int getNum(String d){ //pediremos 10 datos en total
        int n;
        Scanner teclado=new Scanner(System.in);
        System.out.println("Introduce el numero "+d);
        n=teclado.nextInt();
        return n;
    }
    public static void arreglo(int n1,int n2,int n3,int n4,int n5,int n6,int n7,int n8,int n9,int n10){
        int n;  //en este metodo asignamos cada posicion del arreglo a los 10 datos dados por teclado
        int [] arreglo=new int[10];
        arreglo[0]=n1;
        arreglo[1]=n2;
        arreglo[2]=n3;
        arreglo[3]=n4;
        arreglo[4]=n5;
        arreglo[5]=n6;
        arreglo[6]=n7;
        arreglo[7]=n8;
        arreglo[8]=n9;
        arreglo[9]=n10;
        n=((arreglo[2]+arreglo[4]+arreglo[6]+arreglo[8])/4); //tomamos solo las posiciones pares para calcular la media
        System.out.println("La media de las posiciones pares del arreglo es: "+n);
        
        
    }
    
}
