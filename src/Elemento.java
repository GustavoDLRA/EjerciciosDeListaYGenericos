public class Elemento<T> {
    //La <T> indica que es una clase genérica con un atributo de tipo genérico;
    //Atributos
    public T attrG;
    public Elemento siguiente;
    //Tiene el mismo nombre por lo que será un objeto de la misma clase.
    //Constructores
    public Elemento(T objeto){
        this.attrG=objeto;
        this.siguiente=null;
    //En este constructor mandamos un objeto de tipo T, esa T es una etiqueta puesta en la parte de arriba.
    }

}
