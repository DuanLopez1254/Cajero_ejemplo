import java.util.Scanner;
import java.util.ArrayList;

public class Main 
{
   public static void main (String args[]){
   
       Scanner entra = new Scanner(System.in);
       int a , i, compra, efectivo,cambio;  
       ArrayList  compras;
       compras = new ArrayList<>();
       Metodos metodo = new Metodos();
       metodo.saludo();

     do{         
         metodo.menu();
         a = entra.nextInt(); 
         switch (a){
             case 1:
                 metodo.compra();
                 compra = entra.nextInt();
                 System.out.println("Ingrese el efectivo");
                 System.out.print("-->");
                 efectivo = entra.nextInt();
                 cambio = metodo.cambio(compra, efectivo);
                 compras.add(compra);
                 metodo.mostrar(cambio);
                 metodo.moneda(cambio);
                 metodo.moneda2();
                 metodo.moneda3();
                 metodo.moneda4();
                 metodo.moneda5();
               break;
             
             case 2:
                 System.out.println("Estos son los resultados de las ultimas compras");
                      for(int f = 0; f < compras.size();f++){ // size se utiliza para saber el tamaño del array
                         System.out.println("Compra numero "+(f+1)+" = "+ compras.get(f));// get se utiliza para ordenar que posicion mostrar
                      }
                 System.out.println(" ");
                 break;
                 
             case 3:
                 System.out.println("¡¡¡¡Gracias por utilizar nuestro sistema!!!");
                 break;
             
             default: System.out.println(" La opcion seleccionada es incorrecta");
         }
     }while(a != 3);
   }
}