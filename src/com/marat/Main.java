package com.marat;

import java.io.FileWriter;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        long t1 = System.currentTimeMillis()+1000*60*5; // здесь выбрано выполнение за 5 минут
        System.out.println("Выполняю...");
        FileWriter fw = new FileWriter("D:\\java\\test.txt", false);
while (System.currentTimeMillis()<t1) { // если настоящее время меньше чем мы написали сверху от 5 минут....
       fw.write("0"); // запишет в файл нолики
}
        fw.close();
        System.out.println("Выполнил!");
    }
}
