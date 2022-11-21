public class Sceloton extends Boss{
    private int arrows;

    public int getArrows() {
        return arrows;
    }

    public void setArrows(int arrows) {
        this.arrows = arrows;
    }
    public String info (){
       return "name: "+getName()+" health:  "+getHealth()+ " damage: " +getDamage() +" weapon: "
               + weapon.getWeaponType()+"   "+weapon.getKnife()+" arrows: "+getArrows();

    }
}
