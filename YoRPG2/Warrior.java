//Team Karen Ng -- Pardeep Singh, Jack Schluger, Jessica Yang
//APCS1 pd09
//HW29 -- Ye Olde Role Playing Game, Improved
//11-12-2015

public class Warrior extends Character{

    //--------Instance Vairables--------------
    private String name;

    //---------Constructors-------------------
    public Warrior( String name ) {
	this.name = name;
	health = 125;
        strength = 100;
	defense = 40;
	atkRating = 0.4;
    }

    //---------Methods------------------------
    //checks if warrior has died yet
    //returns name of warrior
    public String getName() {
	return name;
    }
    //increases atkRating and lowers defense if you do a special attack
    public void specialize() {
	defense -= 20;
	atkRating += .2;
    }
    //returns stats back to noraml if you dont do a special attack
    public void normalize() {
	defense = 40;
	atkRating = 0.4;
    }
}
	
