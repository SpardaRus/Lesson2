class GunV2 {
    // Хотим, чтобы все наши пушки были золотого цвета
    private String color = "Gold";
    private String name = "Desert Eagle";
    private int patronsCountMax = 7;
    private int patronsCountNow = 7;

    public GunV2() {
    }

    public GunV2(String name, int patronsCountMax) {
        this.name = name;
        this.patronsCountMax = patronsCountMax;
        this.patronsCountNow = patronsCountMax;
    }

    private String shot() {
        if (patronsCountNow > 0) {
            --patronsCountNow;
            return "Shot ";
        } else {
            return "Gun click ";
        }
    }

    public void bankShot() {
        System.out.println(shot() + "for bank. " + getStatisticMyGun());
    }

    public void zombieShot() {
        System.out.println(shot() + "for zombie. " + getStatisticMyGun());
    }

    public String getStatisticMyGun() {
        return "In gun " + color + " " + name + ", " +
                patronsCountNow + " patrons, from: " + patronsCountMax;
    }

    public void reload() {
        patronsCountNow = patronsCountMax;
        System.out.println("Gun is reload. " + getStatisticMyGun());
    }
}
