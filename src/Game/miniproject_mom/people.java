package Game.miniproject_mom;

public class people {
	
	private String name;
	
	private int hp;
	
	private String attack;
	
	private String critical;

	
	public people() {
	}
	
	public people(String name, int hp, String attack, String critical) {
		super();
		this.name = name;
		this.hp = hp;
		this.attack = attack;
		this.critical = critical;
	}
	public people(String name, int hp, String critical) {
		super();
		this.name = name;
		this.hp = hp;
		this.critical = critical;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public String getAttack() {
		return attack;
	}

	public void setAttack(String attack) {
		this.attack = attack;
	}

	public String getCritical() {
		return critical;
	}

	public void setCritical(String critical) {
		this.critical = critical;
	}
	
	public String thunderLightening() {
		return "";
	}
	public String fireRage() {
		return "";
	}
	public String druidAttack() {
		return "";
	}
	public String warlockAttack() {
		return "";
	}
	public String paladinAttack() {
		return "";
	}
	public String HumanAttack() {
		return "";
	}
	public String umbAttack() {
		return "";
	}
	public String gaunAttack() {
		return "";
	}
	public String lightAttack() {
		return "";
	}
	public String swordAttack() {
		return "";
	}
	
	
	
}
