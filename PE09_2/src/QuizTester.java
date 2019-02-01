/**
   This program tests the Quiz and DataSet classes.
*/
public class QuizTester
{
   public static void main(String[] args)
   {
      DataSet quizData = new DataSet();
      Quiz q1 = new Quiz(89, "B+");
      Quiz q2 = new Quiz(90, "A-");
      Quiz q3 = new Quiz(73, "C");
      quizData.add((Measurable)q1);
      quizData.add((Measurable)q2);
      quizData.add((Measurable)q3);
      
      double avg =quizData.getAverage();
      Quiz max = (Quiz)quizData.getMaximum();

      System.out.println("Average score: " + avg);
      System.out.println("Expected: 84");
 
      System.out.println("Highest score: " + max.getGrade());
      System.out.println("Expected: 90");

      System.out.println("Highest grade: " + max.getScore());
      System.out.println("Expected: A-");
   }
}