package task4;

import java.util.List;

public class Quiz {

    private final List<Question> questions;

    public static Quiz fromQuestions(List<Question> questions) {
        return  new Quiz(questions);
    }

    private Quiz(List<Question> questions){
        this.questions = questions;
    }

    public List<Question> getQuestions() {
        return questions;
    }

    public double getTotalAvailableMarks() {
        return questions.stream()
                        .mapToInt(Question::getTotalAvailableMark)
                        .sum();
    }


}
