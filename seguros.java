import java.util.Scanner;

public class seguros {
	public static void main(String[]args) {
				Scanner c=new Scanner(System.in);
				int monto;
				double cuota;

        System.out.println("Digite su monto de dinero: ");
				monto= c.nextInt();

				if(monto<50000)
				{
          cuota = monto+(monto*0.03);
					int cta = (int)cuota;
          System.out.println("Tu  cuota a pagar tiene un valor de: "+cta+" \n"+"Descuento 3%");
				}
				else
				if(monto>50000)
				{
          cuota = monto+(monto*0.02);
					int cta = (int)cuota;
					System.out.println("Tu  cuota a pagar tiene un valor de: "+cta+" \n"+"Descuento 2%");
				}

	}

}
