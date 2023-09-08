import java.util.Scanner;
public class conversion
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s;
        s=sc.nextLine();
        int n;
        n=Integer.parseInt(s,8);
        System.out.println(n);
    }
}