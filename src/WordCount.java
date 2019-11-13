import java.io.File;
import java.util.Scanner;

public class WordCount {

    public static void main(String[] args) throws Exception { //wyrzuca potencjalne wyjatki

        File file = new File("text2.txt"); //nowy obiekt - file ze sciezka do pliku
        Scanner user = new Scanner(file); //scanner o nazwie user ktory skanuje plik file
        int words=0; // poczatkowa wartosc slow
        while (user.hasNextLine()) { // sprawdza czy w pliku jest nastepna linia
            String line=user.nextLine(); //sprawdza co jest w linii (stringi)
            words+=line.split(" ").length; // dodaje ilsoc znaków odzienych spacja (słow)
        }

        /* cały loop sprawdza plik, sprawdza czy są w nim nastepne linijki, w linijkach liczy ilosć znaków
        odzielonych spacja czyli słow
         */
        System.out.println(words);// wyswietla liczbe słow

    }

}
