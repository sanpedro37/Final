package com.qjy.Sense;

import com.qjy.Character.NightGhost;
import com.qjy.Character.Player;
import com.qjy.Weapon.Needle;
import com.qjy.Weapon.Obsidian;
import com.qjy.Weapon.Torch;

import java.util.Scanner;

/**
 * @description:绝境长城-人鬼大战
 * @author: QuJingYi
 * @date:
 * @version:
 * @modified By:
 */
public class TheWall extends Place{
    private Player player=new Player();
    private NightGhost nightGhost=new NightGhost();
    private Needle needle=new Needle();
    private Obsidian obsidian=new Obsidian();
    private Torch torch=new Torch();



    public void initNightGhost(){
        nightGhost.setHp(500);
        nightGhost.setId(2);
        nightGhost.setAttackValue(600);
        nightGhost.setName("夜鬼");
    }
    public void initNeedle(){
        needle.setAdditionalDamage(600);
        needle.setWeaponId(2);
    }
    public void initObsidian(){
        obsidian.setAdditionalDamage(90);
        obsidian.setWeaponId(3);
        obsidian.setResistDamage(10);
    }
    public void initTorch(){
        torch.setWeaponId(4);
        torch.setResistDamage(100);
        torch.setWeaponName("火把");
    }
    public void command(){
        System.out.println("按1指挥无垢者攻击东边的夜鬼");
        Scanner scan5=new Scanner(System.in);
        String instruction5=scan5.nextLine();
        if (instruction5.equals("1")){
            obsidian.attack(nightGhost);
            System.out.println("无垢者对夜鬼造成了90的伤害");
            System.out.println("夜鬼HP："+nightGhost.getHp());
        }
        System.out.println("按1指挥守夜人攻击西边的夜鬼");
        Scanner scan6=new Scanner(System.in);
        String instruction6=scan6.nextLine();
        if (instruction6.equals("1")){
            System.out.println("守夜人对夜鬼造成了90点伤害");
            obsidian.attack(nightGhost);
            System.out.println("夜鬼HP："+nightGhost.getHp());
        }
        System.out.println("按1指挥野人军队攻击北方的夜鬼");
        Scanner scan7=new Scanner(System.in);
        String instruction7=scan7.nextLine();
        if (instruction7.equals("1")){
            obsidian.attack(nightGhost);
            System.out.println("野人对夜鬼造成了90的伤害");
            System.out.println("夜鬼HP："+nightGhost.getHp());
        }
    }
    public void initTheWall(){
        TheWall theWall=new TheWall();
        theWall.setId(2);
        theWall.setName("绝境长城");
        initNightGhost();
        System.out.println("红发女巫梅丽珊卓已经用光明之王的力量休整了整个守夜人军团，你的HP已恢复为最大值。");
        player.setHp(1000);
        System.out.println("现在你在"+theWall.getName()+
                "\n与艾丽娅·史塔克汇合后，获得武器‘艾丽娅细剑’。" +
                "\n守夜人山姆发现龙晶可以完全杀死夜鬼，你派人前往龙石岛开采龙晶打造武器，获得了龙晶。\n" +
                "红发女巫梅丽珊卓借助光明之王红宝石的力量使守夜人军团点燃的火把不灭，获得了火把。\n" +
                "人鬼大战终于在这一天到来了。\n" +
                "(1.使用瓦雷利亚钢剑攻击夜鬼\t" +
                "2.使用艾莉亚的绣花针攻击夜王\t" +
                "3.使用龙晶攻击夜鬼");
        System.out.println("雪诺HP:"+player.getHp()+
        "\n夜鬼HP:"+nightGhost.getHp());
        Scanner scan4=new Scanner(System.in);
        String instruction4=scan4.nextLine();
        switch (instruction4){
            case "1":
                System.out.println("夜王能够让死掉的人变成夜鬼，瓦雷利亚钢之剑的伤害杀不完夜鬼更杀不死夜王。\n" +
                        "Valar Morghulis——凡人总有一死。" +
                        "\n游戏结束。" +
                        "\n================================================================================");
                System.exit(0);
                break;
            case "2":
                System.out.println("艾莉亚利用自己作为无面者在黑白院学到的知识，在最后关头偷袭了夜王。夜鬼没有了夜王的控制，在一瞬间变回了尸体。\n");
                initNeedle();
                needle.attack(nightGhost);
                System.out.println("艾莉亚帮助你使用艾莉亚细剑对夜鬼造成了"+needle.getAdditionalDamage()+"伤害");
                System.out.println("夜鬼HP:"+nightGhost.getHp()+"\n雪诺HP："+player.getHp());
                System.out.println("……\n人鬼大战终于结束了……\n" +
                        "================================================================================");
                System.out.println("红发女巫梅丽珊卓已经用光明之王的力量休整了整个守夜人军团，你的HP已恢复为最大值。"+
                        "但她脖子前的红宝石也随着法力施展变得暗淡，失去宝石的力量，梅丽珊卓牺牲了\n" +
                        "(雪诺的HP不再能够恢复为起始值。)");
                break;
            case "3":
                System.out.println("守夜人联合无垢者和野人的军队，在雪诺的指挥下与夜鬼厮杀。龙晶刺入夜鬼以后，夜鬼会变成冰碎一地。");
                initObsidian();
                command();
                System.out.println("夜鬼开始反击，按1使用火把暂时驱退夜鬼");
                Scanner scan8=new Scanner(System.in);
                String instruction8=scan8.nextLine();
                if (instruction8.equals("1")){
                    initTorch();
                    torch.resist(nightGhost,torch);
                    System.out.println("梅丽珊卓借用光明之王最后的力量点燃的火把抵御了夜鬼100点伤害\n" +
                            "但她脖子前的红宝石也随着法力施展变得暗淡，失去宝石的力量，梅丽珊卓牺牲了\n" +
                            "(雪诺的HP不再能够恢复为起始值。)");
                    player.setHp(player.getHp()-500);
                    System.out.println("战争继续……\n" +
                            "雪诺HP:"+player.getHp()+"\n夜鬼HP:"+nightGhost.getHp());
                }
                command();
                System.out.println("夜鬼被杀光了，人鬼大战在大家共同的努力下结束了……\n" +
                        "雪诺HP:"+player.getHp());
                System.out.println("================================================================================");
                break;
            default:
                break;
        }
    }

}

