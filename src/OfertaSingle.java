
public class OfertaSingle implements Oferta{
	private int codigo;
	private String descripcion;
	private String tipoContrato;
	private String tiempoContrato;
	
	public OfertaSingle(int codigo,String descripcion, String tipoContrato, String tiempoContrato) {
		this.codigo=codigo;
		this.descripcion = descripcion;
		this.tipoContrato = tipoContrato;
		this.tiempoContrato = tiempoContrato;
	}

	@Override
	public String showOferta() {
		return this.codigo +"  Oferta:  Descripción: "+ this.descripcion+ ", Tipo de contrato: "+ this.tipoContrato+ ", Tiempo de contrato: "+ this.tiempoContrato;
	}
}
