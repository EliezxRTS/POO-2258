public class AlumnoDeportistaArtista extends Alumno implements Deportista,Artista{
    private int idRegistroExtraCurricular;
    private String deporte;
    private String disciplina;

    public AlumnoDeportistaArtista() {
    }

    public AlumnoDeportistaArtista(String nombre, int edad, int numeroCuenta, String carrera, double promedio, int idRegistroExtraCurricular, String deporte, String disciplina) {
        super(nombre, edad, numeroCuenta, carrera, promedio);
        this.idRegistroExtraCurricular = idRegistroExtraCurricular;
        this.deporte = deporte;
        this.disciplina = disciplina;
    }

    public int getIdRegistroExtraCurricular() {
        return idRegistroExtraCurricular;
    }

    public void setIdRegistroExtraCurricular(int idRegistroExtraCurricular) {
        this.idRegistroExtraCurricular = idRegistroExtraCurricular;
    }

    public String getDeporte() {
        return deporte;
    }

    public void setDeporte(String deporte) {
        this.deporte = deporte;
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    @Override
    public String toString() {
        return super.toString() +
                "AlumnoDeportistaArtista{" +
                "idRegistroExtraCurricular=" + idRegistroExtraCurricular +
                ", deporte='" + deporte + '\'' +
                ", disciplina='" + disciplina + '\'' +
                '}';
    }

    @Override
    public int practicar(String disciplina) {
        System.out.println(getNombre() + " practico " + this.disciplina);
        return 0;
    }

    @Override
    public boolean presentar(String ubicacionA) {
        System.out.println(getNombre() + " esta en una presentacion de " + this.disciplina + " en " + ubicacionA);
        return true;
    }

    @Override
    public int entrenar(String deporte) {
        System.out.println(getNombre() + " practico " + this.deporte);
        return 0;
    }

    @Override
    public boolean competir(String ubicacionD) {
        System.out.println(getNombre() + " esta en una competencia de " + this.deporte + " en " + ubicacionD);
        return true;
    }
}