package strategy;

public class Player {
	private String name;
	private Strategy Strategy;
	private int winCount;
	private int loseCount;
	private int gameCount;
	public Player(String name, Strategy strategy){
		this.name = name;
		this.Strategy = strategy;
	}

	public Hand nextHand(){
		return Strategy.nextHand();
	}
	public void win(){
		Strategy.study(true);
		winCount++;
		gameCount++;
	}
	public void lose(){
		Strategy.study(false);
		loseCount++;
		gameCount++;
	}
	public void even(){
		gameCount++;
	}
	public String toString(){
		return "[" + name + ":" + gameCount + "games," + winCount + " win, " + loseCount + " lose" + "]";

	}
}
