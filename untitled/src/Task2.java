public class Task2 {
    public static void main(String[] args) {
        int random;
        int i = 0;
        while (i < 10) {
            i++;
            random = (int) Math.round(Math.random() * 200);
            System.out.println("Random is " + random);
            if (random > 100) {
                System.out.println("Random is " + random);
                i++;
            }
        }
    }
}
