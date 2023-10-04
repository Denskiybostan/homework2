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







    }
}