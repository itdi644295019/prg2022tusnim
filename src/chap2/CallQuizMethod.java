package chap2;

public class CallQuizMethod {
    
    public static void main(String[] args) {
      QuizMethod qm = new QuizMethod();
        qm.work();
        
        char ans = qm.work("Tusnim");
        System.out.println("ans = "+ans);
        qm.work('a', 10, 120,10.0f, 20.0);  
    }
    
}//end class
