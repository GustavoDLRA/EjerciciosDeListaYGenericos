public class Contacto {
    //Atributos
    private String nombre;
    private String telefono;
    private String correo;
    private String domicilio;

    //Constructores
    public Contacto(){
        this.nombre="";
        this.telefono="";
        this.correo="";
        this.domicilio="";
    }
    public Contacto(String n, String t, String c, String d){
        this.nombre=n;
        this.telefono=t;
        this.correo=c;
        this.domicilio=d;
    }
    @Override
    public String toString(){
        return "Contacto{"+
                "nombre= "+ nombre + '\''+
                ", telefono= "+telefono +'\''+
                ", correo= "+correo +'\''+
                ", domicilio="+domicilio +'\''+
                '}';
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }
}
