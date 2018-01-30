package fi.academy;

import java.util.ArrayList;
import java.util.List;

public abstract class HenkiloLista {        //abstraktista luokasta ei voi luoda oliota
    private static List<Henkilo> lista = new ArrayList<>();

    static {                //käytetään staattista aloituslohkoa, koska konstruktoria ei voi käyttää koska abstract. Tänne voidaan nyt alustaa muuttujia konstruktorin sijaan
        lista.add(new Henkilo("Tara", "Peini", 16));        //Jos olisi main.luokka, voitaisiin alustaa siellä
    }

    public Henkilo haeNimella(String etunimi) {
        return null;
    }
    public static List<Henkilo> haeKaikki() {      //ei.staattinen metodi eli tähän metodiin ei päästä kiinni luokan ulkopuolelta. Lisättiin Static, ja nyt päästään käsiksi luokan ulkopuolelta
        return lista;
    }
    public static  void LisaaHenkilo (Henkilo uusi) {
        lista.add(uusi);
    }
}
