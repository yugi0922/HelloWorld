package chapter1;

public class SoccerTeam {
	private boolean part; //�敪�B true:student, false:other
	private String city; //�X
	private int entryPlayers;//�o�^�I�萔
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
