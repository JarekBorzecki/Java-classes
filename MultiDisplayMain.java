package Practice_4;
import java.util.Scanner;

/**
 * Created by jarek on 02.07.2017.
 */
public class MultiDisplayMain {
    public static void main(String[] args) {

        MultiDisplay multi = new MultiDisplay();
        Scanner scan = new Scanner(System.in);

        System.out.print("Podaj tekst do wyświetlenia: ");
        String text = scan.nextLine();

        System.out.print("Podaj ile razy ma się wyświetlić: ");
        int howMany = scan.nextInt();

        multi.setDisplayMessage(text);
        multi.setDisplayCount(howMany);
        multi.display();
        multi.displayDifferent("Java is amazing!", 4);

        System.out.println("Current Message: " + multi.getDisplayMessage());
        System.out.println("Current Value: " + multi.getDisplayValue());

    }
}
