package com.qjy.Sense;

import com.qjy.Character.Cersei;
import com.qjy.Character.Player;
import com.qjy.Weapon.Dracarys;
import com.qjy.Weapon.ValeriaSteelSword;

import java.util.Scanner;

/**
 * @description:君临
 * @author: QuJingYi
 * @date:
 * @version:
 * @modified By:
 */
public class KingsLanding extends Place{
    private Cersei cersei=new Cersei();
    private Player player=new Player();
    private Dracarys dracarys=new Dracarys();

    public void initCersei(){
        cersei.setAttackValue(200);
        cersei.setHp(1000);
        cersei.setId(6);
        cersei.setName("色后-瑟曦·兰尼斯特");
    }
    public void initKingsLanding(){
        KingsLanding kingsLanding=new KingsLanding();
        kingsLanding.setId(3);
        kingsLanding.setName("君临");
        initCersei();
        System.out.println("解决掉了众多困难以后，你来到了君临城。\n" +
                "瑟曦为了示威，当着你的面让魔山杀掉了龙母的侍女弥桑黛和乔拉。\n" +
                "临死前，乔拉在丹妮莉丝的怀里说：“卡丽熙，我受伤了……\n" +
                "你将我驱逐过两次，我回来了两次。你说我救了你的命，所以你不能带我回去，也不能赶我走……\n" +
                "我全心所求便是侍奉你，提里昂说的没错，我爱你……”\n" +
                "你的亲妹妹，龙母-丹妮莉丝·塔格利安大怒，一声‘Dracarys’，带着她的最后一条龙卓耿屠杀了整个君临城。\n" +
                "为了救下瑟曦，弑君者-詹姆·兰尼斯特拼尽全力杀到你面前。\n" +
                "1.使用瓦雷利亚钢剑与弑君者决斗\t" +
                "2.使用龙焰杀掉弑君者和瑟曦\n" +
                "3.其他键退出程序");
        Scanner scan=new Scanner(System.in);
        String instruction=scan.nextLine();
        displayHP();
        switch (instruction){
            case "1":
                System.out.println("你与弑君者正在进行1v1的决斗\n" +
                        "由于弑君者曾经为了救布兰妮失去了右手所以处于劣势。\n" +
                        "小恶魔不忍心看着最爱自己的哥哥死去，用箭射死了你。");
                System.out.println("================================================================================");
                System.out.println("真王已死，游戏失败。");
                break;
            case "2":
                initDracarys();
                dracarys.attack(cersei);
                System.out.println("'Dracarys'\n" +
                        "丹妮莉丝骑着龙屠杀了整个君临城，无辜百姓也为瑟曦任性的行为惨死其中。\n" +
                        "丹妮莉丝的行为彻底激怒了民众，北境起头不愿将铁王座让给丹妮莉丝。\n" +
                        "维斯特洛大陆的游戏第九季，等你来战……");
                System.out.println("================================================================================");
                System.out.println("游戏结束。");
                break;
            default:
                System.exit(0);
                break;
        }
    }
    private void displayHP(){
        System.out.println("雪诺HP:"+player.getHp());
        System.out.println("荆棘女王HP:"+cersei.getHp());
    }

    public void initDracarys(){
        dracarys.setAdditionalDamage(500);
        dracarys.setResistDamage(100);
        dracarys.setWeaponId(5);
    }
}
