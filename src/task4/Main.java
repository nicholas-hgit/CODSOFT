package task4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.Duration;
import java.time.LocalTime;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {


        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        //maps user provided answer to actual answer
        List<Map.Entry<String,String>> summaryOfAnswers = new ArrayList<>();
        Quiz quiz = Quiz.fromQuestions(QuestionsLoader.loadQuestions());

        printRules(quiz.getQuestions().size());

        double studentTotalMarks = 0;
        double totalPossibleMarks = quiz.getTotalAvailableMarks();

        for(Question question : quiz.getQuestions()){

            System.out.println("Enter correct answer");
            System.out.println(question.getQuestion());

            if(question instanceof MultipleChoiceQuestion){
                List<String> possibleAnswers = ((MultipleChoiceQuestion) question).getPossibleAnswers();

                for(int index = 1; index <= possibleAnswers.size();++index){
                    System.out.printf("%d. %s %n",index,possibleAnswers.get(index - 1));
                }
            }

            String studentAnswer = "";
            LocalTime questionStartTime = LocalTime.now();

            try {
                //the student is only given 15 seconds to answer a question
                while ("".equals(studentAnswer) && Duration.between(questionStartTime,LocalTime.now()).getSeconds() < 15){
                    if(reader.ready()){
                        studentAnswer = reader.readLine();
                    }
                }
            }catch (IOException e){
                e.printStackTrace();
            }

            //student didn't provide an answer for the question
            if("".equals(studentAnswer)){
                System.out.println("you are out of time \n");
            }

            summaryOfAnswers.add(Map.entry(studentAnswer,question.getAnswer()));

            if(question.getAnswer().equals(studentAnswer)) {
                studentTotalMarks += question.getTotalAvailableMark();
            }
        }

        reader.close();
        printTotalObtainedMarks(studentTotalMarks,totalPossibleMarks);
        printSummaryOfAnswers(summaryOfAnswers);
    }

    public static void  printRules(int numOfQuestions){
        String quizRules = """
                =============== Rules ===============
                The quiz consist of %d questions
                You have 15 seconds maximum to answer each question
                Good luck!!
                """.formatted(numOfQuestions);

        System.out.println(quizRules);
    }

    public static void printTotalObtainedMarks(double totalMarks , double totalAvailableMarks){
        System.out.printf("Marks obtained: %s / %s %n",totalMarks,totalAvailableMarks);
    }

    public static void printSummaryOfAnswers(List<Map.Entry<String,String>> list) {
        System.out.println("===== summary of answers in order =====");
        list.forEach(entry -> System.out.printf("Your answer: %s Correct answer: %s %n", entry.getKey(), entry.getValue()));
    }

}
