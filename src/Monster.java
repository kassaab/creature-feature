public class Monster extends Creature{
    private String mode;

    public String getMode() {
        return mode;
    }

    public void setMode(String mode) {
        this.mode = mode;
    }

    public Monster(String creatureType, int hitPoints, int attackPoints, int gold, String mode) {
        super(creatureType, hitPoints, attackPoints, gold);
        this.mode = mode;
    }

    @Override
    public String toString() {
        String myReturn = this.getClassName();
        myReturn += " [mode=" + this.mode;
        myReturn += ", hitPoints=" + this.hitPoints;
        myReturn += ", attackPoints=" + this.attackPoints;
        myReturn += ", gold=" + this.gold;
        myReturn += ", alive=" + this.alive + "]";
        return myReturn;
    }//end toString()

}//end Monster

