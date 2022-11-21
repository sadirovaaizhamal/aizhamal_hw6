public final class Weapon {
    private String knife;
    private WeaponType weaponType;

    public String getKnife() {
        return knife;
    }

    public WeaponType getWeaponType() {
        return weaponType;
    }

    public void setWeaponType(WeaponType weaponType) {
        this.weaponType = weaponType;
    }

    public void setKnife(String knife) {
        this.knife = knife;
    }
}