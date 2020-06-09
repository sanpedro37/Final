package com.qjy.Weapon;

import com.qjy.Character.Enemy;

/**
 * @description:龙晶
 * @author: QuJingYi
 * @date:
 * @version:
 * @modified By:
 */
public class Obsidian extends Weapon{

    @Override
    public void attack(Enemy enemy) {
        enemy.setHp(enemy.getHp()-this.getAdditionalDamage());
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
