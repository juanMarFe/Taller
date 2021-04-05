import java.util.ArrayList;

public class Single {
	static private Single singleton = null;
	private ArrayList<Oferta> ofertas;

	private Single() {
		ofertas = new ArrayList<Oferta>();
	}

	public static Single crearInstaSingleton() {

		if (singleton == null) {
			singleton = new Single();
		}

		return singleton;
	}

	public void nuevaOferta(Oferta oferta) {
		this.ofertas.add(oferta);
	}

	public String verOfertas() {
		String temp = "Ofertas: \n";
		for (int i = 0; i < ofertas.size(); i++) {
			temp += ofertas.get(i).showOferta() + "\n";
		}
		return temp;

	}

	public Oferta buscarOferta(String codigo) {
		try {
			Oferta temp = new OfertaSingle(-1, "", "", "");
			;
			for (int i = 0; i < ofertas.size(); i++) {
				if (ofertas.get(i).showOferta().startsWith(codigo)) {
					temp = ofertas.get(i);
				}
			}

			if (temp.showOferta().startsWith("-1")) {
				return null;
			} else {
				return temp;
			}
		} catch (Exception e) {
			System.out.println(e);

			return null;
		}
	}

	public boolean borrarOferta(String oferta) {
		try {
			boolean i= false;
			Oferta temp=buscarOferta(oferta);
			
			if(temp!=null) {
				for (int j = 0; j < ofertas.size(); j++) {
					if (ofertas.get(j)==temp) {
						ofertas.remove(j);
						i=true;
					}
				}
			}
			
			return i;
		} catch (Exception e) {
			System.out.println(e);
			return false;
		}
	}
	
	
	public boolean updateOferta(Oferta nuevo, String borrar) {
		
		try {
			if(buscarOferta(borrar)!=null) {
				
			}else {
				return false;
			}
			
			return false;
		} catch (Exception e) {
			
			return false;
		}
		
	}
	
	// test
}
