package lambdas_primer_acercamiento;

public class DetalleFactura {
	
	
	private String concepto;
	private String modelo;
	private Double pvp;
	private Integer iva = 21;
	private Double neto;
	
	
	public DetalleFactura(String concepto, String modelo, Double pvp) {
		this.concepto = concepto;
		this.modelo = modelo;
		this.pvp = pvp;
	}
	
	public DetalleFactura() {
		super();
	}
	
	public String getConcepto() {
		return concepto;
	}
	public void setConcepto(String concepto) {
		this.concepto = concepto;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public Double getPvp() {
		return pvp;
	}
	public void setPvp(Double pvp) {
		this.pvp = pvp;
	}
	
	public Integer getIva() {
		return iva;
	}
	public void setIva(Integer iva) {
		this.iva = iva;
	}

	public Double getNeto() {
		return neto;
	}

	public void setNeto(Double neto) {
		this.neto = neto;
	}
	
	@Override
	public String toString() {
		
		StringBuilder sb = new StringBuilder().append("Concepto:" + this.getConcepto()).
				append(" Modelo:" + this.getModelo()).
				append(" PVP:" + this.getPvp()).
				append(" IVA:" + this.getIva()).
				append(" Neto:" + this.getNeto());
		return sb.toString();
	}
	
	
	

}
