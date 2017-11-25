import java.util.Scanner;

public class pulsaciones {
	public static void main(String[]args) {
				Scanner c=new Scanner(System.in);
        String name;
				int age,sexo;
        double pulsaciones;

        System.out.println("Digite su edad: ");
				age= c.nextInt();
        System.out.println("Digite su nombre sexo femenino o masculino");
        name= c.next();
        System.out.println("Digite su sexo femenino(0) o masculino(1)");
				sexo= c.nextInt();

				if((sexo == 0) || (sexo == 1))
				{
          pulsaciones = (220-age)/10;
          System.out.println("Tu numero de pulsaciones son: "+pulsaciones+"\n"+"tu sexo: "+name);
				}
				else
				{
          pulsaciones = (210-age)/10;
          System.out.println("Tu numero de pulsaciones son: "+pulsaciones+"\n"+"tu sexo: "+name);
				}

	}

}
