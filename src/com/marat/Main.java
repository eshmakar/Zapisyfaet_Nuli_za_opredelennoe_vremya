package com.marat;

import java.io.FileWriter;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        long t1 = System.currentTimeMillis()+1000*60*5;
        System.out.println("Выполняю...");
        FileWriter fw = new FileWriter("D:\\java\\test.txt", false);
while (System.currentTimeMillis()<t1) {
       fw.write("0");
}
        fw.close();
        System.out.println("Выполнил!");
    }
}
