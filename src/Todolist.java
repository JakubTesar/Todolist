import java.util.Scanner;

public class Todolist {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pocitanitask = 0;
        int problem = 0;
        int a = 0;
        String task = "";
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
        String[] newtask = new String[10];

        while (prvnizvoleni.contains("1")) {
            if (prvnizvoleni.contains("1")) {
                System.out.println("-----------------------------------------------------\n" +
                        "Tasks management\n" +
                        "-----------------------------------------------------");
                System.out.println("1) Create a new task\n" +
                        "2) Update a task\n" +
                        "3) Delete a task\n" +
                        "4) Exit\n" +
                        "5) Load all tasks");
                String druhezvoleni = sc.nextLine();


                if (druhezvoleni.contains("1")) {                   //Task management (1
                    problem++;
                    System.out.println("Enter name of the new task:");
                    pocitanitask++;
                    newtask[a] = sc.nextLine();
                    System.out.println("-----------------------------------------------------\n" +
                            "You can add up to 10 tasks!\n" +
                            "You have " + pocitanitask + "/10!\n" +
                            "#" + a + " – " + newtask[a]);
                    a++;
                }
                if (druhezvoleni.contains("2")) {                                                  //Task management (2
                    System.out.println("Select number of task:");
                    String cislotasku = sc.nextLine();
                    int cislotasku2 = Integer.parseInt(cislotasku);
                    System.out.println("Update:");
                    newtask[cislotasku2] = sc.nextLine();
                }


                if (druhezvoleni.contains("3")) {                                           //Task management (3
                    System.out.println("What task number you want to delete?");
                    String targer = sc.nextLine();
                    int target2 = Integer.parseInt(targer);
                    newtask[target2] = null;
                }

                if (druhezvoleni.contains("4")) {                                               //Task management (4
                    System.exit(0);
                }
                if (druhezvoleni.contains("5")) {
                    for (int i = 0; i < newtask.length;) {
                        if (newtask[i] != null) {
                            System.out.println(i+". "+newtask[i]);
                        }
                        i++;
                    }
                }
            }
            if (prvnizvoleni.contains("2")) {
                System.exit(0);
            }
            //if (!prvnizvoleni.contains("1") && !prvnizvoleni.contains("2")) {
            //    System.out.println("Try it again");
            // }

        }
    }
}
