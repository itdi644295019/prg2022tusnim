package chap3;

import java.util.Random;

public class MyRandom {

    private static int randomNumber(int numInput) {//เริ่มที่ 0-7
        Random rd = new Random();
        int num = rd.nextInt(numInput); 
        System.out.println("num = "+num);
        return num; 
    }
    
    private static void randomNumberBound(int min, int max){//เป็นช่วง
        Random rd = new Random();
        int num = rd.nextInt(max-min)+min;
        System.out.println("num = "+num);
    }
    
    private static void randomText(String text){
        String str[] = text.split(" ");
        for (int i = 0; i < str.length ; i++) {
            System.out.println("str["+i+"] = "+str[i]);
        }
        
        int index = randomNumber(str.length);
        System.out.println("ผู้โชคดีคือ "+str[index]);
        
    }
    
    public static void main(String[] args) {
//        randomNumber(10);
//        randomNumberBound(10, 15);
        randomText("na ne nu nan nam nene nono"); 
    }    
}//end class