package task3;

import task2.CustomLinkedList;

import java.util.Arrays;
import java.util.Objects;

public class Masala {
    public static void main(String[] args) {

        String[] j = {"cd", "ac", "dc", "ca", "zz"};
        int count = 0;
        for (int i = 0; i < j.length - 1; i++) {
            for (int a = i + 1; a < j.length; a++) {
                if (Objects.equals(j[i], reverse(j[a]))) {
                    count++;
                }
            }
        }
        System.out.print(count);
        System.out.println(" ta reverse soz bor arrayda");
    }


    public static String reverse(String str) {
        StringBuilder newStr = new StringBuilder();
        for (int i = str.length() - 1; i > -1; i--) {
            newStr.append(str.charAt(i));
        }
        return new String(newStr);
    }


}
