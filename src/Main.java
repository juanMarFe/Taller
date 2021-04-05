import javax.swing.JOptionPane;

public class Main {
	
	
	public static void main(String[] args) {
		Main principal= new Main();
		principal.interfaz();

	}

	private void interfaz() {
		int valorMenPrincipal = -10;
		int valorPersonas = -10;
		int valorEmpresas = -10;
		do{        
	
			valorMenPrincipal = Integer.parseInt(JOptionPane.showInputDialog("1. personas \n"
					+ "2. empresa\n"
					+ "3. oferta\n"
					+ "0. Salir"));
			switch (valorMenPrincipal) {
				case 1:
					{
						do{        
	
							valorPersonas = Integer.parseInt(JOptionPane.showInputDialog("1. tienes una cuenta existente \n"
									+ "2. crear cuenta\n"
									+ "2. modificar cuenta\n"
									+ "0. Salir"));
							switch (valorPersonas) {
								case 1:
									{
										String entradaPersona = JOptionPane.showInputDialog("Por favor ingrese su nombre");
                   						String entradaPerContra = JOptionPane.showInputDialog("Por favor ingrese contraseña");
										break;
									}
								case 2:
									String PersonaNuv = JOptionPane.showInputDialog("Por favor ingrese su nombre");
									String PersonaContraNuv = JOptionPane.showInputDialog("Por favor ingrese contraseña");
				
									break;
								case 3: 
								String entradaPersona1 = JOptionPane.showInputDialog("Por favor ingrese su nombre para modificarlo");
								String entradaPerContra = JOptionPane.showInputDialog("Por favor ingrese contraseña");

									break;
								default:
									break;
							}
						}
						while(valorPersonas!=0);
						break;
					}
				case 2:
				{
					do{        

						valorEmpresas = Integer.parseInt(JOptionPane.showInputDialog("1. tienes una cuenta existente \n"
								+ "2. crear cuenta\n"
								+ "2. modificar cuenta\n"
								+ "0. Salir"));
						switch (valorEmpresas) {
							case 1:
								{
									String entradaEmpresa = JOptionPane.showInputDialog("Por favor ingrese su nombre");
									   String entradaEmpContra = JOptionPane.showInputDialog("Por favor ingrese contraseña");
									break;
								}
							case 2:
								String EmpresaNuv = JOptionPane.showInputDialog("Por favor ingrese su nombre");
								String EmpresaContraNuv = JOptionPane.showInputDialog("Por favor ingrese contraseña");
			
								break;
							case 3: 
							String entradaEmpresa1 = JOptionPane.showInputDialog("Por favor ingrese su nombre para modificarlo");
							String entradaEmpContra = JOptionPane.showInputDialog("Por favor ingrese contraseña");

								break;
							default:
								break;
						}
					}
					while(valorEmpresas!=0);
					break;
				}
				case 3:
					 {

						do{        

							int valorOfertas = Integer.parseInt(JOptionPane.showInputDialog("1.Crear una oferta nueva \n"
									+ "2. ver ofertas\n"
									+ "3. modificar oferta\n"
									+ "0. Salir"));
							switch (valorOfertas) {
								case 1:
									{
										String codigoNuv = JOptionPane.showInputDialog("Por favor ingrese el codigo");
										String descripcionNuv = JOptionPane.showInputDialog("Por favor ingrese una descripcion");
										String tipoNuv = JOptionPane.showInputDialog("Por favor ingrese el tipo de contrato");
										String tiempoNuv = JOptionPane.showInputDialog("Por favor ingrese el tiempo del contrato");
										Oferta nuvOfrt = new OfertaSingle(Integer.parseInt(codigoNuv), descripcionNuv, tipoNuv, tiempoNuv); 
										
										
										break;
									}
								case 2:
									
				
									break;
								case 3: 
								String codigoBusc = JOptionPane.showInputDialog("Por favor ingrese el codigo de la oferta a modificar");
	
									break;
								default:
									break;
							}
						}
						while(valorEmpresas!=0);
					 }

				break;
				default:
					break;
			}
		}
		while(valorMenPrincipal!=0);
		}

	public Main() {
	}   

}
