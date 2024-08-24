public class Main {
    public static void main(String[] args) {
        var dog=8.0;
        System.out.println(dog);
        var cat=3.6;
        System.out.println( cat );
        var paper=763789;
        System.out.println(paper);
        System.out.println();

        dog=dog + 4;
        System.out.println(dog);
        cat = cat + 4;
        System.out.println(cat);
        paper = paper + 4;
        System.out.println(paper);
        System.out.println();

        dog = dog + 3.5;
        System.out.println(dog);
        cat = cat + 1.6;
        System.out.println(cat);
        paper = paper + 7639;
        System.out.println(paper);
        System.out.println();

        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend/3;
        System.out.println(friend);
        System.out.println();

        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);
        System.out.println();

        var boxer1 = 78.2;
        var boxer2 = 82.7;
        var sum = boxer1 + boxer2;
        System.out.println(sum);
        var difference = boxer2 - boxer1;
        System.out.println(difference);
        System.out.println();

        var remainder = boxer2%boxer1;
        System.out.println(remainder);
        System.out.println();

        var totalHour = 640;
        var workerHour = 8;
        var worker = totalHour/workerHour;
        System.out.println(worker);
        worker = worker + 94;
        System.out.println("Если в компании работает " + worker + " человек, то всего " +
                (worker * 8) + " часов работы может быть поделено между сотрудниками");
    }
}