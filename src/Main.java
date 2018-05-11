
public class Main {

    public static void main(String[] args) {
        Contacto c1 = new Contacto("Juan","833","juan@juan.com","Calle 10");
        Contacto c2 = new Contacto("Maria","899","maria@gmaria","Calle 9");
        Contacto c3 = new Contacto("Gustavo","218","gus@gmail.com","Tampico.");

        Elemento<Contacto> primero = new Elemento<>(c1);
        Elemento<Contacto> segundo = new Elemento<>(c2);
        Elemento<Contacto> tercero = new Elemento<>(c3);
       // primero.siguiente=segundo;
        Lista<Contacto> listaC= new Lista<> (primero);
        listaC.insertar(segundo);
        listaC.insertar(tercero);
        System.out.println(listaC.nelementos);
        System.out.println(listaC.recorrer());
        //listaC.eliminar();
        //System.out.println(listaC.nelementos + "\n" + listaC.recorrer());
        listaC.eliminaDespues();
        System.out.println(listaC.nelementos + "\n" + listaC.recorrer());
    }
}
