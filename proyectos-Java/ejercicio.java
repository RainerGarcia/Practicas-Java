/*
 * @author rainer
 */
 
//importar la libreria scanner para obtener datos ingresados por el usuario en consola
 import java.util.Scanner; 
 
public class ejercicio{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
      //inicializando un objeto scanner de la clase scanner
      Scanner dato = new Scanner(System.in);
       
        // TODO code application logic here
        int numero1, numero2;
        
        //ingreso de los datos por el usuario usando el metodo nexInt
        System.out.print("Ingrese el primer numero: ");
        numero1 = dato.nextInt();
        
        System.out.print(" Ingrese el segundo numero: " );
        numero2 = dato.nextInt();
        
        //operaciones concatenados dentro de los print
        System.out.println(" La suma de los numeros es: " + (numero1 + numero2));
        System.out.println(" La multiplicacion de los numeros es: " + (numero1 * numero2));
        
        //comparacion
        System.out.print(" Los numeros son iguales?: ");
         if(numero1 == numero2){
               System.out.println(" si, son iguales");

         }else
            System.out.println("no son iguales");
            
        //menor que    
        System.out.print(" El primer numero es menor que el segundo numero?: ");
        if(numero1 < numero2){
               System.out.println(" si, el primer numero es mejor que el segundo numero");

        }else
            System.out.println("no, el primer numero no es menor que el segundo numero");
            
        
        //mayor que
        System.out.print(" El primer numero es mayor o igual que el segundo numero?: ");
        if(numero1 > numero2){
               System.out.println(" si, el primer numero es mayor que el segundo numero ");

        }else if(numero1 == numero2){
            System.out.println("son iguales");
            }
            
            else
            System.out.println("no, el primer numero es menor que el segundo numero");
            
        
        
        
    }
    
}