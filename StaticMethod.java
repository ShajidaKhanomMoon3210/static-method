Static Method

package StaticMethod;

public class MathUtility {
    public static int add(int a, int b) {
        return a + b;
    }
}
public class Test {
     public static void main(String[]args)
    {
        int sum=MathUtility.add(10,20);
        System.out.println("The Sum: " +sum);
    }
}



