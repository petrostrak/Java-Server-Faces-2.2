public enum Plays {
	Left, Right
};

private Plays play;
	...
play = Plays.Left;//initialization can be done in constructor
	...
	
public Plays getPlay() {
	return play;
}
	...
	
/*
	You can easily output the play value as shown in the following line of code:
	
	#{playersBean.play}
	
	To refer to the Plays constant, Plays.Left , with an expression, use the String
	literal Left (or Right for Plays.Right ), for example, you can test whether play
	is Left or Right , as shown in the following code:
	
	#{playersBean.play == 'Left'} //return true
	#{playersBean.play == 'Right'}//return false
*/
