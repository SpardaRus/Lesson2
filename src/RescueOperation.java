
public class RescueOperation {
    public static void main(String[] args) {
        training();
        runOperation();
    }

    private static void training() {
    /*Создали пистолет
     и тренируемся по банкам*/
        Gun gun = new Gun();
        gun.bankShot();
        gun.bankShot();
        gun.bankShot();
        gun.bankShot();

        //Пока ты отвернулся Отец пострелял
        gun.shot();
        gun.shot();
        gun.shot();

        //Подошел зомби  и стреляем по нему
        gun.zombieShot();

        //Отец хотел зарядить тебе пушку, но рассыпал патроны
        gun.patronsCount = 0;

        //Патроны кончились, перезаряжаем и устраняем зомби
        gun.reload();
        gun.zombieShot();
    }

    private static void runOperation() {
        //Подготовка к операции
        GunV2 pistol = new GunV2();
        GunV2 shotgun = new GunV2("Winchester", 4);

        //Проверили оружие
        System.out.println(pistol.getStatisticMyGun());
        System.out.println(shotgun.getStatisticMyGun());

        //Привлекаем зомби
        pistol.bankShot();
        pistol.bankShot();
        pistol.bankShot();

        //Уничтожаем зомби
        pistol.zombieShot();
        pistol.zombieShot();
        pistol.zombieShot();
        pistol.zombieShot();
        //Зомби подошел слишком быстро
        shotgun.zombieShot();

        //Подошел огромный босс
        shotgun.zombieShot();
        shotgun.zombieShot();
        shotgun.zombieShot();
        shotgun.zombieShot();
        pistol.reload();
        //Контрольный в голову
        pistol.zombieShot();
    }
}
