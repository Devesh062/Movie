import java.util.*;

enum TollyWood {
    PUSHPA("Pushpa", "2021", "South Indian", "Action", "17th Dec"),
    TADAP("Tadap", "2021", "South Indian", "Romance", "3rd Dec"),
    V("V", "2020", "South Indian", "Action", "5th Sept"),
    LOVE_STORY("Love Story", "2021", "South Indian", "Drama", "24th Sept");

    String name, year, Lang, Genre, RD;

    TollyWood(String n, String y, String l, String g, String r) {
        name = n;
        year = y;
        Lang = l;
        Genre = g;
        RD = r;
    }
}

enum BollyWood {
    BHUJ("Bhuj", "2021", "Hindi", "Historical", "13th Aug"),
    SHERSHAAH("SherShaah", "2021", "Hindi", "Historical", "12th Aug"),
    CHHICHHORE("Chhichhore", "2019", "Hindi", "Drama", "6th Sept"),
    SHIDDAT("Shiddat", "2021", "Hindi", "Drama", "1st Oct");

    String name, year, Lang, Genre, RD;

    BollyWood(String n, String y, String l, String g, String r) {
        name = n;
        year = y;
        Lang = l;
        Genre = g;
        RD = r;
    }
}

enum HollyWood {
    DUNE("Dune", "2021", "English", "Fiction", "22nd Oct"),
    ETERNALS("Eternals", "2021", "English", "Marvel", "5th Nov"),
    THE_EXORCIST("The Exorcist", "1973", "English", "Horror-Thriller", "26th Dec"),
    DEEP_WATER("Deep Water", "2022", "English", "Drama", "18th Mar");

    String name, year, Lang, Genre, RD;

    HollyWood(String n, String y, String l, String g, String r) {
        name = n;
        year = y;
        Lang = l;
        Genre = g;
        RD = r;
    }
}

abstract class N {
    public abstract String getFood();

    public String toString() {
        return ("You will get " + this.getFood());
    }
}

class TW extends N {
    public String getFood() {
        return ("Dosa");
    }
}

class BW extends N {
    public String getFood() {
        return ("Dal Makhani");
    }
}

class HW extends N {
    public String getFood() {
        return ("Pepper Steak");
    }
}

public class New {
    static String tf;
    static int flag = 0;

    public static void main(String args[]) {
        int a = (int) Math.random() * 100;
        if (a % 2 == 0)
            tf = "True";
        else
            tf = "False";

        Scanner sc = new Scanner(System.in);
        System.out.println("What type of Movie do you want to watch?");
        System.out.println(" TollyWood \n BollyWood \n HollyWood \n All");
        String c = sc.nextLine();
        while (!c.equals("EXIT")) {
            if (c.equals("All"))
                All();
            else
                Choice(c);
            if (flag == 1)
                System.out.println("is the movie blockbuster? : " + tf);
        }
        sc.close();
    }

    public static void All() {
        Scanner sc = new Scanner(System.in);
        Arrays.asList(TollyWood.values()).forEach(season -> System.out.println(season));
        Arrays.asList(BollyWood.values()).forEach(season -> System.out.println(season));
        Arrays.asList(HollyWood.values()).forEach(season -> System.out.println(season));
        System.out.println("Enter your choice");
        String c = sc.nextLine();
        int f = 0;
        flag = 1;
        if (f == 0) {
            for (TollyWood t : TollyWood.values()) {
                if (t.name().equals(c)) {
                    N m = new TW();
                    System.out.println(m);
                    f = 1;
                    break;
                }
            }
        } else if (f == 0) {
            for (BollyWood t : BollyWood.values()) {
                if (t.name().equals(c)) {
                    N m = new BW();
                    System.out.println(m);
                    f = 1;
                    break;
                }
            }
        } else if (f == 0) {
            for (HollyWood t : HollyWood.values()) {
                if (t.name().equals(c)) {
                    N m = new HW();
                    System.out.println(m);
                    f = 1;
                    break;
                }
            }
        } else {
            flag = 0;
            System.out.println("Wrong Choice");
        }
        sc.close();
    }

    public static void Choice(String s) {
        flag = 1;
        String c;
        Scanner sc = new Scanner(System.in);
        s.toUpperCase();
        switch (s) {
            case "TOLLYWOOD":
                Arrays.asList(TollyWood.values()).forEach(season -> System.out.println(season));
                System.out.println("Enter your choice");
                c = sc.nextLine();
                N m = new TW();
                System.out.println(m);
                break;
            case "BOLLYWOOD":
                Arrays.asList(BollyWood.values()).forEach(season -> System.out.println(season));
                System.out.println("Enter your choice");
                c = sc.nextLine();
                N mm = new BW();
                System.out.println(mm);
                break;
            case "HOLLYWOOD":
                Arrays.asList(HollyWood.values()).forEach(season -> System.out.println(season));
                System.out.println("Enter your choice");
                c = sc.nextLine();
                N mmM = new HW();
                System.out.println(mmM);
                break;
            default:
                flag = 0;
                System.out.println("Wrong choice");
        }
        sc.close();
    }
}