package individual.task1;

import java.io.Serializable;

public class Answer implements Serializable {
    private static final long serialVersionUID = 1L;
    private final String text;

    public Answer(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return text;
    }
}
