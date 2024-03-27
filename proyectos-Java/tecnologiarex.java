   import java.util.Scanner;
   
public class tecnologiarex
{

   public static void main (String [] args)
   {
      //definicion de variables y array
      Scanner sc = new Scanner(System.in);
      String empleado[] = new String [5];
      int sueldo[] = new int [5];
      int i, promedio = 0, mayor = 0, menor = 100000; 
      
      for(i=0;i<5;i++)
      {
         System.out.print("ingrese el nombre del empleado " + (i+1) + ": ");
         empleado[i] = sc.next();
         
         System.out.print("ingrese el sueldo del empleado: ");
         
         sueldo[i] = sc.nextInt();
         // sacando el promedio de los sueldos, sumando a variable promedio cada sueldo asignado
         promedio += sueldo[i];
            
         //aqui de los sueldos escritos por el usuario se van comparando para conocer cual es el mayor y cual es el menor
            if (sueldo[i] > mayor)
            {
               mayor = sueldo[i];
            }
            
            if(sueldo[i] < menor)
            {
               menor = sueldo[i];
            }
         
         System.out.println();
         
         
      }
      
         System.out.println("El sueldo promedio es: " + (promedio/i));
         
         /* se usan ciclos for para comparar y buscar los sueldos mayores y menores en dado caso que no sea uno solo sino varios
          sueldos mayores y menores, al comparar los sueldos maximos y minimos entre cada sueldo de empleado se imprimen
          los correspondientes a sueldos de rango mayor y rango menor */
          
          
         System.out.println("El sueldo mayor es:");
         System.out.println("empleado  sueldo");
         
         for(i=0;i<5;i++)
         {
            if(sueldo[i] == mayor)
            {
               System.out.println( empleado[i] +" "+ sueldo[i]);
            }
         }
         
         System.out.println("El sueldo menor es:");
         System.out.println("empleado  sueldo");
         
         for(i=0;i<5;i++)
         {
            if(sueldo[i] == menor)
            {
               System.out.println( empleado[i] +" "+ sueldo[i]);
            }
         }
      
      
   }
   


}