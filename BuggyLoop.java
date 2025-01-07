public class MyClass {
    public static void main(String[] args) {
        int i = 0;
        while (i < 10) {
            if (i == 5) {
                break; // Exit the loop
            }
            System.out.println(i);
            i++;
        }
        System.out.println("Loop finished");
    }
}