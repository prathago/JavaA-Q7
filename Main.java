import java.util.*;
class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number");
    int n = sc.nextInt();
    System.out.println("Enter your choice");
    System.out.println("1. Find wether a prime number or not");
    System.out.println("2. Find wether a automorphic number or not");
    int ch = sc.nextInt();
    switch(ch) {
      case 1: 
        int x = 0;
        for(int i = 2; i < n; i++) {
          if(n % i == 0) {
            x = 1;
            break;
          }
        }
        if(x == 0) {
          System.out.println(n + " is a prime number.");
        }
        else {
          System.out.println(n + " is not a prime number.");
        }
        break;
      case 2:
        int square = n * n;
        int y = 0;
        while(n > 0) {
          if(n % 10 != square % 10) {
            y = 1;
            break;
          }
          n = n /10;
          square = square/10;
        }
        if(y == 0) {
          System.out.println("The given number is an Automorphic number");
        }
        else {
          System.out.println("The given number is not an Automorphic number");
        }
      break;
      default: System.out.println("Wrong Choice");
    }
  }
}