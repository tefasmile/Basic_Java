import java.util.Scanner;

public class sar {
	public static void main(String[]args) {
				Scanner c=new Scanner(System.in);
				int s, p, por, cuota, descontar,deposito, pmensual;
        System.out.println ("Digite salario del trabajador: ");
				s= c.nextInt();
        System.out.println ("Digite porcentaje del salario del trabajador va a depositar: ");
				p= c.nextInt();
        System.out.println ("Digite (0) si desea depositar una cuota fija a el ahorro ----- Digita (1) se desea depositar un porcentaje de su salario: ");
				por= c.nextInt();

				if(por == 0)
				{
          System.out.println("Digite el valor de la cuota fija: ");
          cuota = c.nextInt();
          deposito = ((s*p)/100)+cuota;
          pmensual = s-deposito;
          System.out.println("El valor total de dinero  que estara depositado en la cuenta cada mes sera de: "+deposito+"\n"+"El pago mensual del trabajador de SAR es de: "+pmensual);
				}
				else
				{
          System.out.println("Digite el porcentaje a descontar del salario: ");
          descontar= c.nextInt();
          deposito = ((s*p)/100) + ((s*por)/100);
          pmensual = s-deposito;
          System.out.println("El valor total de dinero  que estara depositado en la cuenta cada mes sera de: "+deposito+"\n"+"El pago mensual del trabajador de SAR es de: "+pmensual);
				}
	}

}
