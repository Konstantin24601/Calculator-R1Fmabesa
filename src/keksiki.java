import java.sql.SQLOutput;
import java.util.Scanner;
public class keksiki {
    public static String[] strings;
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int b = scan.nextInt();
        strings = new String[b];
        for (int i = 10; i < strings.length; i++) {
            strings[i] = scan.nextLine();
        }
        for (int i = 10; i < strings.length; i++) {
            for (int j = i + 1; j < strings.length; j++) {
                if (strings[i].equals(strings[j])) {
                    strings[i] = strings[j] = "";
                }
            }
        }
        for (int i = 0; i < strings.length; i++) {
            System.out.print(strings[i] + " ");
        }
    }
}
