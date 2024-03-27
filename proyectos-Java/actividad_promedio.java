   import java.util.Scanner;
   
public class actividad_promedio
{


   public static void main(String []args)
   {
      Scanner sc = new Scanner(System.in);
      String materia = "";
      float nota = 0f, promedio = 0f;
      
      System.out.println("Bienvenido al sistema academico virtual de la universidad");
      System.out.print("Coloque su nombre y apellido: ");
      String estudiante = sc.nextLine();
      System.out.print("indique el numero de su semestre culminado: ");
      int semestre = sc.nextInt();
      
      for(int i = 1; i <= 5; i++)
      {
         switch(i)
         {
            case 1 -> materia = "Algebra";
            case 2 -> materia = "Calculo";
            case 3 -> materia = "Programacion I";
            case 4 -> materia = "Redes";
            case 5 -> materia = "Sistemas Operativos";  
         }
         
           System.out.print("Coloque su nota de " + materia + ": ");
            nota = sc.nextFloat();
            
            promedio += nota;
      }
     
      System.out.println("\n..................................");
      System.out.println("Estudiante: " + estudiante);
      System.out.println(semestre + "do semestre");
      System.out.println("promedio del semestre: " + (promedio/5));
      System.out.println("..................................");
          
   }  


}