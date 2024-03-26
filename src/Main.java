import java.util.*;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input  = new String[100];
        input[0] = "Start";
        int i = 0;
        Library[] library = new Library[100];
        Categories[] categories = new Categories[100];
        Book[] book = new Book[100];
        int Categories_counter = 0;
        int library_counter = 0;
        int book_counter = 0;

        while (!input[i].equals("finish")) {
            i++;
            input[i] = scanner.nextLine();
            if (input[i].startsWith("add-library"))
            {
                    String[] parts = input[i].split("#")[1].split("\\|");

                    if (library_counter == 0)
                    {
                        library[library_counter] = new Library(parts[0], parts[1], Integer.parseInt(parts[2]), Integer.parseInt(parts[3]), parts[4]);
                        System.out.println("success");
                    }
                    if (library_counter != 0) {
                        boolean Duplicate_id = false;
                        for (int k = 0 ; k < library_counter ; k++){
                            if (library[k].getID().equals(parts[0])){
                                Duplicate_id = true;
                                break;
                            }
                        }
                        if (Duplicate_id)
                        {
                            System.out.println("duplicate-id");
                        } else {
                            library[library_counter] = new Library(parts[0], parts[1], Integer.parseInt(parts[2]), Integer.parseInt(parts[3]), parts[4]);
                            System.out.println("success");
                            library_counter++;
                        }
                    }
                    else {
                        library_counter++;
                    }
                }
            else if (input[i].startsWith("add-category")){
                String[] parts = input[i].split("#")[1].split("\\|");

                if (Categories_counter == 0)
                {
                    categories[Categories_counter] = new Categories(parts[0], parts[1]);
                    System.out.println("success");
                }
                if (Categories_counter != 0) {
                    boolean Duplicate_id = false;
                    for (int k = 0 ; k < Categories_counter ; k++){
                        if (categories[k].getID().equals(parts[0])){
                            Duplicate_id = true;
                            break;
                        }
                    }

                    if (Duplicate_id)
                    {
                        System.out.println("duplicate-id");
                    } else {
                        categories[Categories_counter] = new Categories(parts[0], parts[1]);
                        System.out.println("success");
                        Categories_counter++;
                    }
                }
                else {
                    Categories_counter++;
                }
            }
            else if (input[i].startsWith("add-book")) {
                String[] parts = input[i].split("#")[1].split("\\|");
                // found categories and library
                boolean found_C_L = false;
                for (int r = 0; r < library_counter; r++) {
                    if (library[r].getID().equals(parts[7])) {
                        found_C_L = true;
                        break;
                    }
                }
                for (int r = 0; r < Categories_counter ; r++) {
                    if (parts[6] == null || categories[r].getID().equals(parts[6])) {
                        found_C_L = true;
                        break;
                    }

                }
                if (found_C_L) {
                    if (book_counter == 0) {
                        book[book_counter] = new Book(parts[0], parts[1], parts[2], parts[3], Integer.parseInt(parts[4]), Integer.parseInt(parts[5]), parts[6], parts[7]);
                        System.out.println("success");
                    }
                    if (book_counter != 0) {
                        boolean Duplicate_id = false;
                        for (int k = 0; k < book_counter; k++) {
                            if (book[k].getID().equals(parts[0]) && book[k].getID().equals(parts[7])) {
                                Duplicate_id = true;
                                break;
                            }
                        }

                        if (Duplicate_id) {
                            System.out.println("duplicate-id");
                        } else {
                            book[book_counter] = new Book(parts[0], parts[1], parts[2], parts[3], Integer.parseInt(parts[4]), Integer.parseInt(parts[5]), parts[6], parts[7]);
                            System.out.println("success");
                            book_counter++;
                        }
                    } else {
                        book_counter++;
                    }
                }
                else {
                    System.out.println("not-found");
                }
            }


            }
        
        }
    }
