package com.qjy.Weapon;

import com.qjy.Character.Enemy;

/**
 * @description:光明之火
 * @author: QuJingYi
 * @date:
 * @version:
 * @modified By:
 */
public class Torch extends Weapon{
    @Override
    public void attack(Enemy enemy) {
        //光明之火用作防御
    }

    @Override
    public int resist(Enemy enemy, Weapon weapon) {
        int damage=enemy.getAttackValue()-weapon.getResistDamage();
        if (damage<0){
            damage=0;
        }
        return damage;
    }
}
