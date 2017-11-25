import java.util.Scanner;

public class inversion {
	public static void main(String[]args) {
				Scanner c=new Scanner(System.in);
				int cant, tz, capital, intereses;

        System.out.println ("Digite su cantidad a invertir");
				cant = c.nextInt();
        System.out.println ("Digite taza de interes");
				tz = c.nextInt();
        intereses = (cant*tz)/100;
        capital = cant+intereses;
				if(intereses>7000)
				{
          System.out.println("valor intereses: "+intereses+"\n"+"Dinero total en su cuenta bancaria: -->"+capital);
				}
				else
				{
					System.out.println("valor intereses: "+intereses+"\n"+"Low: "+capital);
				}

	}

}
