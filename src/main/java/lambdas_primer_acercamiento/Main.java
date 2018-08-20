package lambdas_primer_acercamiento;

import java.time.Duration;
import java.time.LocalTime;

/**
 * En esta clase y solo a fectos ejemplo
 * se incluye solo lógica de de impresion 
 * que está en la clase Factura.
 * 
 */

import java.util.List;
import java.util.Optional;
import java.util.Random;
import java.util.stream.Collectors;

import lambdas_primer_acercamiento.utils.FacturaUtils;

public class Main {
	

 
    private static final String CONCEPTO = "Concepto Felix";
    private static final String MODELO = "Modelo Felix";
    private static final Integer MAX_DETAIL_ITEMS = 10000;
    
   

	public static void main(String[] args) {
		
		Factura f = FacturaUtils.initFacturaWithRandomValues(MAX_DETAIL_ITEMS);
		LocalTime localTime1 = LocalTime.now();
	

		//Para hacer busquedas sustituimos un item (35) en la lista de detalles.
		f.getDetalles().set(6, new DetalleFactura(CONCEPTO, MODELO, 23.45));
	
		System.out.println("----------- todos los detalles ----------\n");
		f.printDetails();
		FacturaUtils.getElapsedTime(localTime1);
		System.out.println("\n........................................\n");
		
		
		System.out.println("----------- todos los detalles con for ----------\n");
		localTime1 = LocalTime.now();
		f.printDetailsFor();
		FacturaUtils.getElapsedTime(localTime1);
		System.out.println("\n........................................\n");
		
		
		
		
		System.out.println("----------- PVP < 50.5 ----------\n");
		localTime1 = LocalTime.now();
		f.printDetailsConPVPMenor(50.5);
		FacturaUtils.getElapsedTime(localTime1);
		System.out.println("\n........................................\n");
		System.out.println("----------- PVP < 50.5 con for----------\n");
		localTime1 = LocalTime.now();
		f.printDetailsConPVPMenorFor(50.5);
		FacturaUtils.getElapsedTime(localTime1);
		System.out.println("\n........................................\n");
		
		
		System.out.println("----------- PVP > 50.5 ----------\n");
		f.printDetailsConPVPMayor(50.5);
		FacturaUtils.getElapsedTime(localTime1);
		
		System.out.println("\n........................................\n");

		
		System.out.println("----------- TOTAL FACTURA  ----------\n");
		localTime1 = LocalTime.now();
		f.printTotal();
		FacturaUtils.getElapsedTime(localTime1);
		
		System.out.println("----------- TOTAL FACTURA con for----------\n");
		localTime1 = LocalTime.now();
		f.printTotalFor();
		FacturaUtils.getElapsedTime(localTime1);
		
		
	

	}
	

}
