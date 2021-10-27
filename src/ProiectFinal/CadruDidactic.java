package ProiectFinal;

public class CadruDidactic implements IPersoana{
    private String _nume;
    private String _prenume;
    private String _CNP;
    private String _specializare;

    public CadruDidactic() {
        _nume = "N/A";
        _prenume = "N/A";
        _specializare = "N/A";
        _CNP = "N/A";
    }

    public CadruDidactic(String nume, String prenume) {
        _nume = nume;
        _prenume = prenume;
        _specializare = "N/A";
        _CNP = "N/A";
    }
    public CadruDidactic(String nume, String prenume, String specializare, String CNP) {
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
    public String getPreume() {
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
