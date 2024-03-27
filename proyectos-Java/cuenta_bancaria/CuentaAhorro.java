   package cuenta_bancaria;

   //clase hijo de cuenta
   public class CuentaAhorro extends Cuenta
   {
   //atributos hijo
   private boolean activa;
   //constructor hijo
   public CuentaAhorro(float saldo)
   {
      super(saldo);
      
      activa = saldo > 10000;
   }
   
   //metodos hijo
   @Override
   public void deposito(float cant_depositar)
   {
      if(activa)
      {
         super.deposito(cant_depositar);
      }
   }
   
   @Override
   public void retiro(float cant_retirar)
   {
      if(activa)
      {
         super.retiro(cant_retirar);
         
      }
   } 
   
   public void imprimirsaldo()
   {  
      System.out.println(" \n saldo actual: " + saldo + "$");
      System.out.println("Numero de transacciones realizadas: " + (depositos + retiros));
      System.out.println("Depositos: " + depositos + "  Retiros: " + retiros + "\n");
   }
   
}