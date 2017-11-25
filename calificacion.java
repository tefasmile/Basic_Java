import java.util.Scanner;

public class calificacion {
	public static void main(String[]args) {
				Scanner c=new Scanner(System.in);
				float n;

        System.out.println ("Escribe tu numero de calificacion: ");
				n = c.nextFloat();

				if(n>=8)
				{
					System.out.println("Aprobado en tu curso:)"+"\n"+" tu nota es:"+n);
				}
				else
				{
					System.out.println("No eres aprobado");
				}

	}

}
