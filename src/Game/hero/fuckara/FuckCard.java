package Game.hero.fuckara;

public class FuckCard {
	private int cardNum;
	private String cardNumString;
	private String cardShape;
	
	public FuckCard(int cardNum, String cardNumString, String cardShape) {
		this.cardNum = cardNum;
		this.cardNumString = cardNumString;
		this.cardShape = cardShape;
	}
	
	public String getCardNumString() {
		return cardNumString;
	}

	public String getCardShape() {
		return cardShape;
	}

	public int getCardNum() {
		return this.cardNum;
	}
	
	
	public String printCard() {
		return String.format("[%s%s]", this.cardShape, this.cardNumString);
	}

}
