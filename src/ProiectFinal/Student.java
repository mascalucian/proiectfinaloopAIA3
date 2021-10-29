package ProiectFinal;

public class Student implements IPersoana{
    private String _nume;
    private String _prenume;
    private String _CNP;
    private String _specializare;

    public final String NUME_DEBUG = "Xulesu";
    public final String PRENUME_DEBUG = "Ion";
    public final String CNP_DEBUG = "0123456789";

    public Student() {
        _nume = NUME_DEBUG;
        _prenume = PRENUME_DEBUG;
        _specializare = "N/A";
        _CNP = CNP_DEBUG;
    }

    public Student(String nume, String prenume) {
        _nume = nume;
        _prenume = prenume;
        _specializare = "N/A";
        _CNP = CNP_DEBUG;
    }
    public Student(String nume, String prenume, String specializare, String CNP) {
        _nume = nume;
        _prenume = prenume;
        _specializare = specializare;
        _CNP = CNP;
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
