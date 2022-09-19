import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();

        while (true) {
            System.out.println("Choose option:\n 1 - add good; 2 - show list; 3 - delete good; 4 - find good; 5 - for exit.");
            String input = scanner.nextLine();


            if ("5".equals(input)) {
                break;
            }

            if ("1".equals(input)) {
                System.out.println("Enter your good.");
                input = scanner.nextLine();
                list.add(input);
                System.out.println("Number of your goods are: " + list.size());
            }

            if ("2".equals(input)) {
                if (list.size() == 0) {
                    System.out.println("List of goods is empty!\n");
                    continue;
                }
                System.out.println("List of goods:");
                for (int i = 0; i < list.size(); i++) System.out.println((i + 1) + ". " + list.get(i) + ";");
                System.out.println();
            }

            if ("3".equals(input)) {
                if (list.size() == 0) {
                    System.out.println("List of goods is empty!\n");
                    continue;
                }
                System.out.println("List of goods:");
                for (int i = 0; i < list.size(); i++) System.out.println((i + 1) + ". " + list.get(i) + ";");
                System.out.println("Choose number or name for deleting.");
                input = scanner.nextLine();

                try {
                    int choice = Integer.parseInt(input);
                    list.remove(choice - 1);
                } catch (NumberFormatException e) {
                } catch (IndexOutOfBoundsException e2) {
                }

                list.remove(input);

                if (list.size() == 0) {
                    System.out.println("List of goods is empty!");
                    continue;
                }
                for (int i = 0; i < list.size(); i++) System.out.println((i + 1) + ". " + list.get(i) + ";");
            }

            if ("4".equals(input)) {
                if (list.size() == 0) {
                    System.out.println("List of goods is empty!\n");
                    continue;
                }
                System.out.println("Enter name for search.");
                input = scanner.nextLine();
                String inputLC = input.toLowerCase();
                for (int i = 0; i < list.size(); i++) {
                    String listLC = list.get(i).toLowerCase();
                    if (listLC.contains(inputLC)) System.out.println((i + 1) + ". " + list.get(i));
                    }
                System.out.println();
            }
        }

    }


}
