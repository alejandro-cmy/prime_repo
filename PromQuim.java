//este programa permite hacer un promedio de notas mi nombre es alejandro cualquier duda contactame:0967816009 
import java.util.Scanner;
public class PromQuim{
	public static void main (String[] args){
		float numUno,numDos,numTres,promNotas;
		Scanner entrada=new Scanner(System.in);
		System.out.println("ingrese primera nota:");
		numUno=entrada.nextFloat();
		System.out.println("ingrese lasegunda nota:");
		numDos=entrada.nextFloat();
		System.out.println("ingrese la tercera nota:");
		numTres=entrada.nextFloat();
		promNotas=(numUno + numDos + numTres)/3;
		
		if (promNotas>=0 && promNotas<=4){
			System.out.println("su promedio es"+promNotas);
			System.out.println("perdido el año");
		} else if (promNotas >= 4.01 && promNotas <= 7){
			System.out.println("su promdio es: "+promNotas);
			System.out.println("usted esta suspenso");
		} else if(promNotas >=7 && promNotas <=10){
			System.out.println("supromedio es"+promNotas);
			System.out.println("usted pasa el año");
		}

	}
}