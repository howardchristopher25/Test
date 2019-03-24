package test;

public class Test 
{
   public static void main(String[] args) 
    {
        boolean test;
        test = true;
        int array[] = new int[5];
        
        array[0] = 1;
        array[1] = 2;
        array[2] = 3;
        array[3] = 4;
        array[4] = 6;
        
        
        for (int start : array)
        {
            if (start == 1)
            {
                System.out.println("1");
            }
            if (start == 2)
            {
                System.out.println("2");
            }
            if (start == 3)
            {
                System.out.println("3");
            }
            if (start == 4)
            {
                System.out.println("4");
            }
            if (start == 5)
            {
                System.out.println("5");
            }
        }
    }
}
