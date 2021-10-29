package ProiectFinal;

public class Clasa{
    private String clasa;
    private String litera;
    private String specializare;
    private String nrelevi;
    private int index;

    private static Clasa _instance;

    private Clasa(String clasa, String litera, String specializare, String nrelevi){
        this.clasa=clasa;
        this.litera = litera;
        this.specializare = specializare;
        this.nrelevi=nrelevi;
    }
    private Clasa(String clasa, String specializare, String nrelevi){
        this.clasa=clasa;
        this.litera ="";
        this.specializare = specializare;
        this.nrelevi=nrelevi;
    }
    private Clasa(String clasa, String nrelevi){
        this.clasa=clasa;
        this.litera ="";
        this.specializare ="";
        this.nrelevi=nrelevi;
    }

    private Clasa() {
        this.clasa="";
        this.litera ="";
        this.specializare ="";
        this.nrelevi="";
    }

    public void setEverything(String clasa, String litera, String specializare, String nrelevi) {
        setClasa(clasa);
        setLitera(litera);
        setSpecializare(specializare);
        setNrelevi(nrelevi);
    }

    public static Clasa getInstance() {
        if (null == _instance) {
            _instance = new Clasa();
        }
        return _instance;
    }

    public String getClasa(){
        return clasa;
    }
    public String getLitera(){
        return litera;
    }
    public String getSpecializare(){
        return specializare;
    }
    public String getNrelevi(){
        return nrelevi;
    }
    private void setClasa(String clasa) {this.clasa=clasa;}
    private void setLitera(String litera) {this.litera=litera;}
    private void setSpecializare(String specializare) {this.specializare=specializare;}
    private void setNrelevi(String nrelevi) {this.nrelevi=nrelevi;}
}
