import java.time.LocalDate;

class Main {
    public static void checkLeapYear(int year) {
        boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
        if (isLeapYear) {
            System.out.println(year + " год — високосный год");
        } else {
            System.out.println(year + " год — невисокосный год");
        }
    }

    public static void recommendApp(int osType, int clientDeviceYear) {
        int currentYear = LocalDate.now().getYear();
        String osName = (osType == 0) ? "iOS" : "Android";

        if (clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для " + osName + " по ссылке");
        } else {
            System.out.println("Установите приложение для " + osName + " по ссылке");
        }
    }

    public static void calculateDeliveryDays(int deliveryDistance) {
        int days;
        if (deliveryDistance <= 20) {
            days = 1;
        } else if (deliveryDistance <= 60) {
            days = 2;
        } else if (deliveryDistance <= 100) {
            days = 3;
        } else {
            days = -1;
        }

        if (days == -1) {
            System.out.println("Доставка на расстояние " + deliveryDistance + " км не осуществляется");
        } else {
            System.out.println("Потребуется дней: " + days);
        }
    }

    public static void main(String[] args) {
        System.out.println("Задача 1:");
        checkLeapYear(2020);
        checkLeapYear(2021);

        System.out.println("\nЗадача 2:");
        recommendApp(0, 2014);
        recommendApp(1, 2015);

        System.out.println("\nЗадача 3:");
        int deliveryDistance = 95;
        calculateDeliveryDays(deliveryDistance);
    }
}