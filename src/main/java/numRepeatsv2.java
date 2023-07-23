public class numRepeatsv2 {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 7, 8, 3};
        int[] duplicateNumbers = new int[10];
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] == numbers[j]) {
                    duplicateNumbers[j] = numbers[i];
                    System.out.println("number : " + numbers[i] + " on position :" + i);
                    System.out.println("number : " + numbers[j] + " on position :" + j);
                }
            }
        }
        for (int k = 0; k < duplicateNumbers.length; k++) {
            if (duplicateNumbers[k] == 0) {
                continue;
            }
            System.out.println("number is " + duplicateNumbers[k] + "on position  " + k);
        }
    }
}
