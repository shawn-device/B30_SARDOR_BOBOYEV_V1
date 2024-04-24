package task4;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class task4WithList {
    public static void main(String[] args) {
        List<Integer> data = new ArrayList<Integer>();
        data.add(8);
        data.add(3);
        data.add(4);
        data.add(5);
        List<Integer> data2 = new ArrayList<>();
        task4Masala(data2);

        /**
         *  bu yerda masala shartidek emas lekin agar son juft bolsa  2 ga bolinyapti;
         *  agar son toq bolsa 2 ga kopaytiryapti alohida alohida chiqdi arraylar
         */
    }

    public static List<Integer> task4Masala(List<Integer> number) {
        List<Integer> data = new ArrayList<Integer>();
        List<Integer> data2 = new ArrayList<>();

        for (Integer i : data) {
            if (i % 2 == 0){
             int juft = i / 2;
               data2.add(juft);
            } else {
               int toq = i * 2;
               data2.add(toq);
            }
        }
        System.out.println(data);     // bu kerak emas prosta kiritilgan arrayni korsatish uchun
        System.out.println(data2);

        return data2;

    }
}
