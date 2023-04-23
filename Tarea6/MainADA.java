public class MainADA {
    public static void main(String[] args){
        AlumnoDeportistaArtista ada1 = new AlumnoDeportistaArtista();
        ada1.setNombre("Kohaku Toeru");
        ada1.setEdad(20);
        ada1.setNumeroCuenta(314182852);
        ada1.setCarrera("ICO");
        ada1.setPromedio(8.80);
        ada1.setIdRegistroExtraCurricular(1009927);
        ada1.setDeporte("Baseball");
        ada1.setDisciplina("Piano");
        System.out.println(ada1);
        ada1.competir("Rohto Stadium, Nara");
        ada1.presentar("International Hall, Nara");
    }
}
