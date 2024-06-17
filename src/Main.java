import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        System.out.println("Задание 1");
        int [] weight = new int [3];
        weight[0] = 1;
        weight[1] = 2;
        weight[2] = 3;
        double [] price = {1.57, 7.654, 9.986};
        byte [] apples = {3, 7, 9, 12};

        System.out.println("Задание 2");
        System.out.printf(weight[0] + ", " +weight[1] + ", " +weight[2]);
        System.out.println();
        System.out.printf(price[0] + ", " +price[1] + ", " +price[2]);
        System.out.println();
        System.out.printf(apples[0] + ", " +apples[1] + ", " +apples[2] + ", " +apples[3]);
        System.out.println();

        System.out.println("Задание 3");
        System.out.printf(weight[2] + ", " +weight[1] + ", " +weight[0]);
        System.out.println();
        System.out.printf(price[2] + ", " +price[1] + ", " +price[0]);
        System.out.println();
        System.out.printf(apples[3] + ", " +apples[2] + ", " +apples[1] + ", " +apples[0]);
        System.out.println();

        System.out.println("Задание 4");
        for (int index = 0; index < weight.length; index++) {
            if (weight[index] % 2 != 0){
                weight[index] += 1;
            }
        }
        System.out.print(Arrays.toString(weight));
    }
}