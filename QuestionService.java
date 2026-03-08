import java.util.Scanner;

public class QuestionService{
    String answer[]=new String[5];
    Question[] questions = new Question[5];

    public QuestionService(){
      questions[0]=new Question (1, "size of int", new String[]{"2","6","4","8"}, "4" );
      questions[1]=new Question (2, "size of double", new String[]{"2","6","4","8"}, "8" );
      questions[2]=new Question (3, "size of char", new String[]{"2","6","4","8"}, "2" );
      questions[3]=new Question (4, "size of long", new String[]{"2","6","4","8"}, "8" );
      questions[4]=new Question (5, "size of boolean", new String[]{"2","6","4","8"}, "1" );
    }

    public void playQuiz(){
      int i=0;
      for(Question q:questions){
        System.out.println("Question No: "+q.getId());
        System.out.println(q.getQuestion());
        
        for(String opt:q.getOpt()){
          System.out.println(opt);
        }
        Scanner sc=new Scanner(System.in);
        answer[i]=sc.nextLine();
        i++;
      }

      System.out.println("Your Answewrs:");
      for(String a:answer){

        System.out.print(a+" ");
      }

      
    }
    
}