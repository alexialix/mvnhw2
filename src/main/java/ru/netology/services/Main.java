package ru.netology.services;

public class Main {
    public static void main(String[] args) {
        FreelancerService service = new FreelancerService();

        // Пример 1
        int income1 = 10000;
        int expenses1 = 3000;
        int threshold1 = 20000;
        int monthsRest1 = service.calculate(income1, expenses1, threshold1);
        System.out.println("Пример 1: месяцев отдыха = " + monthsRest1);

        // Пример 2
        int income2 = 100000;
        int expenses2 = 60000;
        int threshold2 = 150000;
        int monthsRest2 = service.calculate(income2, expenses2, threshold2);
        System.out.println("Пример 2: месяцев отдыха = " + monthsRest2);
    }
}


