
public class Cuenta extends User{
	private String name = "";
	   private String password = "";
	   
	   private boolean acceso=false;
	   
	   
	   public String get_login(){
	return this.name;
	  }
	public void C_Cuenta(String Uname, String Upassword){
	this.name = Uname;
	this.password = Upassword;
	
	}
	public String get_password(){
	return this.password;
	}
	public boolean ingresar(String Uname1, String Upassword1){
	if (Uname1==this.name && Upassword1==this.password){
	  System.out.println("Los datos son correctos, bienvenido");
	  this.acceso=true;
	  return this.acceso;
	}
	else{
		System.out.println("Los datos son incorrectos, el sistema se autodestruira en 5...4...3...2...1... Bye");
		return this.acceso;
	}
	}
	public String gettipoUsuario(){
	   return "empleado";
	   
	  }
	public void D_Cuenta(String Uname1, String Upassword1) {
		if (Uname1==this.name && Upassword1==this.password){
			  System.out.println("La verificación ha sido correcta, la cuenta ha sido eliminada");
			  this.name=null;
			  this.password=null;
			}
			else{
				System.out.println("Los datos son incorrectos, la cuenta no ha sido borrada");
				
			}
	}
	 public void U_Cuenta(String Uname1, String Upassword1, String NUname1, String NUpassword1) {
		 if (Uname1==this.name && Upassword1==this.password){
			  System.out.println("La verificación ha sido correcta, la cuenta ha sido actualizada");
			  this.name=NUname1;
			  this.password=NUpassword1;
			}
			else{
				System.out.println("Los datos son incorrectos, los datos no han sido actualizados");
				
			}
	 }
	 public void R_Cuenta(String Uname1) {
		 if(this.name==Uname1) {
		 System.out.println("Los datos de la cuenta son: "+ this.name +"/n"+ this.password);
	 }
		 else {
			 System.out.println("Esa cuenta no existe");
		 }
}
}
