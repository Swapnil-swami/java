import java.util.Scanner;
class P2{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int num = sc.nextInt();
        int dup=num;
        int rev =0;
        while(num!=0){
            int rem=num%10;
            rev=rev*10+rem;
            num=num/10;
        }
        if (rev==dup){
            System.out.println("is palindrome");
        }else{
            System.out.println("is not a palindrome");
        }

    }
}