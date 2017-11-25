import java.util.Scanner;

public class llantera {
	public static void main(String[]args) {
				Scanner c=new Scanner(System.in);
				int n, llanta1,llanta2,x,total;
        llanta1 = 800;
        llanta2 = 700;
        x = 5;
        System.out.println ("Digite numero de llantas a comprar");
				n= c.nextInt();

				if(n<x)
				{
          total = llanta1*n;
          System.out.println("Precio llanta $800"+" \n"+"El precio a pagar en una llantera: "+total);
				}
				else
				{
          total = llanta2*n;
          System.out.println("Precio llanta $700"+" \n"+"El precio a pagar en llantera: "+total);
				}

	}

}
