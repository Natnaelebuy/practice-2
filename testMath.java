public class testMath {

    public static void main(String[] args) {
         
        Float step = 0.25f;
        Float[] myFloat = {2.0f, 2.125f, 2.25f , 2.375f, 2.5f , 2.625f , 2.75f , 2.875f , 3.0f };
     
        for (int i=0; i< myFloat.length; i++) {
            System.out.print(myFloat[i] + "\t");
            if ((myFloat[i] % step) >= (0.13)) {
                System.out.println( myFloat[i] + (step - (myFloat[i] % step)));
            } else
            {
                System.out.println( myFloat[i] - ((myFloat[i] % step)));{
             
             
            
             
             
                }
            }
        }
    }




}