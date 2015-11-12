//Team Karen Ng -- Pardeep Singh, Jack Schluger, Jessica Yang
//APCS1 pd09
//HW29 -- Ye Olde Role Playing Game, Improved
//11-12-2015

public class Character {

    protected int health;
    protected int strength;
    protected int defense;
    protected double atkRating;

    public boolean isAlive() {
	return health > 0;
    }
    //return the defense stat
    public int getDefense() {
	return defense;
    }
    //lower the amount of health based on damage done by  warrior
    public void lowerHP( int damage ) {
	health -= damage;
    }
    //find how much damage can be done and lowers it from the warrior if the damage is higher than 0
    public int attack( Character enemy ) {
	int damage = (int) ( (strength * atkRating) - enemy.getDefense() );
	if (damage >= 0){
	    enemy.lowerHP( damage );
	    return damage;
	}
	return 0;
    }
}//end class character
