package pkgCore;

public class Die {

	private byte DieValue;
	private byte iMax = 6;
	private byte iMin = 1;

	public Die() {
		this.DieValue = (byte)(Math.random()*iMax+iMin);
	}
	public Die(byte iMax, byte iMin) {
		this.DieValue = (byte)(Math.random()*iMax+iMin);
	}

	public byte getDieValue() {
		return DieValue;
	}
}
