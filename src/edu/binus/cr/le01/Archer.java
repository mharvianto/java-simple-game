package edu.binus.cr.le01;

public class Archer extends Hero {
	
	public Archer() {
		super();
		hp = 700;
		mp = 500;
		attack = 120;
		defend = 30;
	}

	@Override
	public void skill(Hero enemy) {
		if(getMp() - 100 >= 0){
			enemy.setHp(enemy.getHp() - (int)(1.5 * this.getAttack() - enemy.getDefend()));
			this.setMp(this.getMp() - 100);
		}
	}
	
	public void ulti(){
		setAttack(getAttack() + 20);
		setHp(getHp() - 50);
	}
	
	public void ulti(Hero enemy){
		setAttack(getAttack() + 20);
		setHp(getHp() - 50);
	}
	
	@Override
	public String toString() {
		return "Archer\n" + super.toString();
	}
	
}
