import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sideA = scanner.nextInt();
        int sideB = scanner.nextInt();
        int sideC = scanner.nextInt();
        scanner.close();
        
        double area = calculateTriangleArea(sideA, sideB, sideC);
        System.out.printf("%.2f", area);
    }
    
    public static double calculateTriangleArea(int a, int b, int c) {
        double s = (a + b + c) / 2.0;
        double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));
        return area;
    }
}
