package individual.task1;

import java.io.Serializable;
import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;

public class Quiz implements Serializable {

    private final Map<Integer, Question> questions = new TreeMap<>();
    private final String text;

    public Quiz(String text) {
        this.text = text;
    }

    public Quiz add(Question question) {
        questions.put(questions.size() + 1, question);
        return this;
    }

    public QuizResult getQuizResult() {
        long correctCount = questions.values().stream().filter(Question::isCorrect).count();
        return new QuizResult(questions.size(), correctCount);
    }

    public void printResult() {
        System.out.println(text);
        questions.forEach((i, q) -> {
            System.out.println();
            System.out.println("Question: " + i + " " + q);
            q.printResult();
        });
    }

    public Question getQuestion(Integer questionNum) {
        return questions.get(questionNum);
    }
}
