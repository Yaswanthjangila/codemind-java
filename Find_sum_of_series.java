import java.util.Scanner;
public class snc
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        double s=0;
        for(int i=1;i<=a;i++)
        {
            s=s+(1/(double)i);
        }
        System.out.format("%.2f",s);
    }
}