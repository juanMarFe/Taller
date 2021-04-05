import java.util.ArrayList;

public class Single {
	static private Single singleton = null;
	private ArrayList<Oferta> ofertas;
	private ArrayList<EmpresaComposite> empresas;
	
	
	private Single() {

		empresas = new ArrayList<EmpresaComposite>();
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
	
	
	// ADAPTER
	//CRUD CUENTA
		
		
		 public void C_Cuenta(String A, String B) {
			 Cuenta cuenta = new Cuenta();
			 cuenta.C_Cuenta(A, B);
		 }
		 public void R_Cuenta(String Uname) {
			 Cuenta cuenta = new Cuenta();
			 cuenta.R_Cuenta(Uname);
		 }
		 public void U_Cuenta(String A, String B, String NA, String NB) {
			 Cuenta cuenta = new Cuenta();
			 cuenta.U_Cuenta(A, B, NA, NB);
		 }
		 public void D_Cuenta(String A, String B) {
			 Cuenta cuenta = new Cuenta();
			 cuenta.D_Cuenta(A, B);
		 }
		 public boolean ingresar(String A, String B) {
			 Cuenta cuenta = new Cuenta();
			return cuenta.ingresar(A, B);
		 }

		 //CRUD EMPRESA
		 public void C_Empresa(String A, String B) {
			 EmpresaAdapter empresa = new EmpresaAdapter();
			 empresa.C_Cuenta(A, B);
		 }
		 public void R_Empresa(String Uname) {
			 EmpresaAdapter empresa = new EmpresaAdapter();
			 empresa.R_Cuenta(Uname);
		 }
		 public void U_Empresa(String A, String B, String NA, String NB) {
			 EmpresaAdapter empresa = new EmpresaAdapter();
			 empresa.U_Cuenta(A, B, NA, NB);
		 }
		 public void D_Empresa(String A, String B) {
			 EmpresaAdapter empresa = new EmpresaAdapter();
			 empresa.D_Cuenta(A, B);
		 }
		 
		 public void nuevaEmpresa(EmpresaComposite empresa) {
				this.empresas.add(empresa);
			}

			public String verEmpresas() {
				String temp = "Empresas: \n";
				for (int i = 0; i < empresas.size(); i++) {
					temp += empresas.get(i).datos() + "\n";
				}
				return temp;

			}

			public EmpresaComposite buscarEmpresa(String nit) {
				try {
					EmpresaComposite temp = new EmpresaComposite("-1", "", "", " ");
					;
					for (int i = 0; i < empresas.size(); i++) {
						if (empresas.get(i).datos().startsWith("El NIT es: " + nit)) {
							temp = empresas.get(i);
						}
					}

					if (temp.datos().startsWith("-1")) {
						return null;
					} else {
						return temp;
					}
				} catch (Exception e) {
					System.out.println(e);

					return null;
				}
			}

			public boolean borrarEmpresa(String nit) {
				try {
					boolean i= false;
					EmpresaComposite temp=buscarEmpresa(nit);
					
					if(temp!=null) {
						for (int j = 0; j < empresas.size(); j++) {
							if (empresas.get(j)==temp) {
								empresas.remove(j);
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
			
			
			public boolean updateEmpresas(EmpresaComposite nuevo, String nitCambiar) {
				
				try {
					if(buscarEmpresa(nitCambiar)!=null) {
		                            borrarEmpresa(nitCambiar);
		                            nuevaEmpresa(nuevo);
		                            return true;
					}else {
		                            return false;
					}
				} catch (Exception e) {
					
					return false;
				}
				
			}
		        
		        public boolean ingresar(EmpresaComposite empresa){
		            String nit=empresa.getNit();
		            String contra = empresa.getContrasena();
		            boolean ingresar=false;
		            for (int i = 0; i < empresas.size(); i++) {
		                if ((empresas.get(i).datos().startsWith("El NIT es: " + nit))&& (empresas.get(i).getContrasena().equals(contra))) {
		                    ingresar = true;
		                    break;
		                }
		                else
		                {
		                    ingresar = false;
		                }
		        }
		         return ingresar;
		}
		 

}
