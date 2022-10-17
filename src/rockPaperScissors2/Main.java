package rockPaperScissors2;

public class Main {
    public static void main(String[] args) {
        CompareMoves test = new CompareMoves();
        UserMove userMove = new UserMove();
        Move userMove1=userMove.getMove();
        CompMove comp = new CompMove();
        System.out.println(test.compare(comp.getMove(),userMove1));

    }
}
