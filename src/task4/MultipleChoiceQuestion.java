package task4;

import java.util.List;

public  class MultipleChoiceQuestion extends Question {
    private final List<String> possibleAnswers;

    public MultipleChoiceQuestion(String question, List<String> possibleAnswers, String answer, int mark) {
         super(question, answer, mark);
         this.possibleAnswers = possibleAnswers;
    }

    public List<String> getPossibleAnswers() {
        return possibleAnswers;
    }

}
