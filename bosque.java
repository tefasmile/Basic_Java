import java.util.Scanner;

public class bosque {
	public static void main(String[]args) {
				Scanner c=new Scanner(System.in);
				int superficie,ht,tp,tc;
        double cpino,oy,coy,pi,ce,cce;

        System.out.println ("Digite la superficie del bosque en hectareas: ");
				ht= c.nextInt();
        superficie = ht*10000;

				if(superficie <= 1000000)
				{
          pi = superficie*0.7;
          tp = 10/8;
          cpino = pi/tp;
          oy = superficie*0.2;
          coy = oy/1;
          ce = superficie*0.1;
          tc = 18/10;
          cce = ce/tc;
          int cced = (int)cce;
          System.out.println(" En "+ ht +" hectareas que equivalen a: "+ superficie + "\n"+ pi +" m2 (70%) sera ocupado por Pinos y habran: "+cpino+" pinos"+"\n"+oy+" m2 (20%) sera ocupado por Oyameles y habran "+ coy +" oyameles"+"\n"+ce+" m2 (10%) sera ocupado por cedros y habran: "+cced);
				}
				else
				{
          pi = superficie*0.7;
          tp = 10/8;
          cpino = pi/tp;
          oy = superficie*0.2;
          coy = oy/1;
          ce = superficie*0.1;
          tc = 18/10;
          cce = ce/tc;
          int cced = (int)cce;
          System.out.println(" En "+ ht +" hectareas que equivalen a "+ superficie +"m2"+"\n"+" m2 (70%) sera ocupado por Pinos y habran: "+cpino+" pinos"+"\n"+oy+" m2 (20%) sera ocupado por Oyameles y habran "+ coy +" oyameles"+"\n"+ce+" m2 (10%) sera ocupado por cedros y habran: "+cced);

				}

	}

}
