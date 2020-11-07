import java.util.Scanner;

public class Todolist {
    public static void main(String[] args) {
        System.out.println("\n" +
                " _____ ___________ _____   _     _     _   \n" +
                "|_   _|  _  |  _  \\  _  | | |   (_)   | |  \n" +
                "  | | | | | | | | | | | | | |    _ ___| |_ \n" +
                "  | | | | | | | | | | | | | |   | / __| __|\n" +
                "  | | \\ \\_/ / |/ /\\ \\_/ / | |___| \\__ \\ |_ \n" +
                "  \\_/  \\___/|___/  \\___/  \\_____/_|___/\\__|\n" +
                "                                           \n" +
                "                                           \n");
        Scanner sc = new Scanner(System.in);
        System.out.println("-----------------------------------------------------");
        System.out.println("You can add up to 10 tasks!");
        System.out.println("You have 0/10!");
        System.out.println("-----------------------------------------------------");
        System.out.println("1) Manage tasks");
        System.out.println("2) Exit");

        int pocitanitask =0;


        String prvnizvoleni = sc.nextLine();

        if (prvnizvoleni.contains("1")) {
            System.out.println("-----------------------------------------------------\n" +
                    "Tasks management\n" +
                    "-----------------------------------------------------");
            System.out.println("1) Create a new task\n" +
                    "2) Update a task\n" +
                    "3) Destroy a task\n" +
                    "4) Back to main menu");
            int[] polemanagement = {1, 2, 3, 4};
            String druhezvoleni = sc.nextLine();

            boolean pridavanitasku = false;

            if (druhezvoleni.contains("1")) {
                System.out.println("Enter name of the new task:");
                String[] newtask = new String[9];

                pocitanitask++;
                for (int i =0 ; i< newtask.length; i++){
                newtask[i] = sc.nextLine();

                System.out.println("-----------------------------------------------------\n" +
                        "You can add up to 10 tasks!\n" +
                        "You have "+pocitanitask +"/10!\n" +
                        "#"+pocitanitask+" –" + newtask[i] +
                        "-----------------------------------------------------");
                pridavanitasku= true;
            }
            }

        }
        if (prvnizvoleni.contains("2")) {
            System.exit(0);
        }


    }
}
