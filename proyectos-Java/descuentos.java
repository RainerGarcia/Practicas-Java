   import java.util.Scanner;
   import java.text.DecimalFormat;
   
public class descuentos
{


   public static void main(String []args)
   {
   
      // declaracion de objetos importador a usar, scanner para obtener datos del usuario y decimal para limitar decimales
      
      DecimalFormat decimal = new DecimalFormat("#,00");
      Scanner sc = new Scanner(System.in);
     
      //declaracion de las variables
      String cliente;
      float compra = 0f, descuento = 0f;
      
      System.out.print("Porfavor ingrese su nombre y apellido: ");
      cliente = sc.nextLine();
      
      do
      {
      
         System.out.print("Porfavor ingrese el monto de su compra: ");
         compra = sc.nextFloat();
         System.out.print("\n\n");
         
           // lineas de codigo validando si el cliente obtuvo descuentos
            if(compra < 600 && compra > 350)
            {
               descuento = 0.2f;
            }else if(compra <= 350 && compra >= 170)
            {
               descuento = 0.15f;
            }else if(compra < 170 && compra >= 80)
            {
               descuento = 0.1f;
            }else 
               descuento = 0f;
            
            //mensaje en dado caso que el monto de compra sea mayor o igual a 600
            if(compra >= 600)
            {
            System.out.println("Debido a las politicas y regularizaciones en la tienda, su valor de compra debe ser menor a 600$, disculpe las molestias");
            }
      // se usa ciclo do while sabiendo que el ejercicio no dio informacion sobre que hacer si la compra es mayor o igual a 600$, en dado caso se le dice al usuario que no es posible su compra
      }while(compra >= 600);
      
      System.out.println("cliente: " + cliente);
      System.out.println("Monto de compra: "+ compra);
      System.out.println("Descuento: " + (decimal.format(descuento * 100)) + "%");
      System.out.println("Total a pagar: " + (compra-(compra*descuento)) + "$");
      
   }


}