package Qwerty;

import java.util.Scanner;

public class Qwerty {
    public static void main (String[] args) {
        String qwerty = "qwertyuiopasdfghjklzxcvbnm"; //Задаём строку по раскладке qwerty
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter char: ");
        String inputChar = scanner.nextLine();
        int idxInputChar = qwerty.indexOf(inputChar); //Определяем индекс введённого символа в подстроке
        if (!inputChar.equals("q")) { //Если это не первый символ (совсем правильно было бы использовать индекс=0, но мы же хотим пощупать equals)
            System.out.println("Left char is " + qwerty.charAt(idxInputChar - 1)); //Выводим предыдущий символ
        }
        else {//Иначе
            System.out.println("Left char is " + qwerty.charAt(qwerty.length()-1)); //Последний символ
        }
    }
}
