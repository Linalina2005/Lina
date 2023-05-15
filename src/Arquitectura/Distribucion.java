package Arquitectura;
import java.util.Scanner;
public class Distribucion {
	
	
	//Esta clase es para hallar los metros cuadrados que necesitariamos
	
	

	//Esta clase es para hallar los metros cuadrados que necesitariamos
	
	int presupuesto;
	int coste;
	void PonerDatos (int x, int y)
		{
			presupuesto = x;
			coste = y;
		}
	double ResultadoDecimal()
		{
			double resultado = presupuesto/coste;
			System.out.println(resultado + " metros cuadrados");
			
			return resultado;
		}
}
