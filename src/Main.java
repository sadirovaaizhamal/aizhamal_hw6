public class Main {
    public static void main(String[] args){
        Boss boss=new Boss();
        boss.setHealth(200);
        boss.setDamage(250);
        boss.setName("Heal");
        boss.weapon.setWeaponType(WeaponType.GUN);
        boss.weapon.setKnife("Ak47");
        System.out.println(boss.info());
        Sceloton sceloton=new Sceloton();
        sceloton.setArrows(20);
        sceloton.setHealth(200);
        sceloton.setDamage(250);
        sceloton.setName("Sceleton1");
        sceloton.weapon.setWeaponType(WeaponType.GUN);
        sceloton.weapon.setKnife("DIAEGL");
        System.out.println(sceloton.info());
        Sceloton sceloton2=new Sceloton();
        sceloton2.setArrows(20);
        sceloton2.setHealth(200);
        sceloton2.setDamage(250);
        sceloton2.setName("sceloton2");
        sceloton2.weapon.setWeaponType(WeaponType.BOMB);
        sceloton2.weapon.setKnife("DIAEGL");
        System.out.println(sceloton2.info());
    }
}