package com.qjy.Character;

import com.qjy.Iinterface;

/**
 * @description:
 * @author: QuJingYi
 * @date:
 * @version:
 * @modified By:
 */
public class Player implements Iinterface {
    static int Hp=1000; //静态的变量不能被释放，由于建立的Player和Sense是不同的线程，如果HP被释放，那么在不同的Sense中HP被加载出来时都会是原来的值1000
    //因为static不能使用this和super所以只在Player的HP里面用了static
    protected String WeaponName="瓦雷利亚钢剑";
    protected String name="雪诺";

    public String getName() {
        return name;
    }

    public int getHp() {
        return Hp;
    }

    public void setHp(int hp) {
        Hp = hp;
    }

    public String getWeaponName() {
        return WeaponName;
    }

}
