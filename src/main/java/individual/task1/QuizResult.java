package individual.task1;

public class QuizResult {

    private final long total;
    private final long correct;

    public QuizResult(long total, long correct) {
        this.total = total;
        this.correct = correct;
    }

    @Override
    public String toString() {
        return "QuizResult: " + correct + " correct from " + total + " total";
    }

    public long getTotal() {
        return total;
    }

    public long getCorrect() {
        return correct;
    }
}
