import java.io.File;
import java.util.Scanner;



public class WwordCount {
    public static void main(String[] args) throws Exception { // wyrzuca potencjalne wyjątki
        File file = new File("text2.txt"); //dodany obiekt myBook i podana jego sciezka
        Scanner user = new Scanner(file); // scanner ma skanowac plik- mybook
        int words = 0; //początkowa wartosc słów
        while (user.hasNext());
        {// loop ktory sprawdza czy jest kolejna linia w pliku
            String line=user.nextLine(); // sprawdzamy co jest w linii
            words+=line.split(" ").length; //dodaje do words liczbe znaków odzielonych spacją (słow) do siebie
        }

/* cały loop
sprawdza linijka po linicje ilosć słow i dodaje do siebie
 */

            System.out.println("myBook contains: " + words + "words."); //wysywietla sume slow w książce






    }
   }

