package com.qjy.Weapon;

import com.qjy.Character.Enemy;

/**
 * @description:
 * @author: QuJingYi
 * @date:
 * @version:
 * @modified By:
 */
public class Dracarys extends Weapon {

    @Override
    public void attack(Enemy enemy) {
        enemy.setHp(enemy.getHp()-this.getAdditionalDamage());
        System.out.println("丹妮莉丝使用瓦雷利亚钢剑对"+enemy.getName()+"造成了60点伤害");
    }

    @Override
    public int resist(Enemy enemy, Weapon weapon) {
        return 0;
    }

}
