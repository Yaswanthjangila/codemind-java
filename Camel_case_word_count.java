import java.util.Scanner;
public class java
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int c=0;
        String s=sc.nextLine();
        for(int i=0;i<s.length();i++)
        {
            if((int)s.charAt(i)>=65 && (int)s.charAt(i)<=90)
            {
                c+=1;
            }
        }
        if(s.charAt(0)>=65 && s.charAt(0)<=90)
        {
            System.out.println(c);
        }
        else
        {
            System.out.println(c+1);
        }
    }
}