package co_test;

import java.util.Scanner;

public class test03_대소문자변환 {
	//대소문자 변환
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String answer = "";

        //Stack <Character> stack = new Stack <> ();

        for(Character c : a.toCharArray()){
            if(Character.isUpperCase(c)){
                //stack.push(Character.toLowerCase(c));
                answer += Character.toLowerCase(c);
            }
            else if(Character.isLowerCase(c)){
                //stack.push(Character.toUpperCase(c));
                answer += Character.toUpperCase(c);
            }
        } 
        System.out.println(answer);
    }
}
