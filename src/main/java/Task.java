import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Task {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Первое предложение:");
        String firstArg = console.nextLine();
        firstArg = (firstArg.replaceAll("\\s", "")).toLowerCase();
        System.out.println("Второе предложение:");
        String secondArg = console.nextLine();
        secondArg = (secondArg.replaceAll("\\s", "")).toLowerCase();

        if (stringLengthEqualCheck(firstArg, secondArg)) {
            char[] firstArray = firstArg.toCharArray();
            char[] secondArray = secondArg.toCharArray();

            List<Character> characters = new ArrayList<>();
            addToList(firstArray, characters);
            addToList(secondArray, characters);
            characters.stream().forEach(character -> Collections.frequency(characters, character));
            int check = 0;
            for (int i = 0; i < characters.size(); i++) {
                check = Collections.frequency(characters, characters.get(i));

            }
            if (check == 2) {
                System.out.println("true");
            } else {
                System.out.println("false");
            }
        }
    }

    private static void addToList(char[] firstArray, List<Character> characters) {
        for (Character character : firstArray) {
            characters.add(character);
        }
    }

    private static boolean stringLengthEqualCheck(String first, String second) {
        if (first.length() != second.length()) {
            System.out.println("Strings length not equal");
            return false;
        }
        return true;
    }

}


