
public class countPrime {
	
	    public int countPrimes(int n) {
	        if (n < 2){
	            return 0;
	        }
	        int result = 0;
	        for (int i = 2; i < n; i++){
	            if (isPrimes(i)){
	                result++;
	            }
	        }
	        return result;
	    }
	    public boolean isPrimes(int num){
	        for (int i = 2; i <= Math.sqrt(num); i++){
	            if (num % i == 0){
	                return false;
	            }
	        }
	        return true;
	    }
	

	public static long time;
	
	public static void main(String[] args){
		countPrime num = new countPrime();
		for(int i=10000;i<=100000;i+=10000){
			long a =System.nanoTime();
			System.out.println("the number of prime is"+num.countPrimes(i));
			long b =System.nanoTime();
			time= b-a; 
			System.out.println("the step is :"+i);
			System.out.println("the time is"+time);
		}
	}
}
