public class Clasa {
    private String clasa;
    private final String LITERA;
    private final String SPECIALIZARE;
    private String nrelevi;
    private int index;

    public Clasa(String clasa,String LITERA,String SPECIALIZARE,String nrelevi){
        this.clasa=clasa;
        this.LITERA=LITERA;
        this.SPECIALIZARE=SPECIALIZARE;
        this.nrelevi=nrelevi;
    }
    public Clasa(String clasa,String SPECIALIZARE,String nrelevi){
        this.clasa=clasa;
        this.LITERA="";
        this.SPECIALIZARE=SPECIALIZARE;
        this.nrelevi=nrelevi;
    }
    public Clasa(String clasa,String nrelevi){
        this.clasa=clasa;
        this.LITERA="";
        this.SPECIALIZARE="";
        this.nrelevi=nrelevi;
    }

    public String getClasa(){
        return clasa;
    }
    public String getLitera(){
        return LITERA;
    }
    public String getSpecializare(){
        return SPECIALIZARE;
    }
    public String getNrelevi(){
        return nrelevi;
    }
    public void setClasa(String clasa) {this.clasa=clasa;}
    public void setNrelevi(String nrelevi) {this.nrelevi=nrelevi;}

}
