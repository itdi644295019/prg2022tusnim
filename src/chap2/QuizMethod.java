package chap2;

public class QuizMethod {

    void work() {
        System.out.println("1.work");
    }

    int work(int x, int y) {
        System.out.println("2.work");
        return 5;
    }

    boolean work(int x,char y) {
        System.out.println("3.work");
        return false;
    }

    void work(float x, double y, char z) {
        System.out.println("4.work");
    }

    char work(String x) {
        System.out.println("5.work");
        return 'Z';
    }

    void work(double x, boolean y, int z) {
        System.out.println("6.work");
    }

    String work(String a, String y) {
        System.out.println("7.work");
        return "Nalinee";
    }

    float work(long x) {
        System.out.println("8.work");
        return 4.5f;
    }

    long work(long x, long y, int z) {
        System.out.println("9.work");
        return 56L;
    }

    void work(char a, int b, long c, float x, double d) {
        System.out.println("10.work");
    }

    public static void main(String[] args) {
        QuizMethod qm = new QuizMethod();
        qm.work();
        char ans = qm.work("Tusnim");
        System.out.println("ans = "+ans);
        qm.work('a', 10, 120,10.0f, 20.0);
        
    }
}
