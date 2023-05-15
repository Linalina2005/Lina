package Arquitectura;
import java.util.Scanner;
public class Estructura {
	
	double ResultadoDecimal()
		{
			
		//Aquí se pone el precio de la vivienda en las capitales españolas por metro cuadrado
			Scanner n1 = new Scanner(System.in);
			int x;
			System.out.println("Introducir el presupuesto (€):");
			x = n1.nextInt();
			
		//Aquí se pone el precio de la vivienda en las capitales españolas por metro cuadrado
			Scanner n2 = new Scanner(System.in);
			int y;
			System.out.println("Introducir el coste por provincia (€): ");
			y = n2.nextInt();
			
		//Aquí se pone los metros cuadrados de cada sección
			Scanner n3 = new Scanner(System.in);
			int s;
			System.out.println("Introducir los metros cuadrados del salón: ");
			s = n3.nextInt();
			
			Scanner n4 = new Scanner(System.in);
			int b;
			System.out.println("Introducir los metros cuadrados del baño:");
			b = n4.nextInt();
			
			Scanner n5 = new Scanner(System.in);
			int d;
			System.out.println("Introducir los metros cuadrados del dormitorio: ");
			d = n5.nextInt();
			
			Scanner n6 = new Scanner(System.in);
			int c;
			System.out.println("Introducir los metros cuadrados del cocina: ");
			c = n6.nextInt();
			
			double h = 7.5; 
			
			Distribucion f1 = new Distribucion();
			f1.PonerDatos(x,y);
			
			f1.ResultadoDecimal();
			
			double r;
			
			double resta =(double) (f1.ResultadoDecimal() - s - b - c - d);
			
			int habitacion = (int)(resta / h);
			
		//Lo que hae es decirte las medidas de todo y cuantas habitaciones puedes tener solo si el
		//numero es coherente
			
			if(resta > 0)
				{
					System.out.println("Puedes tener: Un salón de " + s + " metros cuadrados, un baño de " + b + " metros cuadrados, "
					+ "\n" + " una cocina de " + c + " metros cuadrados, un dormitorio doble de " + s + " cuadrados y " +
					habitacion + "\n" + "habitaciones de 7.5 metros cuadrados" );
				}

			else 
				{
					System.out.println("No es posible");
				}

			return r = f1.ResultadoDecimal();
			
			
			}


}

