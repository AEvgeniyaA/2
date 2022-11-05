//Если необходимо, исправьте данный код
//try {
   // int d = 0;
    //double catchedRes1 = intArray[8] / d;
   // System.out.println("catchedRes1 = " + catchedRes1);
 //} catch (ArithmeticException e) {
    //System.out.println("Catching exception: " + e);
// }
 



public class t2 {
    

    public static int[] intArray;

    public static void main(String[] args) {
       
        try {
            Double d = null;
            System.out.println(" d = " + d.toString()); 
            double res2 = intArray[8] / d; 
            System.out.println("res2 = " + res2);
            } catch (ArrayIndexOutOfBoundsException oobe) {
            System.out.println("Getting " + oobe.getMessage());
            } catch (NullPointerException npe) {
            npe.printStackTrace();
            System.out.println("Getting NullPointerException");
            }
           
        

         
         
    }
}
