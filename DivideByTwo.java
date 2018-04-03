//Author:Ruizhi Pu
//import the package of the i/o sysytem
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

//this class is used to divide the int 
public class DivideByTwo {
	//main function
	public static void main(String []args){
		// the class bufferedread is used to deal with input stream
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int x;
		String oneLine;
		//output
		System.out.println("Enter an Integer");
		//try-catch is a function to catch the unexpected error
		try{
			//read the input by line
			oneLine = in.readLine();
			//put the input from string stream to int
			x = Integer.parseInt(oneLine);
			System.out.println("Half of x is " + ( x/2 ));
		}
		catch(IOException e ){//if the input is not a number
			System.out.println( e );
		}
		catch(NumberFormatException e ){//if it is not a int
			System.out.println( e );
		}
	}
}
