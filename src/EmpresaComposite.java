import java.util.ArrayList;

public class EmpresaComposite implements ComponenteComposite {

    private String nit;
    private String nombre;
    private String direccion;
    private String contrasena;
    private ArrayList <ComponenteComposite> EmpresasYConvocatorias;

    public EmpresaComposite() {
        setNit(" ");
        setNombre(" ");
        setDireccion(" ");
        setContrasena(" ");
        setEmpresas(new ArrayList<>());
    }

    public EmpresaComposite(String nit, String nombre, String direccion, String contrasena) {
        this.nit = nit;
        this.nombre = nombre;
        this.direccion = direccion;
        this.contrasena = contrasena;
        setEmpresas(new ArrayList<>());
    }

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    
    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public ArrayList<ComponenteComposite> getEmpresas() {
        return EmpresasYConvocatorias;
    }

    public void setEmpresas(ArrayList<ComponenteComposite> Empresas) {
        this.EmpresasYConvocatorias = Empresas;
    }
    
    public void add(ComponenteComposite c){
        getEmpresas().add(c);
    }
    
    
    @Override
    public String datos() {
        String todo="El NIT es: "+getNit()+", el nombre es: "+getNombre()+", la direccion es: "+getDireccion()+"\n";
        for (int i = 0; i < EmpresasYConvocatorias.size(); i++) {
            todo += EmpresasYConvocatorias.get(i).datos();
        }
        return todo;
    }
}
