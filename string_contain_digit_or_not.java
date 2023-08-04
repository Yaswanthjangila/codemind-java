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
            if(s.charAt(i)=='0'||s.charAt(i)=='1'||s.charAt(i)=='2'||s.charAt(i)=='3'||s.charAt(i)=='4'||s.charAt(i)=='5'||s.charAt(i)=='6'||s.charAt(i)=='7'||s.charAt(i)=='8'||s.charAt(i)=='9')
            {
                c+=1;
            }
        }
        if(c!=0)
        {
            System.out.println("Contains "+c+" digit");
        }
        else
        {
            System.out.println("Doesn't contain digit");
        }
    }
}