//Solicite al usuario capturar una cadena, de maximo 30 caracteres
//posteriormente a ello imprimir la siguiente informacion:
//Cantidad de letras.
//Cantidad de digitos numericos.
//Cantidad de otros caracteres.
//Longitud de la cadena.
//Mostar la cadena en mayusculas.
//Al final pregunte al usuario si desea realizar nuevamente la captura.
import java.util.*;

public class Cadena30cacteres {

    public static void main(String[] args) {
    Scanner sc=new Scanner (System.in);        
       int x;

       do{
       System.out.print("hola; ingrese la cantidad de caracteres a ingresar: ");
            x=sc.nextInt();
       if(x>30)
            System.out.println("la cadena no debe pasar los 30 caracteres");
       }while(x>30);
       
       System.out.print("ingrese los caracteres("+x+"): ");
           String[] cad = new String[x];
         
      for(int i=0; i<x; i++){
          System.out.print((i+1)+".-");
            cad[i]=sc.next();            
      }      
       System.out.println("los elementos de su cadena original son: ");
        for(int i=0; i<x;i++)
            System.out.print("{"+cad[i]+"}");
                System.out.println("\n y la cantidad de elementos son: "+x);

       
    }
}
