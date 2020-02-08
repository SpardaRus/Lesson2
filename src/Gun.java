class Gun {

    String color = "Gold";
    String name = "Desert Eagle";
    int patronsCount = 7;

    String shot() {
        if (patronsCount > 0) {
            patronsCount = patronsCount - 1;
            return "Shot ";
        } else {
            return "Gun click ";
        }
    }

    void bankShot() {
        System.out.println(shot() + "for bank. In gun " + patronsCount + " patrons");
    }

    void zombieShot() {
        System.out.println(shot() + "for zombie. In gun " + patronsCount + " patrons");
    }

    void reload() {
        patronsCount = 7;
        System.out.println("My " + color + " " + name + " is reload. " +
                "In gun " + patronsCount + " patrons");
    }

}