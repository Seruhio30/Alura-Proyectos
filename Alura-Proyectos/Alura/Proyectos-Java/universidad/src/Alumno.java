public class Alumno {

    private String nombre;

    public Alumno(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public boolean equals(Object obj) {
        Alumno otro = (Alumno) obj;
        return otro.getNombre().equals(this.nombre);
    }

    @Override
    public String toString() {
        return nombre;
    }
}