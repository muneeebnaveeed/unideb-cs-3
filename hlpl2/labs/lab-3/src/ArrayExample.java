public class ArrayExample {
    static void main(String[] args) {
        int[] numbers = new int[5];

        for(int i = 0; i < numbers.length; i++) {
            numbers[i] = (i+1) * 10;
        }

        for (int n:numbers) {
            System.out.println("Value: " + n);
        }
    }
}
