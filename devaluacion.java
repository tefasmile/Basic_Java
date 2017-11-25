import java.util.Scanner;

public class devaluacion{
  public static void main(String[]args){
    Scanner c=new Scanner(System.in);
    int costo, car, terreno, mitad;

    System.out.println("Digite valor de carro");
    costo = c.nextInt();
    System.out.println("Digite tasa de devaluacion del coche(mes)");
    car= c.nextInt();
    System.out.println("Digite tasa de de devaluacion del terreno");
    terreno= c.nextInt();

    car = ((car/100)*costo)*(3*12);
    terreno = ((terreno/100)*costo)*(3*12);
    mitad = terreno/2;

    if(car<mitad)
    {
      System.out.println("Deberias de compra tu carro");
    }
    else
    {
      System.out.println("Mejor compra tu terreno");
    }


  }
}
