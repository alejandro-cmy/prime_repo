import java.util.Scanner;
public class Triangulo{
	public static void main(String[] args){
		int base,altura;
		double area;
		String nomb="";
		Scanner entrada=new Scanner(System.in);
		System.out.println("Ingresa tu nombre:");
		nomb=entrada.nextLine();
		System.out.println("Ingrse la base");
		base=entrada.nextInt();
		System.out.println("Ingresa la altura:");
		altura=entrada.nextInt();
		area=(base*altura)/2;
		System.out.println("el area del Triangulo es:"+ area);
        }
}