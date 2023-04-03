package individual.task1;

public class Main {
    public static void main(String[] args) {

        Question question1 = new SingleAnswerQuestion("Який колір забороняючого сигнала світлофора ?")
                .addAnswer(new Answer("Синій"), false)
                .addAnswer(new Answer("Зелений"), false)
                .addAnswer(new Answer("Червоний"), true)
                .addAnswer(new Answer("Жовний"), false);

        question1.provideAnswers(2);


        Question question2 = new SingleAnswerQuestion("Яка максимальна швидкість руху на автомагістралі ?")
                .addAnswer(new Answer("110"), false)
                .addAnswer(new Answer("90"), false)
                .addAnswer(new Answer("70"), false)
                .addAnswer(new Answer("130"), true);

        question2.provideAnswers(4);

        Question question3 = new MultipleAnswerQuestion("Скільки може бути сигналів світлофора ?")
                .addAnswer(new Answer("Один"), false)
                .addAnswer(new Answer("Два"), true)
                .addAnswer(new Answer("Три"), true)
                .addAnswer(new Answer("Чотири"), false);

        question3.provideAnswers(2);

        Question question4 = new MultipleAnswerQuestion("Які кольори можуть бути у сигналів світлофора ?")
                .addAnswer(new Answer("Червоний"), true)
                .addAnswer(new Answer("Жовтий"), true)
                .addAnswer(new Answer("Зелений"), true)
                .addAnswer(new Answer("Чорний"), false);

        question4.provideAnswers(1, 2, 3);

        Quiz quiz = new Quiz("Тест на знання правил дорожнього руху")
                .add(question1)
                .add(question2)
                .add(question3)
                .add(question4);

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
