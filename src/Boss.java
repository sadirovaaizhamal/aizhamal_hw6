public class Boss extends GameEntity {
    Weapon weapon=new Weapon();

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }
    public String info() {

        return "name: "+getName()+" health:  "+getHealth()+ " damage: " +getDamage() +" weapon: "
                + weapon.getWeaponType()+"   "+weapon.getKnife();
    }
}
