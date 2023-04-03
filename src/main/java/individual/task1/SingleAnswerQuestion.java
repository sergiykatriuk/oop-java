package individual.task1;

public class SingleAnswerQuestion extends Question {

    protected Integer correctAnswerNum = null;
    private int answerProvided;

    public SingleAnswerQuestion(String text) {
        super(text);
    }

    public Question addAnswer(Answer answer, boolean isCorrect) {
        int currentAnswerNum = answerMap.size() + 1;
        if (correctAnswerNum == null && isCorrect) {
            correctAnswerNum = currentAnswerNum;
        }
        answerMap.put(currentAnswerNum, answer);
        return this;
    }


    @Override
    public void provideAnswers(int... answerNums) {
        answerProvided = answerNums[0];
        this.isCorrect = correctAnswerNum != null && answerProvided == correctAnswerNum;
    }

    @Override
    public void printResult() {
        System.out.println("Your answer # " + answerProvided + " is " + (isCorrect ? "Correct" : "Incorrect"));
    }
}
