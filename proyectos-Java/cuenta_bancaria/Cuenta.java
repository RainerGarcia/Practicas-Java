   package cuenta_bancaria;

public class Cuenta
{
   //atributos
   protected float saldo;
   protected int depositos = 0, retiros = 0;
   
   //constructor
   public Cuenta(float _saldo)
   {
      this.saldo = _saldo;
   }
   
   //métodos
   public void deposito(float cant_depositar)
   {
      saldo += cant_depositar;
      depositos += 1;
      System.out.println("deposito exitoso \n");
   }
   
   public void retiro(float cant_retirar)
   {
      if((saldo - cant_retirar) < 0)
      {
         System.out.println("Saldo insuficiente para realizar la transaccion");
      }else{
            saldo -= cant_retirar;
            retiros += 1;
            System.out.println("Retiro exitoso \n");
           }
   }
}