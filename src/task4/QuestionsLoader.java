package task4;

import java.util.List;

//this class is used as a local database for questions
//it supplies the questions to the quiz
public class QuestionsLoader {

    private static final List<Question> questions = List.of(
            new MultipleChoiceQuestion(
                    "What is the main purpose of the \"if\" statement in programming?",
                    List.of(
                            "Loop control",
                            "Error handling",
                            "Conditional Execution",
                            "Functional declaration"
                    ),
                    "3",
                    2
            ),
            new MultipleChoiceQuestion(
                    "Which data structure follows the Last in, First out(LIFO) principle?",
                    List.of(
                            "Queue",
                            "Stack",
                            "LinkedList",
                            "Array"
                    ),
                    "2",
                    2
            ),
            new MultipleChoiceQuestion(
                    "In object-oriented programming, what is encapsulation?",
                    List.of(
                            "Combining multiple classes",
                            "Hiding implementation details",
                            "Using inheritance",
                            "Managing memory allocation"
                    ),
                    "2",
                    2
            ),
            new MultipleChoiceQuestion(
                    "What is a git repository?",
                    List.of(
                            "A storage location for database records",
                            "A centralised server for code deployment",
                            "A version control system for tracking changes in code",
                            "A directory for storing project documentation"
                    ),
                    "3",
                    2
            ),
            new MultipleChoiceQuestion(
                    "WHat does the term \"API\" stand for in software development?",
                    List.of(
                            "Application programming interface",
                            "Advanced programming instruction",
                            "Automated program integration",
                            "Algorithmic protocol implementation"
                    ),
                    "1",
                    2
            )

    );

    public static  List<Question> loadQuestions() {
        return questions;
    }

}
