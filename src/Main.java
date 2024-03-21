import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input  = new String[100];
        input[0] = "Start";
        int i = 0;
        Library[] library = new Library[100];
        int library_count = 0;
        while (!input[i].equals("finish")) {
            ++i;
            input[i] = scanner.nextLine();

            if (input[i].startsWith("add-library")) {

                String[] parts = input[i].split("#")[1].split("\\|");
                library[library_count]= new Library(parts[0] , parts[1] ,  Integer.parseInt(parts[2]) , Integer.parseInt(parts[3]) , parts[4]);
                library_count++;
            }
        }
    }
}