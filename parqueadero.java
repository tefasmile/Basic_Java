import java.util.Scanner;

public class parqueadero {
	public static void main(String[]args) {
				Scanner c=new Scanner(System.in);
				int h,m,pago;

        System.out.println ("Digite sus horas de estacionamiento");
				h = c.nextInt();
        System.out.println ("Digite sus minutos de estacionamiento");
				m = c.nextInt();

				if(m>0)
				{
          h= h+1;
          pago = h*1500;
          System.out.println("Su pago de parqueadero es: "+pago);
				}
				else
				{
					System.out.println("Gracias por su visita!");
				}

	}

}
