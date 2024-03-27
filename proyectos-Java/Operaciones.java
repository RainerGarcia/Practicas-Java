/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package operaciones;
/**
 *
 * @author raine
 */
public class Operaciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int num1 = 5;
        int num2 = 10;
        
        System.out.println("sumando da como resultado: " + (num1 + num2));
        System.out.println("restando da como resultado: " + (num1 - num2));
        System.out.println("multiplicando da como resultado: " + (num1 * num2));
        System.out.println("dividiendo da como resultado: " + (num1 / num2));
        System.out.println("el residuo de la division es: " + (num1 % num2));
        
        
        System.out.println("el booleano es " + (num1 == num2));
        System.out.println("el booleano es " + ((num1 < num2) && (num1 > num2)));
     
    }
    
}
