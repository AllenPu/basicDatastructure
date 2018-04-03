
public class Scoreboard {
	private int numEntries=0;	//number of actual entries
	private GameEntry[] board;  //array of game entry
	
	//constructs an empty scoreboard with the given capacity
	public Scoreboard(int capacity){
		board = new GameEntry[capacity];
	}
	
	//more methods will go there
	
	//attempt to add a new score to the collection(if it is high eough)
	public void add(GameEntry e){
		int newScore = e.getScore();
		//is the new entry e really a high score?
		if(numEntries < board.length || newScore > board[numEntries-1].getScore()){
			if(numEntries < board.length)	//no score drops from the board
				numEntries++;				//so overall number increased
			int j=numEntries - 1;
			while(j > 0 && board[j-1].getScore() < newScore){
				board[j] = board[j-1];		//shift entry from j-1 to j
				j--;						//and decrement j
			}
			board[j]=e;						//when done,add new entry
		}
	}
	
	//remove and return the high score at index i
	public GameEntry remove(int i) throws IndexOutOfBoundsException{
		if( i<0 || i>=numEntries)
			throw new IndexOutOfBoundsException("Invaild indes "+ i);
		GameEntry temp=board[i];			//save the object to be removed	
		for (int j=i;j<numEntries-1;j++)   //count up from i (not down)
			board[j]=board[j+1];            //move one cell to the left
		board[numEntries-1] = null;         //null out the old last score
		numEntries--;
		return temp;						//return the removed object
	}
	
	//insertion-sort of an array of characters into nondecreasing order
	public static void insertionSort(char[] data){
		int n=data.length;
		for(int k=1;k<n;k++){				//begin with second character
			char cur=data[k];				//time to insert cur=data[k]
			int j=k;						//find correct index j for cur
			while(j>0 && data[j-1]>cur){	//thus,data[j-1] must go after cur
				data[j]=data[j-1];			//slide data[j-1] rightward
				j--;						//and consider previous j for cur
			}
			data[j]=cur;					//this is the proper place for cur
		}
	}


}
