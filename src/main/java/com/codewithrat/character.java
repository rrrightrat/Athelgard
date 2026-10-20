/** character class */
//package declaration
package com.codewithrat;

//character class declaration
public class character {
    // maxHP variable
    protected int maxHp;

    // Setter for max hp
    public void setMaxHp(int maxHp) {
        this.maxHp = maxHp;
    }

    // getter for max hp
    public int getMaxHp() {
        return maxHp;
    }

    // Name string
    protected final String name;

    // getter for name
    protected String getName() {
        return name;
    }

    // hp variable
    protected int hp;

    // setter for hp
    public void setHp(int hp) {
        this.hp = hp;
    }

    // getter for hp
    protected int getHp() {
        return hp;
    }

    // character constructer
    public character(String name, int hp, int maxHp) {
        this.name = name;
        this.hp = hp;
        this.maxHp = maxHp;
    }

    // take damagr method
    protected void takeDamage(int am) {
        this.hp -= am;
        if (this.hp < 0) {
            this.hp = 0;
        }
    }

    // heal method
    protected void heal(int am) {
        this.hp += am;
        if (this.hp > this.maxHp) {
            this.hp = this.maxHp;
        }
    }
}