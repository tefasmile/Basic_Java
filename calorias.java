import java.util.Scanner;

public class calorias {
	public static void main(String[]args) {
				Scanner c=new Scanner(System.in);
				int actividad,time;
        double calorias;

        System.out.println ("Digite (1) si esta dormido o escriba (0) si esta sentado");
				actividad = c.nextInt();
        System.out.println ("Digite el tiempo a realizar la actividad");
				time = c.nextInt();

				if(actividad==1)
				{
          calorias = 1.08*time;
          //conviert de double a entero
          //int cal = (int)calorias;
          System.out.println("Calorias quemadas mientras duerme: "+calorias);
				}
				else
				{
          calorias = 1.66*time;
          System.out.println("Calorias quemadas mientras esta sentado: "+calorias);
				}

	}

}
