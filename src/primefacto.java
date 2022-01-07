import java.util.Scanner;

public class primefacto {

    static void primno(int n){
        for (int i = 1 ; i<=n ; i++){
            if (i%2==0 || i%3==0){
             System.out.println("Not a prime");
            }
            else
                System.out.println(i);
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        primno(n);
    }
}
