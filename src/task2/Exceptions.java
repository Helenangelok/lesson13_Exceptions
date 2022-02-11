package task2;

public class Exceptions {
    public static void main(String[] args) {
        int[] numbers = new int[4];
        try {
           numbers [3] = 25/5;
           numbers [2] = 20/2;
           numbers [4] = 20/5;
        } catch (ArithmeticException nfe) {
            System.err.println("You can't devide by 0.");
        } catch (ArrayIndexOutOfBoundsException aebe) {
            System.err.println("There is no such index");
        }
    }
}
