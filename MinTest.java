//Author :RuiZhi Pu
//this class is used to define which is less in two int
public class MinTest {
	//main function
	public static void main(String []args){
		int a =3;
		int b=7;
		//output
		System.out.println(min(a,b));
	}
	//this static function is used to find the less one
	public static int min(int x ,int y){
		//if x is less than y,return x;else return y
		return x<y?x:y;
	}
	
	
}
