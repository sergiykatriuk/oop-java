package individual.task1;

import java.util.ArrayList;
import java.util.List;

public class MultipleAnswerQuestion extends Question {

    protected List<Integer> correctAnswers = new ArrayList<>();
    private List<Integer> answersProvided = new ArrayList<>();
    private boolean isPartiallyCorrect;


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
    public void provideAnswers(int... answerNums) {
        List<Integer> answers = new ArrayList<>();
        for (int answer : answerNums) {
            answers.add(answer);
        }
        answersProvided = answers;
        isCorrect = correctAnswers.size() == answerNums.length && correctAnswers.containsAll(answers);
        isPartiallyCorrect = correctAnswers.stream().anyMatch(answers::contains);
    }

    @Override
    public void printResult() {
        StringBuilder stringBuilder = new StringBuilder("Your answer # ");
        for (int i = 0; i < answersProvided.size(); i++) {
            stringBuilder.append(answersProvided.get(i));
            if (i < answersProvided.size() - 1) {
                stringBuilder.append(',');
            }
        }
        stringBuilder
                .append(answersProvided.size() == 1 ? " is " : " are ")
                .append(isCorrect ? "Correct" : (isPartiallyCorrect ? "Partially correct" : "Incorrect"));
        System.out.println(stringBuilder.toString());
    }
}
