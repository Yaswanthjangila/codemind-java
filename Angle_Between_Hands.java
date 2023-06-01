import java.util.Scanner;
public class ClockAngleCalculator 
{
    public static void main(String[] args) 
{
    Scanner scanner = new Scanner(System.in);
    String time = scanner.nextLine();
    String[] timeParts = time.split(":");
    int hours = Integer.parseInt(timeParts[0]);
    int minutes = Integer.parseInt(timeParts[1]);
    double hourAngle = (hours % 12 + minutes / 60.0) * 30;
    double minuteAngle = minutes * 6;
    double angle = Math.abs(hourAngle - minuteAngle);
    if (angle > 180) 
        {
            angle = 360 - angle;
        }
        System.out.println(angle);
        
        scanner.close();
    }
}
