public class Talanalyse {
    public int getNumbersAboveAvg(int[] numbers) {
        int sum = 0;
        int average = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];

        }
        average = sum / numbers.length;
        int counter = 0;
        for (int i = 0; i < numbers.length; i++)
            if (numbers[i] > average) {
                counter++;
                return counter;
            }
    }
}






