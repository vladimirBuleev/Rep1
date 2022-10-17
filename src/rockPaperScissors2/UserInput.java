package rockPaperScissors2;

import java.util.Scanner;

public class UserInput {
    String getUserAnswer() {
        Scanner scan = new Scanner(System.in);
        return scan.nextLine();
    }
}
