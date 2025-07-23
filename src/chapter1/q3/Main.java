package chapter1.q3;

import java.util.Scanner;

public class Main {
    public static String solution(String str) {
        /*
        String[] strArray = str.split(" ");
        int maxIdx = 0;
        int maxSize = 0;
        for(int i = 0; i < strArray.length; i++) {
            String s = strArray[i];
            if (s.length() > maxSize) {
                maxSize = s.length();
                maxIdx = i;
            }
        }
        return strArray[maxIdx];
         */
        String result = "";
        int min = Integer.MIN_VALUE, pos;
        while((pos = str.indexOf(' '))!=-1) {
            String tmpString = str.substring(0, pos);
            if(tmpString.length() > min) {
                min = tmpString.length();
                result = tmpString;
            }
            str = str.substring(pos+1);
        }

        if(str.length() > min) { result = str; }
        return result;
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        String s = "hello";
        System.out.println("s.indexOf(' ') = " + s.indexOf(' '));
        String str = kb.nextLine();
        System.out.println(solution(str));
    }
}