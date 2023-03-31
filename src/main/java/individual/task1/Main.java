package individual.task1;

public class Main {
    public static void main(String[] args) {

        Question question1 = new SingleAnswerQuestion("Який колір забороняючого сигнала світлофора ?")
                .addAnswer(new Answer("Синій"), false)
                .addAnswer(new Answer("Зелений"), false)
                .addAnswer(new Answer("Червоний"), true)
                .addAnswer(new Answer("Жовний"), false);

        System.out.println(question1);
        question1.checkCorrect(2);
        question1.checkCorrect(3);

//        Question: Який колір забороняючого сигнала світлофора ?
//                possible answers:
//        1 - Синій
//        2 - Зелений
//        3 - Червоний
//        4 - Жовний
//
//        Answer # 2 is Incorrect
//        Answer # 3 is Correct


        Question question2 = new SingleAnswerQuestion("Яка максимальна швидкість руху на автомагістралі ?")
                .addAnswer(new Answer("110"), false)
                .addAnswer(new Answer("90"), false)
                .addAnswer(new Answer("70"), false)
                .addAnswer(new Answer("130"), true);

        System.out.println(question2);
        question2.checkCorrect(4);
        question2.checkCorrect(3);

//        Question: Яка максимальна швидкість руху на автомагістралі ?
//        possible answers:
//        1 - 110
//        2 - 90
//        3 - 70
//        4 - 130
//
//        Answer # 4 is Correct
//        Answer # 3 is Incorrect

        Question question3 = new MultipleAnswerQuestion("Скільки може бути сигналів світлофора ?")
                .addAnswer(new Answer("Один"), false)
                .addAnswer(new Answer("Два"), true)
                .addAnswer(new Answer("Три"), true)
                .addAnswer(new Answer("Чотири"), false);

        System.out.println(question3);
        question3.checkCorrect(1);
        question3.checkCorrect(2);
        question3.checkCorrect(2, 3);

//        Question: Скільки може бути сигналів світлофора ?
//                possible answers:
//        1 - Один
//        2 - Два
//        3 - Три
//        4 - Чотири
//
//        Answers # 1 is Incorrect
//        Answers # 2 is Partially correct
//        Answers # 2,3 are Correct

        Question question4 = new MultipleAnswerQuestion("Які кольори можуть бути у сигналів світлофора ?")
                .addAnswer(new Answer("Червоний"), true)
                .addAnswer(new Answer("Жовтий"), true)
                .addAnswer(new Answer("Зелений"), true)
                .addAnswer(new Answer("Чорний"), false);

        System.out.println(question4);
        question4.checkCorrect(1, 3);
        question4.checkCorrect(4);
        question4.checkCorrect(1, 2, 3);

//        Question: Які кольори можуть бути у сигналів світлофора ?
//                possible answers:
//        1 - Червоний
//        2 - Жовтий
//        3 - Зелений
//        4 - Чорний
//
//        Answers # 1,3 are Partially correct
//        Answers # 4 is Incorrect
//        Answers # 1,2,3 are Correct
    }
}
