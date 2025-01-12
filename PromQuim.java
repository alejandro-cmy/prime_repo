import java.util.Scanner;
public class PromQuim{
	public static void main (String[] args){
		float numUno,numDos,promNotas;
		Scanner entrada=new Scanner(System.in);
		System.out.println("ingrese primera nota:");
		numUno=entrada.nextFloat();
		System.out.println("ingrese lasegunda nota:");
		numDos=entrada.nextFloat();
		promNotas=(numUno+numDos)/2;
		
		if(promNotas>=5){
			System.out.println("su promedioes"+promNotas);
			System.out.println("usted pasa el año directamente");
		}
		else if (promNotas<5){
			System.out.println("su promdio es: "+promNotas);
			System.out.println("usted esta suspenso");
		}

	}
}