package pkgCore;

import java.util.LinkedList;

public class Round {

	//private byte ComeOutScore;
	private eGameResult eGameResult;
	private LinkedList<Roll> rolls = new LinkedList<Roll>();
	/*private byte[] natural = {7,11};
	private byte[] craps = {2,3,12};
	private byte[] point = {4,5,6,7,8,9,10};*/

	public void rollDice()
	{
		Roll r = new Roll();
		rolls.add(r);
	}
	public Round() {
		rolls.add(new Roll());
		if (isNatural(rolls.getLast().getScore())) {
			eGameResult = pkgCore.eGameResult.NATURAL;
			printResult();
		}
		else if (isNatural(rolls.getLast().getScore())) {
			eGameResult = pkgCore.eGameResult.CRAPS;
			printResult();
		}
		else {
			do
			{
				rollDice();
			} 
			while((rolls.getLast().getScore() != 7 ) || (rolls.getLast().getScore() != rolls.getFirst().getScore()));
			{
				rollDice();
			}
			if(rolls.getLast().getScore() == 7) {
				eGameResult = pkgCore.eGameResult.SEVEN_OUT;
				printResult();
			}
			else if ((rolls.getLast().getScore() != rolls.getFirst().getScore())){
				eGameResult = pkgCore.eGameResult.POINT;
			}
		}
		System.out.print(rolls);
	}
	public static boolean isNatural(int iScore) {
		return ((iScore == 7) || (iScore == 11));
	}
	public static boolean isCraps(int iScore) {
		return ((iScore == 2) || (iScore == 3) || (iScore == 12));
	}
	public int RollCount() {
		// Return the roll count
		return rolls.getLast().getScore();
	}
	public boolean isComeOut()
	{
		return (rolls.size()==1);
	}
	public Roll ComeOutRoll()
	{
		return rolls.getFirst();
	}
	public byte ComeOutRollScore()
	{
		return rolls.getFirst().getScore();
	}
	/*public boolean isNatural()
	{
		return ComeOutRoll().isNatural();
	}
	public boolean isCraps() {
		return ComeOutRoll().isCraps();
	}
	public String ListRolls(){
		String strRolls = new String();
		for (Roll r: rolls) {
			strRolls = strRolls + r.getScore() + "-";	
		}
		return strRolls;
	}*/
	public int GetLastRoll() {
		return rolls.getLast().getScore();
	}
	public eGameResult geteGameResult() {
		return eGameResult;
	}
	public void printResult() {
		System.out.print(eGameResult);
	}
}
