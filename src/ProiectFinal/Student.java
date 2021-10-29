package ProiectFinal;

public class Student extends Constructors implements IPersoana{
    private String _nume;
    private String _prenume;
    private String _specializare;
    private String _CNP;

    public Student() {
        super();
    }

    public Student(String nume, String prenume) {
        super(nume, prenume);
    }
    public Student(String nume, String prenume, String specializare, String CNP) {
        super(nume,prenume,specializare,CNP);
    }

    @Override
    public String toString(){
        return super.toString();
    }

    @Override
    public String getNume() {
        return _nume;
    }

    @Override
    public String getPrenume() {
        return _prenume;
    }

    @Override
    public String getSpecializare() {
        return _specializare;
    }

    @Override
    public String getCNP() {
        return _CNP;
    }
}
