import java.util.Scanner;
public class Rectangulo{

	public static void main(String[]agrs){ 
		int base,altura,area;
		String nomb = "";
		Scanner entrada=new Scanner(System.in);
		System.out.println("hola bienvenido a calculo del rectangulo");
		System.out.println("ingresa tu nombre:");
		nomb=entrada.nextLine();
		System.out.println("Ingresa la base");
		base=entrada.nextInt();
		System.out.println("Ingresa la altura");
		altura=entrada.nextInt();
		area=base*altura;
		System.out.println("el area del rectanguloes:"+area);
	}
}