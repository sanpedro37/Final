package com.qjy;

import com.qjy.Sense.*;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("欢迎来到维斯特洛大陆。");
        System.out.println("================================================================================");
        WinterCity winterCity=new WinterCity();
        winterCity.initWinterCity();
        keep();
        TheWall theWall=new TheWall();
        theWall.initTheWall();
        keep();
        Eyrie eyrie=new Eyrie();
        eyrie.initEyrie();
        keep();
        Highgarden highgarden=new Highgarden();
        highgarden.initHighgarden();
        keep();
        Donne donne=new Donne();
        donne.initDonne();
        keep();
        KingsLanding kingsLanding=new KingsLanding();
        kingsLanding.initKingsLanding();
    }
    public static void keep(){
        System.out.println("按1继续,按其他键终止游戏。");
        Scanner scan=new Scanner(System.in);
        String instruction=scan.nextLine();
        if (!instruction.equals("1")){
            System.exit(0);
        }else {
            System.out.println("================================================================================");
        }
    }
}
