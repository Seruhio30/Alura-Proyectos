public class AlumnoTest {
    public static void main(String[] args) {
        Alumno a1 = new Alumno("Juan");
        Alumno a2 = new Alumno("Paco");

        Vector lista = new Vector();


        System.out.println(lista.tamanio());
        lista.adicionar(a1);
        System.out.println(lista.tamanio());
        lista.adicionar(a2);
        System.out.println(lista.tamanio());

        lista.adicionar(a1);
        lista.adicionar(a2);
        System.out.println(lista
        );
        System.out.println(lista.contiene(a1));

        Alumno a3 = new Alumno("Danilo");
        System.out.println(lista.contiene(a3));

        Alumno x = lista.obtener(0);
        System.out.println(x);

        lista.adicionaEnCualquierPocision(1, a3);
        System.out.println(lista);
    }
}