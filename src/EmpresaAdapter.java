
public class EmpresaAdapter extends User {
	 private Empresa empresa; 
	   public EmpresaAdapter(){
	     super();
	     this.empresa = new Empresa();
	   }
	   public String get_login(){
	return this.empresa.Diferente1();
	  }
	public void C_Cuenta(String Uname, String Upassword){
	this.empresa.Diferente2(Uname,Upassword);
	}
	public String get_password(){
	return this.empresa.Diferente3();
	}
	public boolean ingresar(String Uname1, String Upassword1){
	return this.empresa.Diferente4(Uname1,Upassword1);
	}
	public String gettipoUsuario(){
	return this.empresa.Diferente5();
	  }
	public void D_Cuenta(String Uname1,String Upassword1) {
		 this.empresa.Diferente6(Uname1, Upassword1);
	}
	public void U_Cuenta(String Uname1,String Upassword1,String NUname1, String NUpassword1) {
		this.empresa.Diferente7(Uname1, Upassword1,NUname1,NUpassword1);
	}
	public void R_Cuenta(String Uname1) {
		this.empresa.Diferente8(Uname1);
	}
}