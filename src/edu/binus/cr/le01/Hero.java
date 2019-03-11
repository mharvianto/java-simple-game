package edu.binus.cr.le01;

public abstract class Hero {
	protected int hp;
	protected int mp;
	protected int exp;
	protected int attack;
	protected int defend;
	
	public Hero() {
		exp = 0;
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public int getMp() {
		return mp;
	}

	public void setMp(int mp) {
		this.mp = mp;
	}

	public int getExp() {
		return exp;
	}

	public void setExp(int exp) {
		this.exp = exp;
	}

	public int getAttack() {
		return attack;
	}
	
	public void setAttackUp(){
		setAttack(10);
	}
	
	public void setAttackUp(int attack){
		setAttack(getAttack() + attack);
	}

	public void setAttack(int attack) {
		if(attack < 0) return;
		this.attack = attack;
	}

	public int getDefend() {
		return defend;
	}

	public void setDefend(int defend) {
		if(defend < 0) return;
		this.defend = defend;
	}
	
	public void attack(Hero enemy){
		enemy.setHp(enemy.getHp() - (attack - enemy.getDefend()));
	}
	
	public abstract void skill(Hero enemy);
	
	@Override
	public String toString() {
		return String.format("HP/MP: %d/%d\nAtk: %d\nDef: %d\n", getHp(), getMp(), 
				getAttack(), getDefend());
	}
	
	public boolean isLife(){
		return getHp() > 0;
	}
}
