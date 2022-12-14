package coleccion_map;

public class Alumno {

    private int idAlumno;
    private String nombre;
    private double estatura;

    public Alumno() {
    }

    public Alumno(int idAlumno, String nombre, double estatura) {
        this.idAlumno = idAlumno;
        this.nombre = nombre;
        this.estatura = estatura;
    }

    public int getIdAlumno() {
        return idAlumno;
    }

    public void setIdAlumno(int idAlumno) {
        this.idAlumno = idAlumno;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getEstatura() {
        return estatura;
    }

    public void setEstatura(double estatura) {
        this.estatura = estatura;
    }

    @Override
    public String toString() {
        return "Alumno{" + "idAlumno=" + idAlumno + ", nombre=" + nombre + ", estatura=" + estatura + '}';
    }

}
