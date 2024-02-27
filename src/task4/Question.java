package task4;

public class Question {
    private final String question;
    private final String answer;
    private final int totalAvailableMark;

    public Question(String question, String answer, int totalAvailableMark){
        this.question = question;
        this.answer = answer;
        this.totalAvailableMark = totalAvailableMark;
    }

    public String getQuestion() {
        return question;
    }

    public String getAnswer() {
        return answer;
    }

    public int getTotalAvailableMark() {
        return totalAvailableMark;
    }
}
