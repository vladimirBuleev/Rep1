package rockPaperScissors2;

public class CompMove {
    RandomValue random = new RandomValue();

    public Move getMove() {
        Move[] moves = Move.values();
        return moves[random.getRandomValue()];
    }

}
