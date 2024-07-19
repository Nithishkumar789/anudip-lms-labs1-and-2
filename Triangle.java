package firstproject;

public class Triangle {

public static void main(String[] args) {
   
    int angle1 = 60;  
    int angle2 = 60;   
    int angle3 = 60;  
    boolean isTriangle = isTriangle(angle1, angle2, angle3);
  if (isTriangle) 
  {
        System.out.println("Yes, these angles can form a triangle.");
    } else 
    {
        System.out.println("No, these angles cannot form a triangle.");
    }
}
public static boolean isTriangle(int angle1, int angle2, int angle3)
{
    return (angle1 + angle2 + angle3 == 180);
}
}