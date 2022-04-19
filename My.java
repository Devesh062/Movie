import java.util.*;

public class My {
    static List<List<String>> TollyWood = Arrays.asList(
            Arrays.asList("Pushpa", "2021", "South Indian", "Action", "17th Dec"),
            Arrays.asList("Tadap", "2021", "South Indian", "Romance", "3rd Dec"),
            Arrays.asList("V", "2020", "South Indian", "Action", "5th Sept"),
            Arrays.asList("Love Story", "2021", "South Indian", "Drama", "24th", "Sept"),
            Arrays.asList("Bheeshma", "2022", "South Indian", "Romantic-Comedy", "3rd March"));

    static List<List<String>> BollyWood = Arrays.asList(
            Arrays.asList("Bhuj", "2021", "Hindi", "Historical", "13th Aug"),
            Arrays.asList("SherShaah", "2021", "Hindi", "Historical", "12th Aug"),
            Arrays.asList("Chhichhore", "2019", "Hindi", "Drama", "6th Sept"),
            Arrays.asList("Shiddat", "2021", "Hindi", "Drama", "1st Oct"),
            Arrays.asList("Article 15", "2019", "Hindi", "Drama", "28th June"));

    static List<List<String>> HollyWood = Arrays.asList(
            Arrays.asList("Dune", "2021", "English", "Fiction", "22nd Oct"),
            Arrays.asList("Eternals", "2021", "English", "Marvel", "5th Nov"),
            Arrays.asList("The Exorcist", "1973", "English", "Horror-Thriller", "26th Dec"),
            Arrays.asList("Deep Water", "2022", "English", "Drama", "18th Mar"),
            Arrays.asList("Joker", "2019", "English", "Drama-Crime", "2nd Oct"));

    static String tf = "";

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String s;
        int a = (int) Math.random() * 100;
        if (a % 2 == 0)
            tf = "True";
        else
            tf = "False";
        String c = "";

        System.out.println("Select what type of movie you want to watch");
        System.out.println(" TollyWood \n BollyWood \n HollyWood \n All");
        c = sc.nextLine();
        while (!c.equals("Exit")) {
            if (c.equals("All"))
                All();
            else
                Choice(c);

            System.out.println("Do you want to continue? Y/N");
            s = sc.nextLine();
            if (s.equals("Y")) {
                System.out.println("Select what type of movie you want to watch");
                System.out.println(" TollyWood \n BollyWood \n HollyWood \n All");
                c = sc.nextLine();
            } else
                c = "Exit";
        }
        sc.close();
    }

    public static void All() {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.println(TollyWood.get(i) + "\n" + HollyWood.get(i) + "\n" + BollyWood.get(i));
        }
        System.out.println("Enter your choice");
        String n = sc.nextLine();
        // for (int i = 0; i < 5; i++) {
        if (TollyWood.contains(n)) {
            System.out.println("Food for you is : Dosa");
            System.out.println("Is this movie a blockbuster? :" + tf);
        } else if (BollyWood.contains(n)) {
            System.out.println("Food for you is : Dal Makhani");
            System.out.println("Is this movie a blockbuster? :" + tf);
        } else if (HollyWood.contains(n)) {
            System.out.println("Food for you is : Pepper Steak");
            System.out.println("Is this movie a blockbuster? :" + tf);
        } else
            System.out.println("Wrong Choice");
        sc.close();
    }

    public static void Choice(String a) {
        Scanner sc = new Scanner(System.in);
        if (a.equals("TollyWood")) {
            for (int i = 0; i < 5; i++) {
                System.out.println(TollyWood.get(i));
            }
            System.out.println("Enter Your Choice");
            String ss = sc.nextLine();
            System.out.println("Food for you is : Dosa");
            System.out.println("Is this movie a blockbuster? :" + tf);
        } else if (a.equals("BollyWood")) {
            for (int i = 0; i < 5; i++) {
                System.out.println(BollyWood.get(i));
            }
            System.out.println("Enter Your Choice");
            String s = sc.nextLine();
            System.out.println("Food for you is : Dal Makhani");
            System.out.println("Is this movie a blockbuster? :" + tf);
        } else if (a.equals("HollyWood")) {
            for (int i = 0; i < 5; i++) {
                System.out.println(HollyWood.get(i));
            }
            System.out.println("Enter Your Choice");
            String s = sc.nextLine();
            System.out.println("Food for you is : Pepper Steak");
            System.out.println("Is this movie a blockbuster? :" + tf);
        }
        sc.close();
    }
}