package Intro_Java_Exercises;

import java.util.Scanner;

/**
 * Lst_6_8_Hex2Dec
 */
public class Lst_6_8_Hex2Dec {

    public static int hexCharToDec(char ch) {
        if (ch >= 'A' && ch <= 'F') // 把A-F转换为十进制的数， A = 10， B = 11，ch - A得出ch与A的差值，再+10 就得到了ch的十进制表示
            return 10 + ch - 'A'; // ch输入的是字符的ANSCII码
        else // ch is 0, 1, 2, 3, 4...9
            return ch - '0';
    }
    
    public static int hexToDec(String hex) {
        // Horner's algorithm
        int decValue = 0;
        for (int i = 0; i < hex.length(); i++) {
            char hexChar = hex.charAt(i);
            decValue = decValue * 16 + hexCharToDec(hexChar);
        }
        return decValue;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a hex number: ");
        String hex = input.nextLine();

        System.out.println("The decimal value for hex number " 
                            + hex + " is " + hexToDec(hex.toUpperCase()));
    }
}