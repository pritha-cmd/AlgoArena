import java.util.Scanner;

class CubesSorting{
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        int t = sc.nextInt();
        while (t-->0){
            int n = sc.nextInt();
            int [] a= new int[n];
            boolean issorted = false;
            
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }

            for (int i = 1; i < n; i++) {
                if (a[i] >= a[i - 1]) {
                    issorted = true;
                    break;
                }
            }
            System.out.println(issorted ? "YES" : "NO");
        }
        sc.close();
        
    }
}