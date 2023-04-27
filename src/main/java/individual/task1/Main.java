package individual.task1;

public class Main {
    public static void main(String[] args) {

        QuizService quizService = new QuizService();
        Quiz quiz = quizService.read("RoadTest");

        quiz.getQuestion(1).provideAnswers(2);
        quiz.getQuestion(2).provideAnswers(4);
        quiz.getQuestion(3).provideAnswers(2);
        quiz.getQuestion(4).provideAnswers(1, 2, 3);

        quiz.printResult();
        System.out.println();
        System.out.println(quiz.getQuizResult());

//        Тест на знання правил дорожнього руху
//
//        Question: 1 Question: Який колір забороняючого сигнала світлофора ?
//                possible answers:
//        1 - Синій
//        2 - Зелений
//        3 - Червоний
//        4 - Жовний
//
//        Your answer # 2 is Incorrect
//
//        Question: 2 Question: Яка максимальна швидкість руху на автомагістралі ?
//        possible answers:
//        1 - 110
//        2 - 90
//        3 - 70
//        4 - 130
//
//        Your answer # 4 is Correct
//
//        Question: 3 Question: Скільки може бути сигналів світлофора ?
//                possible answers:
//        1 - Один
//        2 - Два
//        3 - Три
//        4 - Чотири
//
//        Your answer # 2 is Partially correct
//
//        Question: 4 Question: Які кольори можуть бути у сигналів світлофора ?
//                possible answers:
//        1 - Червоний
//        2 - Жовтий
//        3 - Зелений
//        4 - Чорний
//
//        Your answer # 1,2,3 are Correct
//
//        QuizResult: 2 correct from 4 total
    }
}
