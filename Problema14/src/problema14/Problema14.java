/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema14;
import java.util.*;
/**
 *
 * @author Eduardo
 */
public class Problema14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[][] tabla = new int[7][7]; //creamos la matriz y determinamos las dimensiones
        llenaTabla(tabla); //metodo para el llenado automatico
    }
    public static void llenaTabla(int [][]x){
        int i,j,p;
        for(i=0;i<7;i++){ //arreglos For anidados por ser en dos dimensiones
            for(j=0;j<7;j++){
                  if(i==j){ //aqui decimos que solamente imprimira el 1 en los lugares donde i y j tengan el mismo valor para lograr la diagonal
                      p=1;
                  }else{
                      p=0; //para el resto de posiciones mostrará 0
                  }
                  System.out.print(p +"\t");//utilizamos la tabulacion para delimitar columnas   
            }
            System.out.println("\n");//realizamos salto de linea para formar las filas
        }
    }
}
