import java.util.Scanner;
public class PerimetroRec{
	public static void main(String[] args){
		double base,altura,perimetro;
		Scanner entrada=new Scanner(System.in);
		System.out.println("ingrese el lado");
		base=entrada.nextDouble();
		System.out.println("ingrse la altura");
		altura=entrada.nextDouble();
		perimetro= 2*(base+altura);
		System.out.println("el perimetro es:    "+ perimetro);
	}
}