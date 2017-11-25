import java.util.Scanner;

public class negocio {
	public static void main(String[]args) {
				Scanner c=new Scanner(System.in);
				int valor,it,mh,ia,inversion,i_socio;
        valor = 1000000;
        System.out.println ("Digite el valor de la inversion total: ");
				it= c.nextInt();
        System.out.println ("Digite el valor de monto de la hipoteca: ");
				mh= c.nextInt();

				if(mh >= valor)
				{
					ia = it-mh;
					inversion = ia/2;
					System.out.println("Invertira un valor de monto de la hipoteca de: "+mh+"\n"+"El resto: $ "+ ia +" Se repartira entre el, quien pagara "+ inversion +"  y el socio, que pagara: "+inversion);
				}
				else
				{
          inversion = (it/2);
					System.out.println("La inversion "+inversion+" se repartira en partes iguales entre socios");
				}
	}

}
