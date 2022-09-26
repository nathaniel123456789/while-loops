public class WhileLoops
{
    int c = 1;
    int d = -8;

    public void run() {
        int i = 0;
        while (i < 15) {
            System.out.println("i is " + i + " but is less than 15");
            i++;
        }
        int k = 10;
        while (k > 5) {
            System.out.println("k is " + k + "but is greater than 5");
            k--;
        }
        int a = 3;
        int b = 8;
        while (a < 10) {
            while (b <= 20) {
                System.out.println("b is " + b + "but is less thna or equal to 20");
                System.out.print(" and a is " + a + " but is less than 10");

            }
        }
    }
    public static void main(String[] args)
        {
        WhileLoops hw = new WhileLoops();
        hw.run();  
    }
}