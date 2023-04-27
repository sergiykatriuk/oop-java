package individual.task1;

import java.io.*;

public class QuizService {

    public void save(Quiz quiz, String fileName) {
        try {
            FileOutputStream fileOutputStream
                    = new FileOutputStream(fileName);
            ObjectOutputStream objectOutputStream
                    = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(quiz);
            objectOutputStream.flush();
            objectOutputStream.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public Quiz read(String fileName) {
        FileInputStream fileInputStream = null;
        try {
            fileInputStream = new FileInputStream(fileName);
            ObjectInputStream objectInputStream
                    = new ObjectInputStream(fileInputStream);
            Quiz quiz = (Quiz) objectInputStream.readObject();
            objectInputStream.close();
            return quiz;
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
