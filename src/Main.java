public class Main {
    public static void main(String[] args) {
        // task 1
        int Nomber = 1;
        while (Nomber <= 10) {
            System.out.print(Nomber);
            Nomber++;
        }
        System.out.println();

        for (int nomber = 10; nomber > 0; nomber--) {
            System.out.print(nomber);
        }
        System.out.println();

// task 2
        for (int friday = 5; friday < 32; friday += 7) {
            System.out.println("Сегодня, пятница, " + friday +
                    "-е число. Необходимо подготовить отчет.");
        }

// task 3
        for (int year = 0; year <= 2122; year += 79) {
            if (year >= 1822)
                System.out.println(year);}



        }
}