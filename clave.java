import java.util.Scanner;

public class clave {
	public static void main(String[]args) {
				Scanner c=new Scanner(System.in);
        String name;
				int e, clave, price;
        double desc;


        System.out.println ("Digite nombre de tu articulo");
				name= c.next();
        System.out.println ("Digite su clave");
				clave = c.nextInt();
        System.out.println ("Digite precio original del producto");
				price = c.nextInt();


				if(clave==1)
				{
          desc = price-(0.1*price);
          //conviert de double a entero
          //int desct = (int)desc;
          int desct = (int)desc;
          System.out.println("El nombre de tu articulo es:"+"\n"+"Tu clave es: "+clave+"\n"+"Precio original producto:"+price+"\n"+"Obtienes un descuento de:"+desct);
				}
				else
        if(clave==2)
				{
          desc = price-(0.2*price);
          int desct = (int)desc;
          System.out.println("El nombre de tu articulo es:"+"\n"+"Tu clave es: "+clave+"\n"+"Precio original producto:"+price+"\n"+"Obtienes un descuento de:"+desct);
				}

	}

}
