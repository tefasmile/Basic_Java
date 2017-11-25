import java.util.Scanner;

public class market {
	public static void main(String[]args) {
				Scanner c=new Scanner(System.in);
				int docenas, obsequio, montocom, precio;
        double montodes,montopag;
        //entrada datos
        System.out.println ("Digite precio de producto");
				precio = c.nextInt();
        System.out.println ("Digite docenas a comprar");
				docenas = c.nextInt();
        // Determina el monto de la compra
        montocom = docenas*precio;
        // Determina el monto del descuento y el obsequio
				if(docenas > 3)
				{
          montodes = 0.15*montocom;
          obsequio = docenas-3;
          montopag = montocom - montodes;
          System.out.println("El monto de tu compra es: "+montocom+"\n"+"Tu monto de descuento: "+montodes+"\n"+"Tu monto a pagar: "+montopag+"\n"+"Tu numero de unidades de obsequio: "+obsequio);
				}
				else
				{
          montodes = 0.10*montocom;
          obsequio = 0;
          montopag = montocom - montodes;
          System.out.println("El monto de tu compra es: "+montocom+"\n"+"Tu monto de descuento: "+montodes+"\n"+"Tu monto a pagar: "+montopag+"\n"+"Tu numero de unidades de obsequio: "+obsequio);
				}
        //Determina monto a pagar
        //montopag = montocom - montodes;
        // Salida de resultados
        //print montocom, montodes, montopag, obsequio

	}

}
