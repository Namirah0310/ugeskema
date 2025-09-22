package UgeSkema;

public class Legend {
    private String navn;
    private String farve;

    //konstruktør til initialisering af objekt
    public Legend (String navn, String farve) {
        this.navn = navn;
        this.farve = farve;
    }

    //Get
    public String getNavn() {
        return navn;
    }

    public String getFarve() {
        return farve;
    }

    //Set
    public void setNavn(String navn) {
        this.navn = navn;
    }

    public void setFarve(String farve) {
        this.farve = farve;
    }




}
