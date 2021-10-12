public class testMath {

    public static void main(String[] args) {
         
        Float step = 0.25f;
        Float[] myFloat = {2.0f, 2.165f, 2.28f , 2.456f, 2.6f , 2.7f , 2.759f , 2.875f , 3.0f };
     
        for (int i=0; i< myFloat.length; i++) {
            System.out.print(myFloat[i] + "\t");
            if ((myFloat[i] % step) >= (0.13)) {
                System.out.println( myFloat[i] + (step - (myFloat[i] % step)));
            } else
            {
                System.out.println( myFloat[i] - ((myFloat[i] % step)));{
             
             
            /// creating another float type 

            float num1=5.5f;  
            float num2=5f;  
            System.out.println("num1: "+num1);  
            System.out.println("num2: "+num2);  
             
             
                }
            }
        }
    }




}