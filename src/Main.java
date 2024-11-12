public class Main {
    public static void main(String[] args) {
        int first = 10;
        byte second = 9;
        short third = 8;
        long fourth = 7;
        float fifth = 6.2F;
        double sixth = 5.0;
        System.out.println("Значение переменной first" + " с типом int " +  " равно " + first);
        System.out.println("Значение переменной second" + " с типом byte " + " равно " + second);
        System.out.println("Значение переменной third" + " с типом short " +  " равно " + third);
        System.out.println("Значение переменной fourth" + " с типом long " +  " равно " + fourth);
        System.out.println("Значение переменной fifth" + " с типом float " + " равно " + fifth);
        System.out.println("Значение переменной sixth" + " с типом double " +  " равно " + sixth);
        // zadacha 2 //
        System.out.println("Задача 2");
        double a = 27.12;
        long b = 987678965;
        float c = 2.786f;
        short d = 569;
        int e = -159;
        int f = 27897;
        byte g = 67;

        // zadacha 3 //

        System.out.println("Задача 3");
        short ludmila =23;
        short anna = 27;
        short ekaterina = 30;
        short paper = 480;
        int paperForEachStudent = (paper / (ludmila + anna + ekaterina)); //можно и double но деление целочисленное //
        System.out.println("На кажджого ученика рассчитано " + paperForEachStudent + " листов бумаги");

        // zadacha 4 //
        System.out.println("Задача 4");
        short proizvoditelnost = 16;
        short time = 2;
        int istina = proizvoditelnost / time;
        int firstTask = istina * 20;
        int secondTask = istina * 60 * 24;
        int thirdTask = secondTask * 3;
        int fourthTask = secondTask * 30;
        System.out.println("За" + " 20 минут "  + " машина произвела " + firstTask + " штук бутылок");
        System.out.println("За" + " один день  "  + " машина произвела " + secondTask + " штук бутылок");
        System.out.println("За" + " три дня "  + " машина произвела " + thirdTask + " штук бутылок");
        System.out.println("За" + " месяц"  + " машина произвела " + fourthTask + " штук бутылок");

        // zadacha 5 //
        System.out.println("Задача 5");
        int sum = 120;
        int whiteBinPerClass = 2;
        int redBinPerClass = 4;
        int classes = sum / (whiteBinPerClass + redBinPerClass);
        int whiteBin = classes * whiteBinPerClass;
        int redBin = classes * redBinPerClass;
        System.out.println("В школе где " + classes + " классов, нужно " + whiteBin + " белой краски и " + redBin + " красной краски");

        // zadacha 6 //
        System.out.println(" Задача 6");
        int banana = 5;
        int bananaWeigth = 80;
        int milk = 2;
        int milkWeigth = 105;
        int icecream = 2;
        int icecreamWeigth = 100;
        int egg = 4;
        int eggWeigth = 70;
        int gramm = banana * bananaWeigth + milk * milkWeigth + icecream * icecreamWeigth + egg * eggWeigth;
        double kg = gramm * 1.000 / 1000 ;
        System.out.println("Спортсмен на завтрак съедает " + gramm + "грамм или " + kg + " киллограмм");

        // zadacha 7 //
        System.out.println(" Задача 7");
        int purpose = 7000;
        int firstVariant = 250;
        int secondVariant = 500;
        int firstResult = purpose / firstVariant;
        int secondResult = purpose / secondVariant;
        System.out.println("Если спорстмен будет терять по 250 грамм в день, то он похудеет га 7 кг через " + firstResult + " дней");
        System.out.println("Если спорстмен будет терять по 500 грамм в день, то он похудеет га 7 кг через " + secondResult + " дней");

        // zadacha 8 //
        System.out.println("Задача 8");
        int mashaSalary = 67760;
        int denisSalary =83690;
        int krisSalary = 76230;
        double mashaNewSalary = mashaSalary * 0.1 + mashaSalary;
        double denisNewSalary = denisSalary * 0.1 + denisSalary;
        double krisNewSalary = krisSalary * 0.1 + krisSalary;
        int mashaSalaryDif = (int)mashaNewSalary - mashaSalary;
        int denisSalaryDif = (int)denisNewSalary - denisSalary;
        int krisSalaryDif = (int)krisNewSalary - krisSalary;
        System.out.println("Маша теперь получает " + mashaNewSalary + " в месяц. Годовой доход вырос на " + mashaSalaryDif + " рублей");
        System.out.println("Денис теперь получает " + denisNewSalary + " в месяц. Годовой доход вырос на " + denisSalaryDif + " рублей");
        System.out.println("Кристина теперь получает " + krisNewSalary + " в месяц. Годовой доход вырос на " + krisSalaryDif + " рублей");











    }
}