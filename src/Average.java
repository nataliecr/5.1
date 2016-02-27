import java.util.Scanner;

public class Average {
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.print("Enter an integer, the input ends if it is 0: ");
    int num = input.nextInt();
    int pos = 0;
    int neg = 0;
    double total = 0;
    int count = 0;
    
    while (num != 0){
      if (num > 0)
        pos++;
      else
        neg++;
      total = total + num;
      count++;
      num = input.nextInt();
    } // while
    
    double average = total / count;
    
    System.out.println("The number of positives is " + pos);
    System.out.println("The number of negatives is " + neg);
    System.out.println("The total is " + total);
    System.out.println("The average is " + average);
  }  // main
} // class Average
