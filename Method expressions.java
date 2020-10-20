@Named
public class PlayerBean {
	private String playerName = "Petros";
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
	
	public void vamosPetros_1() {
		System.out.println("Vamos Petros!");
	}	
	// We can access these fields as shown:
	// #{playerBean.vamosPetros_1()}	

	public String vamosPetros_2() {
		return "Vamos Petros!";
	}
	// We can access these fields as shown:
	// #{playerBean.vamosPetros_2()}
	
	public void vamosRafa_3(String text) {
		System.out.println(text);
	}
	// We can acces these fields as shown:
	// #{playersBean.vamosRafa_3('Vamos Rafa!')}

	public String vamosRafa_4(String name, String surname) {
		return "Vamos " + name + " " + surname + "!";
	}
	// We can acces these fields as shown:
	// #{playersBean.vamosRafa_4(playersBean.playerName, playersBean.playerSurname)}
}

