public class Main {
    public static void main(String[] args) {
        // Задача №1:
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println("\nЗадача №1\n" + dog + ", " + cat + ", " + paper);

        // Задача №2:
        dog += 4;
        cat += 4;
        paper += 4;
        System.out.println("\nЗадача №2\n" + dog + ", " + cat + ", " + paper);

        // Задача №3:
        dog -= 3.5; // изменил значение dog на 8.0
        cat -= 1.6;
        paper -= 7639;
        System.out.println("\nЗадача №3\n" + dog + ", " + cat + ", " + paper);

        // Задача №4:
        var friend = 19;
        System.out.println("\nЗадача №4\n" + friend);
        friend +=2;
        System.out.println(friend);
        friend /= 7;
        System.out.println(friend);

        // Задача №5:
        var frog = 3.5;
        System.out.println("\nЗадача №5\n" + frog);
        frog *= 10;
        System.out.println(frog);
        frog /= 3.5;
        System.out.println(frog);
        frog += 4;
        System.out.println(frog);

        // Задача №6:
        var boxer1Weight = 78.2;
        var boxer2Weight = 82.7;
        var boxersWeigt = boxer1Weight + boxer2Weight;
        System.out.println("\nЗадача №6\n" + "Общий вес боксеров = " + boxersWeigt + "кг.");
        var weightDiff = boxer2Weight % boxer1Weight;
        System.out.println("Разница в весе между боксерами = " + weightDiff + "кг.");

        // Задача №7:
       var weightDiff1 = boxer2Weight - boxer1Weight;
       var weightDiff2 = boxer2Weight % boxer1Weight;

       // Задача №8:
        System.out.println("\nЗадача №8");
        var allWorkTime = 640;
        var workerTime = 8;
        var ttlWorkers = allWorkTime / workerTime;
        System.out.println("Всего работников в компании - " + ttlWorkers + " человек.");
        var ttWorkers1 = ttlWorkers + 94;
        var allWorkTime1 = ttWorkers1  * workerTime;
        System.out.println("Если в компании работает " + ttWorkers1 + " человек, то всего "
                + allWorkTime1 + " часов работы может быть поделено между сотрудниками.");


    }
}