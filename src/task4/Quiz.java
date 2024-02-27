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

    // question number is by order of insertion
    public void removeQuestionByNumber(int questionNumber){
        questions.remove(questionNumber);
    }

    public void removeQuestion(Question question) {
        questions.remove(question);
    }

    public void addQuestion(Question question){
        questions.add(question);
    }

    public double getTotalAvailableMarks() {
        return questions.stream()
                        .mapToInt(Question::getTotalAvailableMark)
                        .sum();
    }


}
