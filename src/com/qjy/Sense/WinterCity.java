package com.qjy.Sense;
import com.qjy.Character.Peeling;
import java.util.Scanner;

import com.qjy.Character.Player;
import com.qjy.Weapon.ValeriaSteelSword;

/**
 * @description:临冬城
 * @author: QuJingYi
 * @date:
 * @version:
 * @modified By:
 */
public class WinterCity extends Place{

    private ValeriaSteelSword valeriaSteelSword=new ValeriaSteelSword();
    private Player player=new Player();
    private Peeling peeling=new Peeling();

    public void initWinterCity(){
        WinterCity winterCity=new WinterCity();
        winterCity.setId(1);
        winterCity.setName("北境-临冬城");
        System.out.println("你好，雪诺。现在你在"+winterCity.getName()+
                ",\n曾经属于史塔克家族的北境已经被小剥皮-拉姆斯·波顿占领，\n" +
                "你需要找到妹妹珊莎-史塔克，联合将其击败。\n" +
                "（A.寻找珊莎-史塔克,B.按其他键不寻找.）");
        initPeeling();
        System.out.println("雪诺HP:"+player.getHp()+"\n小剥皮HP:"+peeling.getHp());
        Scanner scan=new Scanner(System.in);
        String instruction=scan.nextLine();
        if (instruction.equals("A")){
            System.out.println("你已经找到了珊莎,\n"+
            "珊莎紧紧拥抱了你，你和珊莎联合起来密谋一场，杀死了小剥皮。\n" +
                    "Winter is coming.夜王的力量不断壮大，长城境外的夜鬼骚扰野人村庄，野人向南逃的途中不断骚扰周围的村庄。\n" +
                    "夜鬼的力量不容小觑，是时候继续北上了……");
            peeling.setHp(0);
            System.out.println("雪诺HP:"+player.getHp()+"\n小剥皮HP:"+peeling.getHp());
            System.out.println("================================================================================");
        }else{
            player.setHp(player.getHp()-100);
            System.out.println("你没有及时与珊莎团聚，珊莎在临冬城被小剥皮害死了。\n" +
                    "珊莎的死给你带来了巨大的打击，你因此大病一场。" +
                    "（主角HP-100）\n" +
                    "临冬城之战开始：\n" +
                    "================================================================================");
            System.out.println("小剥皮HP："+peeling.getHp());
            System.out.println("雪诺HP:"+player.getHp());
            System.out.println("1.使用瓦雷利亚钢剑攻击小剥皮。");
            Scanner scan1=new Scanner(System.in);
            String instruction1=scan1.nextLine();
            if (instruction1.equals("1")){
                initValeriaSteelSword();
                System.out.println(player.getName()+"使用 "+player.getWeaponName()+" 攻击了"+peeling.getName()+" 造成了"+valeriaSteelSword.getAdditionalDamage()+" 点伤害");
                valeriaSteelSword.attack(peeling);
                System.out.println("小剥皮HP:"+peeling.getHp()+"\n雪诺Hp："+player.getHp());
                System.out.println(peeling.getName()+"命令从铁群岛带来的士兵攻击"+player.getName()+"\n(按1使用瓦雷利亚钢剑闪避)");
                Scanner scan2=new Scanner(System.in);
                String instruction2=scan2.nextLine();
                if (instruction2.equals("1")){
                    System.out.println("小剥皮对雪诺造成"+valeriaSteelSword.resist(peeling,valeriaSteelSword)+"点伤害。");
                    player.setHp(player.getHp()-valeriaSteelSword.resist(peeling,valeriaSteelSword));
                    System.out.println("雪诺HP:"+player.getHp()+"\n小剥皮HP:"+peeling.getHp()+"\n1.使用瓦雷利亚钢攻击");
                    Scanner scan3=new Scanner(System.in);
                    String instruction3=scan3.nextLine();
                    if (instruction3.equals("1")){
                        peeling.setHp(peeling.getHp()-valeriaSteelSword.getAdditionalDamage());
                        System.out.println("雪诺HP:"+player.getHp()+"\n小剥皮HP:"+peeling.getHp());
                        System.out.println("雪诺使用瓦雷利亚钢击杀了小剥皮。\n" +
                                "Valar Morghulis.临冬城之战以胜利告终。\n" +
                                "Winter is coming.夜王的力量不断壮大，长城境外的夜鬼骚扰野人村庄，野人向南逃的途中不断骚扰周围的村庄。\n" +
                                "夜鬼的力量不容小觑，是时候继续北上了……");
                        System.out.println("================================================================================");
                    }
                }
            }
        }

    }
    public void initPeeling(){
        peeling.setName("小剥皮-拉姆斯·波顿");
        peeling.setId(1);
        peeling.setAttackValue(200);
        peeling.setHp(100);
    }
    public void initValeriaSteelSword(){
        valeriaSteelSword.setWeaponId(1);
        valeriaSteelSword.setResistDamage(30);
        valeriaSteelSword.setAdditionalDamage(60);
        valeriaSteelSword.setWeaponName("瓦雷利亚钢剑");
    }
}
