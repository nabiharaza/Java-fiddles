package Collections;

interface LambdaExpression1Interface {

	void abstractFun(int x); 
} 

public class LambdaExpression1 {
  
   public static void main(String args[]) { 
        LambdaExpression1Interface lambdaObj = (int aInt)->System.out.println(aInt);

        lambdaObj.abstractFun(42); 
    } 

}