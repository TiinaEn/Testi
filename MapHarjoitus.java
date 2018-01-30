import java.util.LinkedHashMap;

public class MapHarjoitus {
    public static void main(String[] args) {

        LinkedHashMap<String, String> paivat =
                new LinkedHashMap<String, String>();
        paivat.put("maanantai", "monday");
        paivat.put("tiistai", "tuesday");
        paivat.put("keskiviikko", "Wednesday");
        paivat.put("torstai", "thursday");
        paivat.put("perjantai", "friday");

/*            for (String avain : paivat.keySet()) {      //käydään keysetti läpi avain kerrallaan. Tämä versio muuttaa pienet alkukirjaimet isoiksi
            String alkio = paivat.get(avain);
            System.out.println(avain+ ", " + alkio.toUpperCase().charAt(0) + alkio.substring(1));
            }*/
            for (String avain : paivat.keySet()) {
            String alkio = paivat.get(avain);
            if (alkio.toUpperCase().charAt(0)==(alkio.charAt(0))) {
                System.out.println(avain+ ", " + alkio.toLowerCase().charAt(0) + alkio.substring(1));
            } else {
                System.out.println(avain+ ", " + alkio.toUpperCase().charAt(0) + alkio.substring(1));
            }

        }
    }
}
//Toinen vaihtoehto:
    // sout(paivat);
    // for(String avain : paivat.keyset()) {
        //Strin alkio = kartta.get(avain);
        //String muutettu = alkio.substring(0, 1).toLowerCase() +
            // alkio.substring(1);
        //kartta .put(avain.muutettu);
    //sout(paivat)

//Kolmas vaihtoehto:
//for (Map.Entry<String, String> pari : kartta.entrySet()){
//Strin alkio = pari.getValue();
//String muutettu = alkio.substring(0, 1).toUpperCase() +
// alkio.substring(1);
//pari.setValue(muutettu):
//}
//sout  (kartta)