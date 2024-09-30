package ru.netology.services;

public class FreelancerService {
    public int calculate(int income, int expenses, int threshold) {
        int count = 0;  // счетчик месяцев отдыха
        int money = 0;  // количество денег на счету

        for (int month = 0; month < 12; month++) {
            if (money >= threshold) {
                count++;  // увеличиваем счетчик месяцев отдыха
                money = money - expenses;  // оплачиваем обязательные расходы
                money = money - (money / 3);  // уменьшаем остаток денег на треть
            } else {
                money = money + income - expenses;  // зарабатываем и оплачиваем обязательные расходы
            }
        }

        return count;
    }
}
