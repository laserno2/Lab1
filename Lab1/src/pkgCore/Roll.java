package pkgCore;

public class Roll {

	/*private Die d1;
	private Die d2;
	private byte d1Score;
	private byte d2Score;*/
	private byte Score;

	public Roll() {
		Die d1 = new Die();
		Die d2 = new Die();
		byte d1Score = (byte) d1.getDieValue();
		byte d2Score = (byte) d2.getDieValue();
		Score = (byte) (d1Score+d2Score);
	}

	public byte getScore() {
		return Score;
	}

	/*public boolean isSeven()
	{
		return (getScore()==7) ? true: false;
	}
	public boolean isEleven()
	{
		return (getScore()==11);
	}
	public boolean isNatural()
	{
		return isSeven()||isEleven();
	}
	public boolean isCraps() {
		if (getScore() == 2) {
			return true;
		}
		if (getScore() == 3) {
			return true;
		}
		if (getScore() == 12) {
			return true;
		}
		else {
			return false;
		}
	}*/
}

