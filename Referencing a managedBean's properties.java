@Named
public class PlayersBean {
	private String playesName = "Petros";
	private String playerSurname = "Trak";
	
	public String getPlayerName() {
		return playerName;
	}
	
	public String getPlayerSurName() {
		return playersurName;
	}
}

/*
	We can access these fields as shown:
	
	#{playersBean.playerName}
	
	or
	
	#{playersBean['playerName']}
*/
