import java.util.ArrayList;
import java.util.Scanner;

public class Main {


    static ArrayList<String> list = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {


        while (true) {
            System.out.println("Choose option:\n 1 - add good; 2 - show list; 3 - delete good; 4 - find good; 5 - for exit.");
            String input = scanner.nextLine();

            if ("5".equals(input)) {
                break;
            }

            switch (input) {
                case "1":
                    addGood();
                    break;
                case "2":
                    showList();
                    break;
                case "3":
                    deleteGood();
                    break;
                case "4":
                    findGood();
                    break;
                default:
                    System.out.println("Try again!");

            }




        }

    }

    static void addGood() {
        System.out.println("Enter your good.");
        String input = scanner.nextLine();
        list.add(input);
        System.out.println("Number of your goods are: " + list.size());
    }

    static void showList() {
        System.out.println("List of goods:");
        for (int i = 0; i < list.size(); i++) System.out.println((i + 1) + ". " + list.get(i) + ";");
        System.out.println();
    }

    static void deleteGood() {
        showList();
        System.out.println("Choose number or name for deleting.");
        String input = scanner.nextLine();

        try {
            int choice = Integer.parseInt(input);
            list.remove(choice - 1);
        } catch (NumberFormatException e) {
        } catch (IndexOutOfBoundsException e2) {
        }

        list.remove(input);

        for (int i = 0; i < list.size(); i++) System.out.println((i + 1) + ". " + list.get(i) + ";");
    }

    static void findGood() {
        System.out.println("Enter name for search.");
        String input = scanner.nextLine();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).toLowerCase().contains(input.toLowerCase()))
                System.out.println((i + 1) + ". " + list.get(i));
        }
        System.out.println();
    }


}
