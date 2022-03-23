package chap3;

import java.util.Scanner;

public class CountAlphabet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter sentence : ");
        String sentence = sc.nextLine().toLowerCase();
        System.out.println("จำนวนอักขระทั้งหมด "+sentence.length());
        //Reverse String
        StringBuilder sb = new StringBuilder(sentence);
        System.out.println("");
        int countV = 0,  countNV = 0;
        String strNotV = ("Reverse = "+sb.reverse());
        for (int i = 0; i < sentence.length(); i++) {
            char c = sentence.charAt(i);
            System.out.print(c+"\t");
            if (c == 'a' || c == 'e' || c== 'i'|| c== 'o' || c == 'u') {
               countV++; 
            } else {
                countNV++;
                strNotV = strNotV + c;
                //System.out.print(sentence)+"\t");
            }
        
        }

        System.out.println("จำนวนสระ "+countV);
        System.out.println("จำนวนพยัญชนะ "+countNV);
        System.out.println("พยัญชนะมีดังนี้ "+strNotV);
        
    }
    
}//end class
