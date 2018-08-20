package lambdas_primer_acercamiento;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Factura {
	
	private Boolean emitida;
	private Double total;
	private List<DetalleFactura> detalles = new ArrayList<DetalleFactura>();
	
	
	public Factura() {
		super();
	}
	

	
	/**
	 * Imprimir todos los detalles de la factura
	 */
	public void printDetails() {
		this.getDetalles().stream().
			forEach(d -> System.out.println(d.toString()));
	}
	
	/**
	 * Imprimir todos los detalles de la factura con for
	 */
	public void printDetailsFor() {
		
		for(DetalleFactura f: this.getDetalles()) {
			System.out.println(f.toString());
		}
	}
	
	/**
	 * @param pvp
	 * Imprimer todos los detalles con PVP < pvp
	 */
	public void printDetailsConPVPMenor(double pvp) {
		this.getDetalles().stream().filter(d -> d.getPvp() < pvp).forEach(d -> System.out.println(d.toString()));
	}
	
	/**
	 * @param pvp
	 * Imprimer todos los detalles con PVP < pvp
	 */
	public void printDetailsConPVPMenorFor(double pvp) {
		for(DetalleFactura f: this.getDetalles()) {
			if(f.getPvp()<pvp) {
				System.out.println(f.toString());
			}
		}
	}
	
	/**
	 * @param pvp
	 * Imprimer todos los detalles con PVP < pvp
	 */
	public void printDetailsConPVPMayor(double pvp) {
		this.getDetalles().stream().filter(d -> d.getPvp() > pvp).forEach(d -> System.out.println(d.toString()));
	}
	
	public void printTotal() {
	
		System.out.println(this.getDetalles().stream().mapToDouble(p -> p.getPvp()).sum());
	}
	
	public void printTotalFor() {
		double cont = 0;
		for(DetalleFactura f: this.getDetalles()) {
			cont += f.getPvp();
		}
		
		System.out.println(cont);
	}
	
	
	public Factura(List<DetalleFactura> detalles) {
		super();
		this.detalles = detalles;
	}
	
	public void addDetalle(DetalleFactura df) {
		this.detalles.add(df);
	}
	
	public Boolean getEmitida() {
		return emitida;
	}
	public void setEmitida(Boolean emitida) {
		this.emitida = emitida;
	}
	public Double getTotal() {
		return total;
	}
	public void setTotal(Double total) {
		this.total = total;
	}
	public List<DetalleFactura> getDetalles() {
		return detalles;
	}
	public void setDetalles(List<DetalleFactura> detalles) {
		this.detalles = detalles;
	}



	
	
	
}
