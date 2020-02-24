package model;

import java.util.List;

public class Main {

    public static void main(String[] args) {


    }
}
//        ClubManager clubManager = new ClubManager();
//        clubManager.add(new IceSkates("IceSkates", 300,"North","Ukraine",
//                "Leather",Purpose.UNIVERSAL,1, 35));
//        clubManager.add(new IceSkates("IceSkates", 300,"North","Ukraine",
//                "Leather",Purpose.GOALKEEPER,2, 39));
//        clubManager.add(new ProtectiveClothes("Helmet", 400,"North","Ukraine",
//                "Leather",Purpose.FIELDPLAYER, Level.MEDIUM));
//        clubManager.add(new ProtectiveClothes("Helmet", 350,"North","Ukraine",
//                "Leather",Purpose.GOALKEEPER, Level.HIGH));
//        clubManager.add(new HockeyPuck("HockeyPuck", 100,"Lion","Ukraine",
//                "Wood",Purpose.UNIVERSAL,3, 2));
//        clubManager.add(new HockeyPuck("HockeyPuck", 150,"Lion","Ukraine",
//                "Rubber",Purpose.UNIVERSAL,2, 1));
//        clubManager.add(new Uniform("Trousers", 1000,"Lemberg","Ukraine",
//                "Leather",Purpose.FIELDPLAYER,"High level clothes", Size.XXL));
//        clubManager.add(new Uniform("Sweater", 600,"Lemberg","Ukraine",
//                "Leather",Purpose.GOALKEEPER,"High level clothes", Size.L));
//        System.out.println(clubManager);
//
//
//        clubManager.sortByPrice(true);
//        System.out.println("\n"+"SORT BY PRICE INCREASE"+"\n" +clubManager);
//
//        clubManager.sortByPrice(false);
//        System.out.println("\n"+"SORT BY PRICE DECREASE"+"\n"+clubManager);
//
//
//        clubManager.sortByName(true);
//        System.out.println("\n"+"SORT BY NAME INCREASE"+"\n"+clubManager);
//
//        clubManager.sortByName(false);
//        System.out.println("\n"+"SORT BY NAME DECREASE"+"\n"+clubManager);
//
//
//        List<Good> goalkeepersGoods = clubManager.find(Purpose.GOALKEEPER);
//        System.out.println("GOODS FOR GOALKEEPERS");
//        for(Good g: goalkeepersGoods){
//            System.out.println(g);
//        }
//        if (goalkeepersGoods.isEmpty()){
//            System.out.println("Goalkeeper's goodses are empty");
//        }
//        System.out.println();
//        System.out.println("Goods with min price: ");
//        List<Good> minList = clubManager.findMinPrice(Purpose.GOALKEEPER);
//        for (Good g:minList) {
//            System.out.println(g);
//        }
//    }
//}
