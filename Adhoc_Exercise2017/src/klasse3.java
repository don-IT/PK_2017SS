/**
 * Created by cehajicomar on 14.05.17.
 */
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class klasse3 {
    public static void main(String[] args) {

        final Scanner scanner = new Scanner(System.in);
        final Map<String, String> map = new TreeMap<String, String>();

        final String msgName = "Name:";
        final String msgNum = "Neue Telefonnummer (keine Änderung bei leerer Eingabe):";
        final String msgNoName = "Kein Telefonbucheintrag für ";

        String name = null;

        System.out.println(msgName);
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            if (name == null) {
                name = line;
                String num = map.get(name);
                System.out.println(num == null ? msgNoName + name : num);
                System.out.println(msgNum);
            } else {
                if (! "".equals(line)) {
                    map.put(name, line);
                }
                name = null;
                System.out.println(msgName);
            }
        }
        System.out.println("Auf Wiedersehen");
    }
}

