import java.util.Scanner;

public class fabrica{
  public static void main(String[]args){
    Scanner c=new Scanner(System.in);
    int imeca,g, p_semanal;
    double multa,p_total;
    //ingrese puntos imeca
    System.out.println("Digite  sus puntos IMECA");
    imeca = c.nextInt();
    //ingrese ganancias
    System.out.println("Digite sus ganancias diarias");
    g= c.nextInt();

    if(imeca>170)
    {
      p_semanal = g*5;
      multa = (0.5*g)*5;
      p_total = p_semanal+multa;
      int total = (int)p_total;
      System.out.println("Su perdida despues de no superar la revision de los 170 puntos es: "+total);
    }
    else
    {
      p_total = 0;
      System.out.println("No tienes ninguna sancion");
    }


  }
}
