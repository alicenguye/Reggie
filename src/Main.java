import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String answer = "";
        boolean done = false;
        String SSN = SafeInput.getRegExString(in, "Enter your social security number", "\\d{3}-\\d{2}-\\d{4}");
        // have to include the dash between number
        String MN = SafeInput.getRegExString(in, "Enter your UC M number", "(M|m)\\d{5}");
        // have to include the letter M in front of the number
        do {
            System.out.println("Select a menu option:\n   Open(O)  Save(S)  View(V)  Quit(Q)");
            if (in.hasNext()) {
                answer = in.nextLine().toUpperCase();
                if (answer.equals("O") || answer.equals("S") || answer.equals("V") || answer.equals("Q")) ;
                {
                    done = true;
                }
            }
        } while (!done);
    }
}
