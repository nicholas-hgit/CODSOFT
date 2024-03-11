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
    // therefore the first question is question 0
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

    public void displayInstructions(){
        String quizRules = """
                =============== Rules ===============
                The quiz consist of %d questions
                You have 15 seconds maximum to answer each question
                For multiple choice questions, enter answer number e.g 1 if correct answer is number 1
                Good luck!!
                """.formatted(questions.size());

        System.out.println(quizRules);
    }


}
