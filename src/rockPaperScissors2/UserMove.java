package rockPaperScissors2;

public class UserMove {
    UserInput user = new UserInput();
    String userAnswer = user.getUserAnswer();

    public Move getMove() {
        if (userAnswer.equalsIgnoreCase("rock")) {
            return Move.ROCK;
        } else if (userAnswer.equalsIgnoreCase("paper")) {
            return Move.PAPER;
        } else if (userAnswer.equalsIgnoreCase("scissors")) {
            return Move.SCISSORS;
        } else {
            return null;
        }
    }
}
