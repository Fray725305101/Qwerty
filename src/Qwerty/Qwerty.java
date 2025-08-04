package Qwerty;

import java.util.Scanner;

public class Qwerty {
    public static void main (String[] args) {
        String qwerty = "qwertyuiopasdfghjklzxcvbnm";
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter char: ");
        String inputChar = scanner.nextLine();
        int idxInputChar = qwerty.indexOf(inputChar);
        if (!inputChar.equals("q")) {
            System.out.println(qwerty.charAt(idxInputChar - 1));
        }
        else {
            System.out.println(qwerty.charAt(qwerty.length()-1));
        }
    }
}
