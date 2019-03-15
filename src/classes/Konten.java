package classes;


public class Konten {
    public int kontostand;
    public String name;
    public String kontonummer;

    public Konten(String kontonummer, String name, int kontostand){
        this.kontostand = kontostand;
        this.name = name;
        this.kontonummer = kontonummer;
    }


    public int getKontostand(){
        return kontostand;
    }

    public void setKontostand(int kontostand){
        this.kontostand = kontostand;
    }


    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getKontonummer(){
        return kontonummer;
    }

    public void setKontonummer(){
        this.kontonummer = kontonummer;
    }



}
