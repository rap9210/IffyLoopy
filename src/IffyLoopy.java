import java.util.Scanner;

public class IffyLoopy {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        /*
        Loopy Goal: Create ONE string variable to store the output of
        5 words that a user will enter at random.
        1. initialize an empty string
        2. set a for loop to iterate 5 times, each time prompting the
        user for a new word.
        3. each iteration should concatenate the previous input with
        the next.
         */

        System.out.println("Input 5 random words to be displayed: ");
        String input_holder = "";
        String user_input;
        for (int i = 1; i <= 5; i++) {
            user_input = scn.nextLine();
            input_holder += user_input + " ";

        }
        System.out.println(input_holder);

        /*
        Iffy Goal: Create an application that will ask, "Are your eyes red?"
        Use boolean values to condition output. If the response is 'y', Or
        'yes' (regardless of case), then your application should print
         out: "Get some sleep!" Otherwise your application should print out
         "You look great!"
         1. Initialize boolean variable
         2. Assign true given certain response
         2. Use that variable to tell machine what to print
         3. Print appropriate response
         Iffy Loop Goal: Add a loop option for user to repeat program
         if desired.
         1. add do while loop to execute once then only if user wants
         to run again.
         */

        boolean red_eyes;
        String answer;
        do {
            System.out.println("Are your eyes red? ");
            user_input = scn.nextLine();

            if ((user_input.equalsIgnoreCase("y")) || (user_input.equalsIgnoreCase("yes"))) {
                red_eyes = true;
            } else {
                red_eyes = false;
            }
            if (red_eyes) {
                System.out.println("Get some sleep!");
            } else {
                System.out.println("You look great!");
            }
            System.out.println("Do you want to try again? y/n");
            answer = scn.nextLine();

        }while (!answer.equalsIgnoreCase("n"));
        /*
        Iffy Loop Goal: Add a loop option for user to repeat program
        if desired.
         */
    }
}
