package task4;

import java.util.List;

public class QuestionsLoader {

    private static final List<Question> questions = List.of(
            new MultipleChoiceQuestion(
                    "what is 2 + 2?",
                    List.of(
                            "2",
                            "4",
                            "6"
                    ),
                    "4",
                    2
            ),
            new MultipleChoiceQuestion(
                    "what is 2 * 2?",
                    List.of(
                            "2",
                            "4",
                            "6"
                    ),
                    "4",
                    2
            ),
            new MultipleChoiceQuestion(
                    "what is 6 * 6?",
                    List.of(
                            "12",
                            "36",
                            "42"
                    ),
                    "36",
                    2
            ),
            new MultipleChoiceQuestion(
                    "what is 8 * 8?",
                    List.of(
                            "48",
                            "81",
                            "64"
                    ),
                    "64",
                    2
            ),
            new MultipleChoiceQuestion(
                    "what is 5 * 5?",
                    List.of(
                            "25",
                            "15",
                            "30"
                    ),
                    "25",
                    2
            )

    );

    public static  List<Question> loadQuestions() {
        return questions;
    }

}
