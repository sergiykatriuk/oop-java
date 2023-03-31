package individual.task1;

import java.util.Map;
import java.util.TreeMap;

public abstract class Question {


    private final String text;
    protected final Map<Integer, Answer> answerMap = new TreeMap<>();

    public Question(String text) {
        this.text = text;
    }

    public abstract Question addAnswer(Answer answer, boolean isCorrect);

    public abstract boolean checkCorrect(int... answerNums);


    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("Question: " + text + "\n\t possible answers:\n");
        answerMap.forEach((key, value) -> stringBuilder
                .append("\t\t\t")
                .append(key)
                .append(" - ")
                .append(value)
                .append('\n')
        );
        return stringBuilder.toString();
    }
}
