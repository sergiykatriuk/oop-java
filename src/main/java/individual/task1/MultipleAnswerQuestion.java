package individual.task1;

import java.util.ArrayList;
import java.util.List;

public class MultipleAnswerQuestion extends Question {

    protected List<Integer> correctAnswers = new ArrayList<>();

    public MultipleAnswerQuestion(String text) {
        super(text);
    }

    public Question addAnswer(Answer answer, boolean isCorrect) {
        int currentAnswerNum = answerMap.size() + 1;
        if (isCorrect) {
            correctAnswers.add(currentAnswerNum);
        }
        answerMap.put(currentAnswerNum, answer);
        return this;
    }


    @Override
    public boolean checkCorrect(int... answerNums) {
        List<Integer> answers = new ArrayList<>();
        for (int answer : answerNums) {
            answers.add(answer);
        }
        boolean isCorrect = correctAnswers.size() == answerNums.length
                && correctAnswers.containsAll(answers);
        boolean isPartiallyCorrect = correctAnswers.stream().anyMatch(answers::contains);
        StringBuilder stringBuilder = new StringBuilder("Answers # ");
        for (int i = 0; i < answers.size(); i++) {
            stringBuilder.append(answers.get(i));
            if (i < answers.size() - 1) {
                stringBuilder.append(',');
            }
        }
        stringBuilder
                .append(answers.size() == 1 ? " is " : " are ")
                .append(isCorrect ? "Correct" : (isPartiallyCorrect ? "Partially correct" : "Incorrect"));
        System.out.println(stringBuilder.toString());
        return isCorrect;
    }
}
