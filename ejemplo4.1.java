package metodo4;
import java.util.Scanner;
public class ejemplo1 {
public static void main (String[]args){
	Scanner sc =new Scanner(System.in);
	int numero1, numero2, resultado;
	System.out.println("introduce el primer numero");
	numero1= sc.nextInt();
	System.out.println("introduce el segundo numero");
	numero2= sc.nextInt();
	resultado =suma(numero1,numero2);
	System.out.println("suma:"+resultado);
}

	public static int suma (int a, int b) {
		int c;
		c = a + b ;
		return c;
	}

}
