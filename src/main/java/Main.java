import ru.netology.sqr.services.sqrsevice.SQRService;

public class Main {

    public static void main(String[] args) {

        SQRService service = new SQRService();
        System.out.println(service.calcSQR(10, 99));
    }
}