
abstract class OfertaDecorator implements Oferta{
	protected Oferta specialOferta;
	
	public OfertaDecorator(Oferta specialDecorator) {
		this.specialOferta=specialDecorator;
	}
	
	public String showOferta() {
		return specialOferta.showOferta();
	}
}
