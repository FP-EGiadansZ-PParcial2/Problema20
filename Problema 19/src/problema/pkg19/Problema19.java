/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema.pkg19;
import java.util.*;
/**
 *
 * @author Eduardo
 */
public class Problema19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double a=getAngle(); //variable y metodo para pedir angulo
        double b=convRad(a); //convertimos el angulo a radianes para pode rusarlo
        calcule(b); //Calculamos el valor del seno, coseno y tangente y mostramos
    }
    public static double getAngle(){ //obtenemos angulo por teclado
        double ang;
        Scanner teclado=new Scanner(System.in);
        System.out.println("Introduzca el valor del angulo deseado");
        ang=teclado.nextDouble();
        return ang;
    }
    public static double convRad(double ang){ //convertimos angulo dado a radianes
        double b;
        b=Math.toRadians(ang);
        return b;
    } 
    public static void calcule(double b){ //calculamos funciones trigonometricas y mostramos
        double seno,cose,tang;
        seno=Math.sin(b);
        cose=Math.cos(b);
        tang=Math.tan(b);
        System.out.println("El valor del seno de es "+seno);
        System.out.println("El valor del coseno de es "+cose);
        System.out.println("El valor de la tangente de es "+tang);


        
        
    }
    
}
 //nota= saber que significa que en angulos como 90 y 360, arroje datos incorrectos