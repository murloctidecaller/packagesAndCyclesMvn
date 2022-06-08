package ru.netology.sqr.services.sqrsevice;

public class SQRService {

    public int calcSQR(int x, int y) {

        for (int i = 10; i <= 99; i++) {
            if (i * i >= x && i * i <= y) {

                System.out.println("Диапозон чисел " + i);
            }
        }
        return -1;
    }
}
