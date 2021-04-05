import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		/*Single s = new Single();
		s.C_Cuenta("Paco", "1234");
		s.R_Cuenta("paco");
		s.U_Cuenta("paco", "1234", "donald", "4567");
		s.ingresar("donald", "4567");
		s.D_Cuenta("donald", "4567");
		
		s.C_Empresa("monster", "1234");
		s.R_Empresa("monster");
		s.U_Empresa("monster", "1234", "energy", "4567");
		s.D_Empresa("energy", "4567");
*/
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
				default:
					break;
			}
		}
		while(valorMenPrincipal!=0);
		}

}
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
