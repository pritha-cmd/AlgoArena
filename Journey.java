public class Journey{
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);

        int n = sc.nextInt(); 
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int sum = 0;

        int[] arr = {a, b, c};

        int day = 0;

        while (sum < n) {
            sum += arr[0];
            sum += arr[1];
            sum += arr[2];

            day++;
        }

        System.out.println(day);
        sc.close(); // Close the Scanner object
    }
}
