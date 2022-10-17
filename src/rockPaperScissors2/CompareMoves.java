package rockPaperScissors2;

public class CompareMoves {

    public String compare(Move compMoved, Move userMoved) {
        System.out.println(compMoved);
        if (compMoved == userMoved) {
            return "DRAW";
        } else {

            if (userMoved == Move.ROCK) {
                if (compMoved == Move.PAPER) {
                    return "LOSE";
                } else if (compMoved == Move.SCISSORS) {
                    return "WIN";
                }


            } else if (userMoved == Move.PAPER) {
                if (compMoved == Move.ROCK) {
                    return "WIN";
                } else if (compMoved == Move.SCISSORS) {
                    return "LOSE";
                }
            } else if (userMoved == Move.SCISSORS) {
                if (compMoved == Move.ROCK) {
                    return "LOSE";
                } else if (compMoved == Move.PAPER) {
                    return "WIN";
                }
            }
            return "null";
        }
    }
}
