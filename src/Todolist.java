import java.util.Scanner;

public class Todolist {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("\n" +
                " _____ ___________ _____   _     _     _   \n" +
                "|_   _|  _  |  _  \\  _  | | |   (_)   | |  \n" +
                "  | | | | | | | | | | | | | |    _ ___| |_ \n" +
                "  | | | | | | | | | | | | | |   | / __| __|\n" +
                "  | | \\ \\_/ / |/ /\\ \\_/ / | |___| \\__ \\ |_ \n" +
                "  \\_/  \\___/|___/  \\___/  \\_____/_|___/\\__|\n" +
                "                                           \n" +
                "                                           \n");
        System.out.println("-----------------------------------------------------");
        System.out.println("You can add up to 10 tasks!");
        System.out.println("You have 0/10!");
        System.out.println("-----------------------------------------------------");
        System.out.println("1) Manage tasks");
        System.out.println("2) Exit");
        String prvnizvoleni = sc.nextLine();

        for (int j = 0; prvnizvoleni.contains("1"); ) {
            int pocitanitask = 0;
            int a = 0;
            if (prvnizvoleni.contains("1")) {
                System.out.println("-----------------------------------------------------\n" +
                        "Tasks management\n" +
                        "-----------------------------------------------------");
                System.out.println("1) Create a new task\n" +
                        "2) Update a task\n" +
                        "3) Delete a task\n" +
                        "4) Exit\n" +
                        "5) Load all tasks");
                int[] polemanagement = {1, 2, 3, 4};
                String druhezvoleni = sc.nextLine();
                String[] newtask = new String[10];


                if (druhezvoleni.contains("1")) {                                          //Task management (1
                    System.out.println("Enter name of the new task:");

                    for (int i = 0; i < newtask.length; i++) {
                        pocitanitask++;
                        newtask[i] = sc.nextLine();
                        System.out.println("-----------------------------------------------------\n" +
                                "You can add up to 10 tasks!\n" +
                                "You have " + pocitanitask + "/10!\n" +
                                "#" + a + " – " + newtask[i]);
                        System.out.println("If you don't have more tasks write END");
                        a++;
                        if (newtask[i].contains("END")) {
                            break;
                        }
                    }
                }
                if (druhezvoleni.contains("2")) {                                                  //Task management (2
                    System.out.println("Select number of task:");
                    String cislotasku = sc.nextLine();
                    int cislotasku2 = Integer.parseInt(cislotasku);
                    System.out.println("Update:");
                    newtask[cislotasku2] = sc.nextLine();
                }

                int velikost = 5;
                if (druhezvoleni.contains("3")) {                                           //Task management (3
                    System.out.println("What task number you want to delete?");
                    String targer = sc.nextLine();
                    int target2 = Integer.parseInt(targer);
                    for (int i = target2; i < velikost; i++) {
                        newtask[i] = newtask[i + 1];
                    }
                    newtask[velikost - 1] = String.valueOf(0);
                    velikost--;
                }
                if (druhezvoleni.contains("4")) {                                               //Task management (4
                    System.exit(0);
                }
                if (druhezvoleni.contains("5")) {                                               //Task management (5
                    System.out.println("null == no homework");
                    System.out.println("-----------------------------------------------------");
                    for (int i = 0; i < newtask.length - 1; i++) {
                        System.out.println(newtask[i]);
                    }
                }
            }
            if (prvnizvoleni.contains("2")) {
                System.exit(0);
            }

        }
    }
}
