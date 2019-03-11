package edu.binus.cr.le01;

public class Swordman extends Hero {
	
	public Swordman() {
		super();
		hp = 1000;
		mp = 200;
		attack = 100;
		defend = 50;
	}

	@Override
	public void skill(Hero enemy) {
		if(getMp() - 50 >= 0){
			setDefend(getDefend() + 20);
			setAttack(getAttack() - 20);
			setMp(getMp() - 50);
		}
	}
	
	@Override
	public String toString() {
		return "Swordman\n" + super.toString();
	}

}
