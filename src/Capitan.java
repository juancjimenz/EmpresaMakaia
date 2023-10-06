public class Capitan {
    private String nombre;
    private String apellido;
    private String matriculaDeNavegacion;


    public Capitan() {}

    public Capitan(String nombre, String apellido, String matriculaDeNavegacion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.matriculaDeNavegacion = matriculaDeNavegacion;
    }

    public String getNombre() {

        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getMatriculaDeNavegacion() {
        return matriculaDeNavegacion;
    }

}
