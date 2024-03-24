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
            i++;
            input[i] = scanner.nextLine();
            if (input[i].startsWith("add-library"))
            {
                    String[] parts = input[i].split("#")[1].split("\\|");

                    if (library_count == 0)
                    {
                        library[library_count] = new Library(parts[0], parts[1], Integer.parseInt(parts[2]), Integer.parseInt(parts[3]), parts[4]);
                        System.out.println("success");
                    }
                    if (library_count != 0) {
                        boolean Duplicate_id = false;
                        for (int k = 0 ; k < library_count ; k++){
                            if (library[k].getID().equals(parts[0])){
                                Duplicate_id = true;
                                break;
                            }
                        }
                        if (Duplicate_id)
                        {
                            System.out.println("duplicate-id");
                        } else {
                            library[library_count] = new Library(parts[0], parts[1], Integer.parseInt(parts[2]), Integer.parseInt(parts[3]), parts[4]);
                            System.out.println("success");
                            library_count++;
                        }
                    }
                    else {
                        library_count++;
                    }


                }
            }
        
        }
    }
