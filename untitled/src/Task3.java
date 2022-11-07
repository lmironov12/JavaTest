public class Task3 {
    public static void main(String[] args) {
        int[] array = {188, 181, 156, 162, 173, 152, 169, 193, 185};
        int result = 0;
        int average;
        for (int i = 0; i < array.length; i++) {
            result = result + array[i];
        }
        average = result / array.length;
        System.out.println(average);
    }
}

