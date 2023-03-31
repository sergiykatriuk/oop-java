package individual.task1;

public class SingleAnswerQuestion extends Question {

    protected Integer correctAnswerNum = null;

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
    public boolean checkCorrect(int... answerNums) {
        boolean isCorrect = correctAnswerNum != null && answerNums[0] == correctAnswerNum;
        System.out.println("Answer # " + answerNums[0] + " is " + (isCorrect ? "Correct" : "Incorrect"));
        return isCorrect;
    }
}
