public class Main {
    public static void main(String[] args) {
        var dog = 8.0;
        System.out.println(dog);
        dog = dog + 4;
        System.out.println(dog);
        dog = dog - 3.5;
        System.out.println(dog);
        var cat = 3.6;
        System.out.println(cat);
        cat = cat + 4;
        System.out.println(cat);
        cat = cat - 1.6;
        System.out.println(cat);
        var paper = 763789;
        paper = paper + 4;
        System.out.println(paper);
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

        var boxerWeight1 = 78.2;
        System.out.println(boxerWeight1);
        var boxerWeight2 = 82.7;
        System.out.println(boxerWeight2);
        var totalWeight = boxerWeight1 + boxerWeight2;
        System.out.println(totalWeight);
        var differenceWeight = boxerWeight2 - boxerWeight1;
        System.out.println(differenceWeight);
        differenceWeight = boxerWeight2 % boxerWeight1;
        System.out.println(differenceWeight);

        var timeWork = 640;
        var workDay = 8;
        var quantityWorkers = timeWork / workDay;
        System.out.println("Всего в компании работает " + quantityWorkers + " человек");
        var quantityWorkers2 = quantityWorkers + 94;
        System.out.println(quantityWorkers2);
        var workDay2 = timeWork / quantityWorkers2;
        System.out.println("Если в компании работает " + quantityWorkers2 + " человек, то всего " + workDay2 + " часов работы может быть поделено между сотрудниками");

        byte a = 100;
        System.out.println("Значение переменной с типом byte равно 100");
        short b = 30000;
        System.out.println("Значение переменной с типом short равно 30000");
        int c = 1500000;
        System.out.println("Значение переменной с типом int равно 1500000");
        long d = 900000000;
        System.out.println("Значение переменной с типом long равно 900000000");
        float g = 10.75F;
        System.out.println("Значение переменной с типом float  равно 10.75F");
        double j = 10.5;

        double w = 27.12;
        System.out.println(w);
        double r = 2.786;
        System.out.println(r);
        short y = 569;
        System.out.println(y);
        short q = -159;
        System.out.println(q);
        short x = 27897;
        System.out.println(x);
        byte z = 67;
        System.out.println(z);

        byte class1 = 23;
        System.out.println(class1);
        byte class2 = 27;
        System.out.println(class2);
        byte class3 = 30;
        System.out.println(class3);
        int totalNumber = class1 + class2 + class3;
        System.out.println(totalNumber);
        short numberPaper = 480;
        int paperForStudent = numberPaper / totalNumber;
        System.out.println(paperForStudent);

        byte producedBottle = 16;
        byte minutes = 2;
        int productionPerMinute = producedBottle / minutes;
        System.out.println(productionPerMinute);
        byte minutes1 = 20;
        int producedInTime = minutes1 * productionPerMinute;
        System.out.println("За 20 минут машина произвела " + producedInTime + " бутылок");
        short minutes2 = 1440;
        int producedInTime1 = minutes2 * productionPerMinute;
        System.out.println("За сутки машина произвела " + producedInTime1 + " бутылок");
        short minutes3 = 4320;
        int producedInTime2 = minutes3 * productionPerMinute;
        System.out.println("За 3 дня машина произвела " + producedInTime2 + " бутылок");
        int minutes4 = 43200;
        int producedInTime3 = minutes4 * productionPerMinute;
        System.out.println("За 30 дней машина произвела " + producedInTime3 + " бутылок");

        byte totalNumberCans = 120;
        byte whitePaintFor1CLass = 2;
        byte brownPaintFor1Class = 4;
        int totalNumberClasses = totalNumberCans / (whitePaintFor1CLass + brownPaintFor1Class);
        System.out.println(totalNumberClasses);
        int totalNumberBrownPaint = totalNumberClasses * brownPaintFor1Class;
        System.out.println(totalNumberBrownPaint);
        int totalNumberWhitePaint = totalNumberClasses * whitePaintFor1CLass;
        System.out.println(totalNumberWhitePaint);
        System.out.println("В школе, где 20 классов, нужно 40 банок белой краски и 80 банок коричневой краски");

        byte quantityBananas = 5;
        byte weightOneBanana = 80;
        int totalWeightBananas = quantityBananas * weightOneBanana;
        System.out.println(totalWeightBananas);
        int quantityMilk = 200;
        byte onePortionMilk = 100;
        byte weightOnePortionMilk = 105;
        int totalWeightmilk = (quantityMilk / onePortionMilk) * weightOnePortionMilk;
        System.out.println(totalWeightmilk);
        byte allPortionsIceCream = 2;
        byte weightOnePortionsIceCream = 100;
        int weightAllPortionsIceCream = allPortionsIceCream * weightOnePortionsIceCream;
        System.out.println(weightAllPortionsIceCream);
        byte totalEggs = 4;
        byte weightOneEgg = 70;
        int totalWeightAllEggs = totalEggs * weightOneEgg;
        System.out.println(totalWeightAllEggs);
        int weightSportBreakfast = totalWeightBananas + totalWeightmilk + weightAllPortionsIceCream +totalWeightAllEggs;
        System.out.println(weightSportBreakfast);
        int kgWeighSportBreakfast = weightSportBreakfast / 1000;
        System.out.println(kgWeighSportBreakfast);

        int excessWeight = 7000;
        int lostWeightInOneday = 250;
        int totalQuantityDay = excessWeight / lostWeightInOneday;
        System.out.println(totalQuantityDay);

        int lostWeightInOneDay2 = 500;
        int totalQuantityDay2 = excessWeight / lostWeightInOneDay2;
        System.out.println(totalQuantityDay2);

        int salaryMasha = 67760;
        int salaryDenis = 83690;
        int salaryKristina = 76230;
        byte salaryIncrease = 10;
        int salaryMasha2 = (salaryMasha / salaryIncrease) + salaryMasha;
        System.out.println(salaryMasha2);
        byte monthInYear = 12;
        int salaryMasha2InYear = (salaryMasha / salaryIncrease) * monthInYear;
        System.out.println("Маша теперь получает " + salaryMasha2 + " рублей." + " Годовой доход вырос на " + salaryMasha2InYear + " рублей" );
        int salaryDenis2 = (salaryDenis / salaryIncrease) + salaryDenis;
        System.out.println(salaryDenis2);
        int salaryDenis2InYear = (salaryDenis / salaryIncrease) * monthInYear;
        System.out.println("Денис теперь получает " + salaryDenis2 + " рублей." + " Годовой доход вырос на " + salaryDenis2InYear + " рублей");
        int salaryKristina2 = (salaryKristina / salaryIncrease) + salaryKristina;
        System.out.println(salaryKristina2);
        int salaryKristina2InYear = (salaryKristina2 / salaryIncrease) * monthInYear;
        System.out.println("Кристина теперь получает " + salaryKristina2 + " рублей." + " Годовой доход вырос на " + salaryKristina2InYear + " рублей");









    }
}