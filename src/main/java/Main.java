import ru.netology.sqr.work6_1.services.SQRService;

public class Main {
    public static void main(String[] args) {


        SQRService service = new SQRService();
        int result = service.calcQuantitiesSquaresInRangeNumbers(100, 100);
        System.out.println(result);
    }
}