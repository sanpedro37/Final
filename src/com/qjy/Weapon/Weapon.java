package com.qjy.Weapon;

import com.qjy.Character.Enemy;
import com.qjy.Iinterface;

/**
 * @description:
 * @author: QuJingYi
 * @date:
 * @version:
 * @modified By:
 */
public abstract class Weapon  implements Iinterface {
    protected int AdditionalDamage;//附加伤害值
    protected int WeaponId;
    protected int ResistDamage;//抵御伤害值
    protected String WeaponName;

    public String getWeaponName() {
        return WeaponName;
    }

    public void setWeaponName(String weaponName) {
        WeaponName = weaponName;
    }

    public abstract void attack(Enemy enemy);
    public abstract int resist(Enemy enemy, Weapon weapon);//抵挡后的伤害

    public Weapon() {
    }

    public Weapon(int additionalDamage, int weaponId) {
        AdditionalDamage = additionalDamage;
        WeaponId = weaponId;
    }

    public Weapon(int additionalDamage, int weaponId, int resistDamage) {
        AdditionalDamage = additionalDamage;
        WeaponId = weaponId;
        ResistDamage = resistDamage;
    }

    public int getAdditionalDamage() {
        return AdditionalDamage;
    }

    public void setAdditionalDamage(int additionalDamage) {
        AdditionalDamage = additionalDamage;
    }

    public int getWeaponId() {
        return WeaponId;
    }

    public void setWeaponId(int weaponId) {
        WeaponId = weaponId;
    }

    public int getResistDamage() {
        return ResistDamage;
    }

    public void setResistDamage(int resistDamage) {
        ResistDamage = resistDamage;
    }
}
