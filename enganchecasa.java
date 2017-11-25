import java.util.Scanner;

public class enganchecasa {
	public static void main(String[]args) {
				Scanner c=new Scanner(System.in);
				int casa,ing_comprador;
        double r,enganche,pmensual;


        System.out.println("Digite costo de la casa: ");
				casa = c.nextInt();
        System.out.println("Digite ingresos del comprador: ");
				ing_comprador= c.nextInt();

				if(ing_comprador>8000)
				{
          enganche = casa*0.30;
          r = casa-enganche;
					pmensual = (r/84);
          int eng = (int)enganche;
					int res = (int)r;
					int pm = (int)pmensual;
          System.out.println("Su enganche es:"+eng+"con el 30%");
          System.out.println("El comprador debe pagar: "+res+" en el tiempo de 7 years"+" \n"+"La cuota mensual es de $: "+pm);
				}
				else
				{
          enganche = casa*0.15;
          r = casa-enganche;
          pmensual = (r / 120);
					int eng = (int)enganche;
					int res = (int)r;
					int pm = (int)pmensual;
          System.out.println("Su enganche es: "+eng+" con el 15%");
          System.out.println("El comprador debe pagar: "+res+" en el tiempo de 10 years"+" \n"+"La cuota mensual es de $: "+pm);
				}

	}

}
