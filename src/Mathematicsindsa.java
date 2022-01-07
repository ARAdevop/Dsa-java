import java.util.Scanner;

public class Mathematicsindsa {
    static boolean prime(int a) {
         if (a == 1)
             return false;
         else if (a % 2 == 0 && a % 3 == 0)
                 return false;
             else
                 return true;

    }
         public static void main(String[] args){
             Scanner sc = new Scanner(System.in);
             int A = sc.nextInt();
             System.out.println(prime(A));
         }

     }
