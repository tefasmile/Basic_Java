import java.util.Scanner;

public class colegiatura {
	public static void main(String[]args) {
				Scanner c=new Scanner(System.in);
				int price,m;
				double p, colegiatura,desc, t_desc, p_full, p_iva;

        System.out.println("Digite valor de la materia: ");
				price= c.nextInt();
        System.out.println("Digite cuantas materias cursaras: ");
				m= c.nextInt();
        System.out.println("Digite su promedio escolar: ");
				p= c.nextInt();
        colegiatura = m*price;

				if(p>=9)
				{
          desc = colegiatura*0.3;
          t_desc = colegiatura-desc;
					int d = (int)desc;
          int td = (int)t_desc;
          System.out.println("se le hara un descuento del 30% sobre la colegiatura: "+d+"\n"+"Total a pagar: "+td);
				}
				else
				if(p<9)
				{
          p_full = colegiatura*0.10;
          p_iva = colegiatura+p_full;
					int iva = (int)p_iva;
          int full = (int)p_full;
					System.out.println("Usted debera  pagar la colegiatura completa de un TOTAL DE: "+iva+" \n"+"Incluye el 10% de IVA: "+full);
				}

	}

}
