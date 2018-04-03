
public class GameEntry {
	private String name;		//name of the person earning this score
	private int score;		    //the score value
	
	//construct a game entry with given parameters
	public GameEntry(String n,int s){
		name=n;
		score=s;
	}
	
	//return the name field
	public String getName(){return name;}
	
	//return the score field
	public int getScore(){return score;}
	
	public String toString(){
		return "("+name+","+score+")";
	}
}
