public class Empresa {
	private String name = "";
	   private String password = "";
	   private boolean acceso=false;
	   
	   
	   public String Diferente1(){
	return this.name;
	  }
	public void Diferente2(String Uname, String Upassword){
	this.name = Uname;
	this.password = Upassword;
	
	}
	public String Diferente3(){
	return this.password;
	}
	public boolean Diferente4(String Uname1, String Upassword1){
	if (Uname1==this.name && Upassword1==this.password){
	  System.out.println("Los datos son correctos, bienvenido "+ Diferente5());
	  this.acceso=true;
	  return this.acceso;
	}
	else{
		System.out.println("Los datos son incorrectos, el sistema se autodestruira en 5...4...3...2...1... Bye");
		return this.acceso;
	}
	}
	public String Diferente5(){
	   return "empleado";
	   
	  }
	public void Diferente6(String Uname1, String Upassword1) {
		if (Uname1==this.name && Upassword1==this.password){
			  System.out.println("La verificación ha sido correcta, la cuenta ha sido eliminada");
			  this.name=null;
			  this.password=null;
			}
			else{
				System.out.println("Los datos son incorrectos, la cuenta no ha sido borrada");
				
			}
	}
	 public void Diferente7(String Uname1, String Upassword1, String NUname1, String NUpassword1) {
		 if (Uname1==this.name && Upassword1==this.password){
			  System.out.println("La verificación ha sido correcta, la cuenta ha sido actualizada");
			  this.name=NUname1;
			  this.password=NUpassword1;
			}
			else{
				System.out.println("Los datos son incorrectos, los datos no han sido actualizados");
				
			}
	 }
	 public void Diferente8(String Uname1) {
		 if(this.name==Uname1) {
			 System.out.println("Los datos de la cuenta son: "+ this.name +"/n"+ this.password);
		 }
			 else {
				 System.out.println("Esa cuenta no existe");
			 }
	}
	}