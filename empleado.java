import java.util.Scanner;
//h:horas, sc:seguro social, s:sueldo
public class empleado {
	public static void main(String[]args) {
				Scanner c=new Scanner(System.in);
				String n;
				float tp,s,h,pb,sc;

        System.out.println ("Digita nombre de empleado: ");
				n = c.next();
				System.out.println ("Digita sueldo: ");
				s = c.nextInt();
				System.out.println ("Horas trabajadas: ");
				h = c.nextInt();
				//pago bruto
				pb = 8000*h;
				s = s+pb;
				if(s>700000)
				{
					sc = s*0.085f;
					tp = s+sc;
					//int iPart = (int) tp;
					System.out.println ("total a pagar empleado: "+tp);
				}
				else
				{
					sc = s*0.035f;
					tp = s+sc;
					short iPart = (short) tp;
					System.out.println ("total sueldo con 3.5%: "+iPart);
				}


	}

}
