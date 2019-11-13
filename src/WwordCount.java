import java.util.Scanner;
import java.io.File;

public class WwordCount {
    public static void main(String[] args) throws Exception { // wyrzuca potencjalne wyjątki
        File myBook = new File("1342-0.txt"); //dodany obiekt myBook i podana jego sciezka
        Scanner nazwaScannera = new Scanner(myBook); // scanner ma skanowac plik- mybook
        int words = 0; //początkowa wartosc słów
        while(nazwaScannera.hasNext()); {// loop ktory sprawdza czy jest kolejna linia w pliku
            String line = nazwaScannera.nextLine(); // sprawdzamy co jest w linii
            words += line.split(" ").length; //dodaje do words liczbe znaków odzielonych spacją (słow) do siebie

/* cały loop
sprawdza linijka po linicje ilosć słow i dodaje do siebie
 */
        }
            System.out.println("myBook contains: " + words + "words."); //wysywietla sume slow w książce






    }
   }

