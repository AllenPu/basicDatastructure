
public class testprime {

	  public static void test3() {
	         for (int i = 2;i<= 100;i++){//1既不是质数也不是和数，所以从2开始
	             boolean k = true;
	              for (int n = 2; n < i; n++) {
	                  if (i % n == 0) {
	                      k = false;
	                      break;
	                  }
	              }    
	             if(k){
	                 System.out.print(i + " ");
	             }
	         }
	 }
	  
	  public static void main(String []args){
		  test3();
	  }
}
