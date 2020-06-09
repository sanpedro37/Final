package com.qjy.Sense;

import com.qjy.Character.EllariaSand;
import com.qjy.Character.Player;
import com.qjy.Weapon.ValeriaSteelSword;

import java.util.Scanner;

/**
 * @description:多恩
 * @author: QuJingYi
 * @date:
 * @version:
 * @modified By:
 */
public class Donne extends Place{
    private EllariaSand ellariaSand=new EllariaSand();
    private Player player=new Player();
    private ValeriaSteelSword valeriaSteelSword=new ValeriaSteelSword();

    public void initEllariaSand(){
        ellariaSand.setAttackValue(150);
        ellariaSand.setHp(50);
        ellariaSand.setId(5);
        ellariaSand.setName("沙蛇母亲-艾拉利亚·沙德");
    }
    public void initDonne(){
        Donne donne=new Donne();
        donne.setId(1);
        donne.setName("多恩");
        initEllariaSand();
        System.out.println("维斯特洛大陆七大家族的马泰尔家族是最南边的多恩国的掌权者，\n" +
                "和维斯洛特的其他六国不同，伊耿·坦格利安和他的巨龙并未征服多恩。\n" +
                "然而，瑟曦关押了沙蛇三女儿后，沙蛇母亲-艾拉利亚·沙德想要为自己的女儿报仇。\n" +
                "但沙蛇母亲并不相信与瑟曦一样同样是兰尼斯特人的小恶魔-提里昂·兰尼斯特\n" +
                "多恩与君临的距离并不是很远，担心多恩的人趁乱出手，小恶魔劝你早日除掉被仇恨蒙蔽双眼的沙蛇之母。\n" +
                "果然，沙蛇母亲在一天夜里闯进你的军营，想暗杀小恶魔。\n" +
                "为了救小恶魔，你与沙蛇母亲的战斗开始了。（提示：沙蛇母亲擅长用毒，肉搏并不是她的优势。）\n");
        displayHP();
        System.out.println("按1使用瓦雷利亚钢剑攻击沙蛇母亲，其他键退出程序");
        initValeriaSteelSword();
        Scanner scan =new Scanner(System.in);
        String instruction=scan.nextLine();
        if (instruction.equals("1")){
            valeriaSteelSword.attack(ellariaSand);
            displayHP();
            System.out.println("沙蛇母亲已死，一切似乎都已经为君临之行做好准备。");
            System.out.println("================================================================================");
        }else{
            System.exit(0);
        }
    }
    private void displayHP(){
        System.out.println("雪诺HP:"+player.getHp());
        System.out.println("荆棘女王HP:"+ellariaSand.getHp());
    }
    public void initValeriaSteelSword(){
        valeriaSteelSword.setWeaponId(1);
        valeriaSteelSword.setResistDamage(30);
        valeriaSteelSword.setAdditionalDamage(60);
        valeriaSteelSword.setWeaponName("瓦雷利亚钢剑");
    }
}
