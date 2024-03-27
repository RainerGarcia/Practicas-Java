   package cuenta_bancaria;
   
   import java.util.Scanner;

public class main
{
   public static void main(String [] args)
   {  
      //declaracion de variables y objetos
      float depositoinicial = 0f, depositar = 0f, retirar = 0f;
      int opcion, sesion = 0;
      boolean sistema = true;
      Scanner sc = new Scanner(System.in);
      
      //bienvenida al sistema
      System.out.println("Bienvenido a su cuenta en dolares del banco universal");
      System.out.println("Para activar su cuenta deposite su dinero, al alcanzar mas de 10.000$ su cuenta sera activada");
      
      //ciclo que se mantendrá activo hasta que la variable depositoinicial sea mayor a 10.000$, cuando sea verdad entonces
      //se activara la cuenta de ahorros
      do{
            System.out.print("Coloque aqui su monto a depositar: ");
            depositoinicial += sc.nextFloat();
            
            if(depositoinicial <= 10000)
            {
               System.out.println("Recuerde que para activar su cuenta debe poseer un monto mayor a 10.000$");
            }
            
        }while(depositoinicial <= 10000);
       
       CuentaAhorro micuenta = new CuentaAhorro(depositoinicial);
       
       do
       { System.out.println("\n *****Sistema bancario Banco Universal*****");
         System.out.println("introduzca el numero de la operacion que desee realizar");
         System.out.println("Imprimir los datos de su cuenta (opcion 1)");
         System.out.println("Realizar un deposito (opcion 2)");
         System.out.println("Realizar un retiro (opcion 3)");
         System.out.println("Salir del sistema (opcion 4)");
         System.out.print("opcion: ");
         opcion = sc.nextInt();
         
         switch(opcion)
         {
            case 1 ->  micuenta.imprimirsaldo();
            
            case 2 -> { System.out.print("Indique la cantidad que desea depositar: ");
                       depositar = sc.nextFloat();
                       micuenta.deposito(depositar);
                      }
           
            case 3 -> { System.out.print("Indique la cantidad que desea retirar: ");
                        retirar = sc.nextFloat();
                       micuenta.retiro(retirar);
                      }
                      
            case 4 -> { System.out.print("Desea cerrar su sesion? (opcion 1 -> si, opcion 0 -> no): ");
                        sesion = sc.nextInt();
                         if(sesion == 1)
                        {
                          sistema = false;
                        }
                      }

            default ->  System.out.println("el numero que usted marco es incorrecto");
                        
                                }
       }while(sistema);
   }
}