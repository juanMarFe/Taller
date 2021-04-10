import java.util.ArrayList;
import java.util.Iterator;

public class PermisoProxy implements IPermiso {

	private Permiso permiso;
	private User user;
	private ArrayList<User> lista;
	// Toca adicionar a la clase user contraseña, usuario y tipo de usuario.

	public PermisoProxy(User user, ArrayList<User> lista) {
		this.user = user;
		this.lista = lista;
	}

	@Override
	public String validarPermisos() {
		boolean temp = true;
		User usuarioC= null;

		for (int i = 0; i < lista.size(); i++) {
			if (user.get_login().equals(lista.get(i).get_login())
					&& user.get_password().equals(lista.get(i).get_password())) {
				permiso = new Permiso();
				permiso.validarPermisos();
				usuarioC= lista.get(i);
				temp = false;
				break;
			}
		}
		if (temp) {
			System.out.print("No tiene permiso para realizar esta accion");
		}
		
		if (usuarioC!=null) {
			return usuarioC.gettipoUsuario();
		}else {
			return null;
		}

	}

}