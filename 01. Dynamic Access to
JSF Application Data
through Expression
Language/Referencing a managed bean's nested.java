@Named
public class PlayersBean {
	private String playesName = "Petros";
	private String playerSurname = "Trak";
	private PlayerDetails playerDetails;
	
	public String getPlayerName() {
		return playerName;
	}
	
	public String getPlayerSurName() {
		return playersurName;
	}
	
	public PlayerDetails getPlayerDetails() {
		return playerDetails;
	}
}

public class PlayerDetails {
	private Date birthday;
	private String birthplace;
	
	public Date getBirthday() {
		return birthday;
	}
	
	public String getBirthplace() {
		return birthplace;
	}
}

/*
	We can access these fields as shown:
	
	#{playersBean.playerDetails['birthday']}
	#{playersBean.playerDetails['birthplace']}
	
	or
	
	#{playersBean['playerDetails'].birthday}
	#{playersBean['playerDetails'].birthplace}
*/
