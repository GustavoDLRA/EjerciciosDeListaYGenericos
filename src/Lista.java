public class Lista<T> {
    Elemento<T> inicio, pivote;
    int nelementos;

    public Lista() {
        inicio = pivote = null;
        nelementos = 0;
    }

    public Lista(Elemento<T> objeto) {
        inicio = pivote = objeto;
        nelementos = 1;
    }

    public void insertar(Elemento<T> objeto) {
        if (nelementos == 0) {
            //nelementos ++; Se movió para afuera porque se repite.
            inicio = pivote = objeto;
        } else {
            //nelementos++; Se movió para afuera porque se repite.
            //Objeto es de tipo Elemento. Necesitmos ver
            objeto.siguiente = inicio;
            inicio = pivote = objeto;
        }
        nelementos++;
        //Si en un If, encontramos las mismas líneas de código, estas se tienen que poner afuera.

    }

    public String recorrer() {
        String datos = "";
        pivote = inicio;
        for (int i = 0; i < nelementos; i++) {
            datos += pivote.attrG.toString() + "->";
            pivote = pivote.siguiente;
        }
        return datos;
    }
    public void eliminar(){
        inicio = inicio.siguiente;
        nelementos--;
        if (nelementos == 0) {
            inicio=pivote=null;
        }
    }
    public void eliminaDespues(){
        /*pivote=inicio.siguiente;
        nelementos--;
        if (nelementos==0){
            inicio=pivote=null;
        }*/
        if (nelementos==1) {
            inicio=pivote=null;
        }
        for(int i=1;i<nelementos;i++){
            pivote=pivote.siguiente;
        }
        pivote.siguiente=null;
        nelementos--;
    }
}
