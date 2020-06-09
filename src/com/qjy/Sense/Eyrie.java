package com.qjy.Sense;

import com.qjy.Character.LysaTully;
import com.qjy.Character.Player;
import com.qjy.Weapon.ValeriaSteelSword;

import java.util.Scanner;

/**
 * @description:鹰巢城
 * @author: QuJingYi
 * @date:
 * @version:
 * @modified By:
 */
public class Eyrie extends Place{
    private LysaTully lysaTully=new LysaTully();
    private Player player=new Player();
    private ValeriaSteelSword valeriaSteelSword=new ValeriaSteelSword();

    public void initValeriaSteelSword(){
        valeriaSteelSword.setWeaponId(1);
        valeriaSteelSword.setResistDamage(30);
        valeriaSteelSword.setAdditionalDamage(60);
        valeriaSteelSword.setWeaponName("瓦雷利亚钢剑");
    }

    public void initLysaTully(){
        lysaTully.setHp(100);
        lysaTully.setAttackValue(100);
        lysaTully.setName("姨妈-莱莎徒利");
        lysaTully.setId(3);
    }

    private void displayHP(){
        System.out.println("雪诺HP："+player.getHp());
        System.out.println("姨妈HP:"+lysaTully.getHp());
    }

    public void initEyrie(){
        Eyrie eyrie=new Eyrie();
        eyrie.setId(1);
        eyrie.setName("鹰巢城");
        initLysaTully();
        System.out.println("人鬼大战之后，由于君临的瑟曦想要一统维斯特洛大陆\n" +
                "为了铲除瑟曦的力量，布兰提出到鹰巢城去找姨妈-莱莎徒莉搬救兵\n一路南下，你来到了鹰巢城。\n" +
                "小指头-培提尔·贝里席经瑟曦授意，想借接回珊莎回君临做乔大帝-乔佛里·拜拉席恩的皇后之名除掉她.\n" +
                "多疑的姨妈将小指头想接回珊莎的行为误会成小指头对珊莎的爱，\n" +
                "嫉妒心作祟，姨妈非但没有答应借兵，还借用她在鹰巢城的势力对你们进行追杀。\n" +
                "（按1开始战斗。其他键退出游戏）");
        initValeriaSteelSword();
        Scanner scan3=new Scanner(System.in);
        String instruction3= scan3.nextLine();
        if (instruction3.equals("1")){
            displayHP();
            valeriaSteelSword.attack(lysaTully);
            displayHP();
            System.out.println("姨妈的追兵开始反击，按1使用瓦雷利亚钢剑防御。其他键退出游戏。");
            Scanner scan4=new Scanner(System.in);
            String instruction4=scan4.nextLine();
            if (instruction4.equals("1")){
                System.out.println("姨妈对雪诺造成"+valeriaSteelSword.resist(lysaTully,valeriaSteelSword)+"点伤害\n" );
                player.setHp(player.getHp()-70);
                displayHP();
                valeriaSteelSword.attack(lysaTully);
                displayHP();
                System.out.println("雪诺击败了姨妈，鹰巢城之战胜利。");
                System.out.println("================================================================================");
            }else{
                System.exit(0);
            }
        }else{
            System.exit(0);
        }
    }
}
