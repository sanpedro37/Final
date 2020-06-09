package com.qjy.Character;

import com.qjy.Iinterface;
import com.qjy.Weapon.Weapon;

/**
 * @description:
 * @author: QuJingYi
 * @date:
 * @version:
 * @modified By:
 */
public abstract class  Enemy implements Iinterface {

    protected String name;
    protected int id;
    protected int Hp;
    protected int AttackValue;

    public void BeAttacked(Weapon weapon, Character player) {

    }

    public int getHp() {
        return Hp;
    }

    public void setHp(int hp) {
        Hp = hp;
    }

    public int getAttackValue() {
        return AttackValue;
    }

    public void setAttackValue(int attackValue) {
        AttackValue = attackValue;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
