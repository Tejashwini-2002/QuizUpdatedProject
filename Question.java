import java.util.Arrays;

public class Question {

    private int id;
    private String question;
    private String opt[]=new String[4];
    private String answer;
   
    public Question(int id, String question, String[] opt, String answer) {
      this.id = id;
      this.question = question;
      this.opt = opt;
      this.answer = answer;
    }
    public int getId() {
      return id;
    }
    // public void setId(int id) {
    //   this.id = id;
    // }
    public String getQuestion() {
      return question;
    }
    public String[] getOpt() {
      return opt;
    }
    // public void setOpt(String[] opt) {
    //   this.opt = opt;
    // }
    // public void setQuestion(String question) {
    //   this.question = question;
    //  }
    // public String getOpt1() {
    //   return opt1;
    // }
    // public void setOpt1(String opt1) {
    //   this.opt1 = opt1;
    // }
    // public String getOpt2() {
    //   return opt2;
    // }
    // public void setOpt2(String opt2) {
    //   this.opt2 = opt2;
    // }
    // public String getOpt3() {
    //   return opt3;
    // }
    // public void setOpt3(String opt3) {
    //   this.opt3 = opt3;
    // }
    // public String getOpt4() {
    //   return opt4;
    // }
    // public void setOpt4(String opt4) {
    //   this.opt4 = opt4;
    // }
    public String getAnswer() {
      return answer;
    }
    // public void setAnswer(String answer) {
    //   this.answer = answer;
    // }
    @Override
    public String toString() {
      return "Question [id=" + id + ", question=" + question + ", opt=" + Arrays.toString(opt) + ", answer=" + answer
          + "]";
    }
   
  
}
