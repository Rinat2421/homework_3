import java.util.Arrays;
import java.util.Random;
public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        double[] numbers = new double[15];
        numbers[0]=5;
        numbers[1]=7;
        for (int i = 2; i<15; i++){
            numbers[i]=random.nextInt(-10, 11);
        }

        boolean firstNegative = false;
        double count = 0;
        double sum = 0;

        for(double j: numbers){
            if (j>0){
                sum+=j;
                count+=1;
            }
            else if (firstNegative==false && j<0){
                firstNegative=true;
                sum=0;
                count=0;
            }
        }
        System.out.println("Массив: " + Arrays.toString(numbers));
        System.out.println("Среднее арифметическое положительных чисел после первого отрицательного: " + sum/count);
    }
}