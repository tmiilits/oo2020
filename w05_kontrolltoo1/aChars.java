import java.io.BufferedReader;
import java.io.FileReader;
/**
 * aChars
 * 
 * Tegemata jäi see punkt:
 * Loe kokku, mitu sõna oli ühe, kahe, kolme jne a-tähega. Koosta tabel, kus ridadeks tähtede arv sõnas ning
 veergudeks a-tähtede arv. Lahtris näidatakse, mitu vastavat sõna oli tekstis.
 */

public class aChars{
    public static void main(String[] args)throws Exception{
        
        /**leian kui palju oli väikeseid a tähti ja kui palju oli suuri A tähti */
        BufferedReader reader = new BufferedReader(
            new FileReader("chars.txt"));
        String textFile;
        int uppercaseA = 0;
        int lowercaseA = 0;
        int allChars = 0; // kõikide tähtede loendamiseks 
        String[] words = new String[0];
        
        while ((textFile = reader.readLine()) != null){
            words = textFile.split(" ");
            for (int i = 0; i <= textFile.length() - 1; i++) {
                //järgnevalt loen kokku erinevad a tähed
                if (textFile.charAt(i) == 'A') {
                    uppercaseA++;
                } else if (textFile.charAt(i) == 'a') {
                    lowercaseA++;
                }
                allChars++;
            }
        }

        System.out.println("Tekstifailis oli väikeseid a tähti " + lowercaseA + " ning suuri A tähti " + uppercaseA);
        System.out.println();

        /**leian kui palju oli a-tähti igas sõnas, sõnades keskmiselt, suhtarvuna tähtede üldarvu*/

        int aCharacters = 0;
        float altogetherA = (lowercaseA + uppercaseA);
        int wordstogether = 0; //seda on vaja, et teada mitu sõna on tekstifailis
       

        for (int i = 0; i <= words.length - 1; i++) {
            for (int j = 0; j <= words[i].length() - 1; j++) {
                //siin loen kokku mitu a tähte on ühes kindlas sõnas
                if ((words[i].charAt(j) == 'a') || (words[i].charAt(j) == 'A')) {
                    aCharacters++;
                }
            }
            System.out.println("Sõnas '" + words[i] + "' on a tähti: " + aCharacters);
            aCharacters = 0;
            wordstogether++;

        }
        float avarageA = altogetherA / wordstogether;
        float ratio = allChars / altogetherA;
        /*System.out.println("\nKokku on tähti: " +  allChars);*/
        /*System.out.println("Kokku oli sõnu " + wordstogether);*/
        System.out.println("\nKeskmiselt on sõnades " + String.format("%.1f", avarageA) + " a tähte");
        System.out.println("Suhtarvuna tähtede üldarvu: " + String.format("%.1f", ratio));

        reader.close();

    }
}