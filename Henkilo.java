package fi.academy;

import java.util.Comparator;

public class Henkilo implements Comparable<Henkilo> {

    private String etunimi;
    private String sukunimi;
    private int ika;

    public Henkilo() {                      //parametriton konstukrtori
        this("", "", 0); //kutsuu allaolevaa Henkilo-konstruktoria ja sitä kautta Kantaluokan konstuktoria
    }

    public Henkilo(String etunimi, String sukunimi, int ika) {
        super();        //kutsuu kantaluokan konstruktoria. Konstruktori kutsuu aina ensin jotain toista konstruktoria!! Tässä tapauksessa kantaluokan konstruktoria
        this.etunimi = etunimi;
        this.sukunimi = sukunimi;
        this.ika = ika;
    }

    public String getEtunimi() {
        return etunimi;
    }

    public void setEtunimi(String etunimi) {
        this.etunimi = etunimi;
    }

    public String getSukunimi() {
        return sukunimi;
    }

    public void setSukunimi(String sukunimi) {
        this.sukunimi = sukunimi;
    }

    public int getIka() {
        return ika;
    }

    public void setIka(int ika) {
        if (ika < 0) return;    //jos säännöt unohtuu, täällä varmistus. Ei suoraan jäsenmuuttujaan, vaan tänne metodiin
        this.ika = ika;
    }

    @Override
    public String toString() {
        return this.etunimi + " " + this.sukunimi + " ," + ika + " vuotta";

    }

  /*    public String toString() {
        return "" + this.etunimi + " " + this.sukunimi + ", " + this.ika;
    }*/


    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        Henkilo h = (Henkilo) obj;
        if (etunimi.equals(h.etunimi) && sukunimi.equals(h.sukunimi)) {
            return true;
        }
        return false;
    }

    @Override
    public int compareTo(Henkilo o) {     //
        if (this.etunimi.compareTo(o.etunimi) != 0) {
            return this.etunimi.compareTo(o.etunimi);
        }
        return this.ika - o.ika;
    }
    /*    public Henkilo samaNimi (Henkilo henkilo){
        if (etunimi.equals(etunimi) && sukunimi.equals(sukunimi)) {
            System.out.println("Sama henkilö!");
        }
        return henkilo;*/
}







