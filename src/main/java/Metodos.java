public class Metodos {  
    
    int moneda1,moneda2,moneda3,moneda4,moneda5,global,resultado;
        
    public void saludo(){
         System.out.println("*****************");
         System.out.println("*  BIENVENIDOS  *");
         System.out.println("*****************");
         System.out.println(" ");
    }
    
    public void menu (){
         System.out.println("*  MENÚ  *");
         System.out.println("Que desea hacer?");
         System.out.println("1.Registrar compra");
         System.out.println("2.consultar compras");
         System.out.println("3.consultar una compra");
         System.out.println("4.Terminar programa");
         System.out.println("Nota: ingrese el codigo de la operación");
         System.out.print("-->");
    }
    
    public void compra(){
        System.out.println("Ingrese valor de la compra");
        System.out.print("-->");
    }
    
    public int cambio (int compra, int efectivo){
        int camb = efectivo - compra;
        return camb;
    }
        
    public void mostrar( int cambio){
        System.out.println("el cambio es de: " + cambio);
        System.out.println(" "); 
    }
    
    public void moneda(int cambio){    
    moneda1= cambio/100;
    resultado = moneda1*100;
    global= cambio - resultado;
    System.out.println("se debe dar  " + moneda1 + " monedas de 100");
    }
    
    public void moneda2(){
      moneda2= global/50;
      resultado = moneda2*50;
      global = global - resultado;
      System.out.println("se debe dar  " + moneda2 + " monedas de 50");
    }
    
    public void moneda3(){
      moneda3 = global /25;
      resultado = moneda3*25;
      global = global- resultado;
      System.out.println("se debe dar  " + moneda3 + " monedas de 25");
    }
    
    public void moneda4(){
       moneda4 = global/5;
       resultado = moneda4*5;
       global = global -resultado;
       System.out.println("se debe dar  " + moneda4 + " monedas de 5");
    }
    
    public void moneda5(){
        moneda5=global/1;
        resultado = moneda5*1;
        System.out.println("se debe dar  " + moneda5 + " monedas de 1");
    }
}
