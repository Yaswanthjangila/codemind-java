import java.util.Scanner;
public class Multiplication
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        float num1=Float.parseFloat(sc.nextLine());
        float num2=Float.parseFloat(sc.nextLine());
        float result=num1*num2;
        System.out.printf("%.2f%n",result);
        sc.close();
    }
}