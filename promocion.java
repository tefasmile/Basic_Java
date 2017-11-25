import java.util.Scanner;

public class promocion {
	public static void main(String[]args) {
				Scanner c=new Scanner(System.in);
				int n, tc;
        double total_desc;

        System.out.println("Digite su numero de seleccion mayor o menor que 74");
				n= c.nextInt();
        System.out.println("Digite su tu total de compra");
				tc= c.nextInt();

				if(n<74)
				{
          total_desc = tc-(tc*0.15);
					int desc = (int)total_desc;
          System.out.println("Obtienes un 15% de descuento del total de tu compra: "+desc);
				}
				else
        if(n>=74)
				{
          total_desc = tc-(tc*0.2);
					int desc = (int)total_desc;
          System.out.println("Obtienes un 20% de descuento del total de tu compra: "+desc);
				}

	}

}
