package com.qjy.Weapon;

import com.qjy.Character.Enemy;

/**
 * @description:瓦雷利亚钢剑
 * @author: QuJingYi
 * @date:
 * @version:
 * @modified By:
 */
public class ValeriaSteelSword extends Weapon{

    @Override
    public void attack(Enemy enemy) {
        enemy.setHp(enemy.getHp()-this.getAdditionalDamage());
        System.out.println("雪诺使用瓦雷利亚钢剑对"+enemy.getName()+"造成了60点伤害");
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
