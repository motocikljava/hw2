public class Main {
    public static void main(String[] args) {
        var dog = 8.0;
        System.out.println(dog);
        var cat = 3.6;
        System.out.println(cat);
        var paper = 763789;
        System.out.println(paper);

        dog = dog + 4;
        System.out.println(dog);
        cat = cat + 4;
        System.out.println(cat);
        paper = paper + 4;
        System.out.println(paper);
        dog = dog - 3.5;
        System.out.println(dog);
        cat = cat - 1.6;
        System.out.println(cat);
        paper = paper - 7639;
        System.out.println(paper);
        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);

        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);

        var oneBoxer = 78.2;
        var twoBoxer = 82.7;
        var massaMujikov = oneBoxer + twoBoxer;
        System.out.println(massaMujikov + "кг");
        var raznicaMass = twoBoxer - oneBoxer;
        System.out.println(raznicaMass + "кг");
        var raznicaMass2 = twoBoxer % oneBoxer;
        System.out.println(raznicaMass2 + "кг");

        var allWorkingTime = 640;
        var workingTimeOnePeople = 8;
        var personal = allWorkingTime / workingTimeOnePeople;
        System.out.println("Всего работников в компании " + personal + " человек");
        var bigPersonal = personal + 94;
        var result = 8 * bigPersonal;
        System.out.println("Если в компании работает " + bigPersonal + " человека, то всего " + result + " часа работы может быть поделено между сотрудниками.");


    }

}