import Hierarchy.*;

public class Main {
    public static void space () {
        System.out.println("______________________________________________________________");
    }
    public static void main(String[] args) {
        Train lastochka = new Train("Ласточка", "В-901", 2011, "Россия", "серый", 301, 3500, 3, "Белорусский вокзал", "Минск-Пассажирский", 11);
        Train leningrad = new Train("Ленинград", "D-125", 2019, "Россия", "серый", 270, 1700, 3, "Ленинградский вокзал", "Ленинград-Пассажирский", 8);

        System.out.println(lastochka);
        System.out.println(leningrad);

        lastochka.refill();
        leningrad.refill();

        space();

        Bus ikarus = new Bus("Икарус", "55", 1966, "Россия", "синий", 150);
        Bus GAZel = new Bus("Газель", "Next", 2021, "Россия", "белый", 170);
        Bus PAZ = new Bus("Паз", "32053", 2016, "Россия", "белый", 228);

        GAZel.setColor("черний");

        System.out.println(ikarus);
        System.out.println(GAZel);
        System.out.println(PAZ);

        ikarus.refill();
        GAZel.refill();
        PAZ.refill();

        space();
        space();

        Herbivores gazel = new Herbivores("Газель", 12, "Лесные поля", 50, "Травка");
        Herbivores jiraf = new Herbivores("Жираф", 9, "Саванна", 30, "Травка/листочки");
        Herbivores horse = new Herbivores("Лошадь", 4, "Обширные поля", 60, "Травка/сено");
        System.out.println(gazel);
        System.out.println(jiraf);
        System.out.println(horse);
        space();
        Predators giena = new Predators("Гиена", 8, "Саванна", 60, "Падаль/мясо");
        Predators bearBeer = new Predators("Медведь(пиво)", 30, "Тайга", 60, "Рыба/ягоды");
        Predators tiger = new Predators("Тигран", 15, "Тайга", 70, "Мясо");
        System.out.println(giena);
        System.out.println(bearBeer);
        System.out.println(tiger);
        space();
        Amphibian frog = new Amphibian("Легущка", 4, "Болото");
        Amphibian yujPresnovodniy = new Amphibian("Уж Пренсоводный", 3, "Пресная вода");
        System.out.println(frog);
        System.out.println(yujPresnovodniy);
        space();
        Flightless pavlin = new Flightless("Павлин", 5, "где-то там", "Ходьба");
        Flightless penguin = new Flightless("Пингвин", 7, "Севернгый полюс", "Ходьба/плаванье");
        Flightless dodoPtitsa = new Flightless("Птица(пицца) додо", 7, "На ленина где-то двухэтажка", "Ходьба/На машине доставка");
        System.out.println(pavlin);
        System.out.println(penguin);
        System.out.println(dodoPtitsa);
        space();
        Flying chaika = new Flying("Чайка", 4, "Берега островов", "Полет");
        Flying albatros = new Flying("Альбатрос", 9, "Берега островов", "Полет");
        Flying sokol = new Flying("Сокол", 8, "Степь", "Полет");
        System.out.println(chaika);
        System.out.println(albatros);
        System.out.println(sokol);

    }
}