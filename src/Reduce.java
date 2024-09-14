public class Reduce {
    public static void main(String[] args) {
        int steps = 0;
        int n = 100;
        while (n >= 0) {
            boolean even = n % 2 == 0;
            if (n == 0) {
                System.out.println(steps);
                return;
            }
            else if (even) {
               steps++;
               n = n/2;
            }
            else {
                steps++;
                n = n-1;
            }
        }
    }

}

