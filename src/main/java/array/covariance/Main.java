package array.covariance;

public class Main {

    public static void main(String[] args) {
        Object[] objects = ArrayGenerator.create();
        ArrayFiller.fillThirdValue(objects);
        ArrayPrinter.print(objects);
    }
}
