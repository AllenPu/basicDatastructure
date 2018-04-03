import java.util.Arrays;
import java.util.Random;

//show some array use
public class ArrayTest {
	public static void main(String[] args){
		int data[] = new int[10];
		Random rand = new Random();				//a pseudo-random number generator
		rand.setSeed(System.currentTimeMillis());	//use current time as a seed
		//fill the data array with the pseudo number from 0 to 99,inclusive
		for(int i=0;i<data.length;i++){
			data[i]=rand.nextInt(100);
		}
		int[] orig = Arrays.copyOf(data,data.length);	//make a copy of data array
		System.out.println("arrays equal before sort"+Arrays.equals(data,orig));
		Arrays.sort(data);
		
		
		
	}
}
