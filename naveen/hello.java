import java.util.Scanner;
class hello
{
    public static void main(String args[])
    Scanner sc = new Scanner(System.in);
    System.out.println("Number1 :");
    int a= sc.nextInt();
    System.out.println("Number2 :");
    int b = sc.nextInt();
    for(int i=a;i<=b;i=i+1)
    {
        System.out.println(i);
    }
}