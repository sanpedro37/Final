package com.qjy.Sense;

import com.qjy.Character.Player;
import com.qjy.Character.ThornsQueen;
import com.qjy.Weapon.ValeriaSteelSword;

import java.util.Scanner;

/**
 * @description:高庭
 * @author: QuJingYi
 * @date:
 * @version:
 * @modified By:
 */
public class Highgarden extends Place{
    private Player player=new Player();
    private ThornsQueen thornsQueen=new ThornsQueen();
    private ValeriaSteelSword valeriaSteelSword=new ValeriaSteelSword();

    public void initValeriaSteelSword(){
        valeriaSteelSword.setWeaponId(1);
        valeriaSteelSword.setResistDamage(30);
        valeriaSteelSword.setAdditionalDamage(60);
        valeriaSteelSword.setWeaponName("瓦雷利亚钢剑");
    }

    public  void initThornsQueen(){
        ThornsQueen thornsQueen=new ThornsQueen();
        thornsQueen.setAttackValue(100);
        thornsQueen.setHp(50);
        thornsQueen.setId(4);
        thornsQueen.setName("荆棘女王-奥莲娜·雷德温");
    }
    public void initHighgarden(){
        Highgarden highgarden=new Highgarden();
        highgarden.setId(1);
        highgarden.setName("高庭");
        initThornsQueen();
        System.out.println("根据小指头招供的消息，色后-瑟曦·兰尼斯特在君临城外早已布好了天罗地网\n" +
                "这样一来，就算是借到了鹰巢城的势力也没办法在短时间内解决掉瑟曦的势力。\n" +
                "为了拖住时间，你决定绕道而行，从高庭绕回君临城南面攻打瑟曦，以提利尔家族的荆棘女王-奥莲娜·雷德温为人质，\n" +
                "这样一来，君临城内，小玫瑰为了救外祖母，必然会与你联合起来浇灭瑟曦的力量。\n" +
                "为了拿下荆棘女王，一场小规模的战争又开始了。\n");
        displayHP();
        System.out.println("按1开始使用瓦雷利亚钢剑战斗,按其他键退出程序");
        initValeriaSteelSword();
        Scanner scan=new Scanner(System.in);
        String instruction=scan.nextLine();
        if (instruction.equals("1")){
            valeriaSteelSword.attack(thornsQueen);
            displayHP();
            System.out.println("以荆棘女王为人质，小玫瑰在君临城内与你里应外合，你躲开了君临城外的埋伏。");
            System.out.println("================================================================================");
        }else{
            System.exit(0);
        }
    }

    private void displayHP(){
        System.out.println("雪诺HP:"+player.getHp());
        System.out.println("荆棘女王HP:"+thornsQueen.getHp());
    }
}
