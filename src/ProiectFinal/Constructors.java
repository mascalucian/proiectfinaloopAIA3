package ProiectFinal;

public abstract class Constructors {
    private String nume;
    private String prenume;
    private String specializare;
    private String CNP;

    public final String NUME_DEBUG = "Xulesu";
    public final String PRENUME_DEBUG = "Ion";
    public final String CNP_DEBUG = "0123456789";

    public Constructors(String nume, String prenume, String specializare, String CNP){
        this.nume =nume;
        this.prenume =prenume;
        this.specializare=specializare;
        this.CNP =CNP;
    }
    public Constructors(String nume, String prenume){
        this.nume = nume;
        this.prenume = prenume;
        this.specializare = "N/A";
        this.CNP = "N/A";
    }
    public Constructors() {
        this.nume = NUME_DEBUG;
        this.prenume = PRENUME_DEBUG;
        this.specializare = "N/A";
        this.CNP = CNP_DEBUG;
    }
    public String toString(){
        return nume + " " + prenume + " " + specializare + " " + CNP;
    }
}
