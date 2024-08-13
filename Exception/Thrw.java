import java.util.Scanner;

public class Thrw {
    
    public static void divide(int a,int b) throws ArithmeticException{
        System.out.println("The result is : "+a/b);
    }
    @SuppressWarnings("resource")
    public static void main(String[] args){
    
        Scanner sc = new Scanner(System.in);

        int age = sc.nextInt();

        if(age < 18){
            throw new RuntimeException("Sorry you are Not eligible to vote!!"); // If exception occurs uska niche ka lines execute nahi honge
        }
        else{
            System.out.println("You are eligible to vote");
        }
        sc.close();

        divide(10,0 );
    }
}
