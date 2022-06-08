package ru.netology.sqr.services.sqrsevice;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SQRServiceTest {

    @Test
    public void shouldCalcExact() {
        SQRService service = new SQRService();

        int expected = 10;
        int actual = service.calcSQR(10, 99);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public  void shoudCalcInexact() {
        SQRService service = new SQRService();

                int expected = 99;
        int actual = service.calcSQR(10, 99);

        Assertions.assertEquals(expected, actual);
    }
}
