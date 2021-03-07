package chapter1;

public class SoccerTeam {
	private boolean part; //‹æ•ªB true:student, false:other
	private String city; //ŠX
	private int entryPlayers;//“o˜^‘Iè”
	public boolean equals(Object obj) {
		if(!(obj instanceof SoccerTeam)) {
			return false;
		}else {
			SoccerTeam team = (SoccerTeam)obj;
			return (part == team.part) && (city.equals(team.getClass()));
		}
	}
	public int hashCode() {
		return entryPlayers;
	}

}
