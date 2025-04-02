class Main {
    public static void main(String[] args) {
        int distance = 95;
        int days = calculateDeliveryDays(distance);
        printDeliveryDays(days);
    }

    public static int calculateDeliveryDays(int deliveryDistance) {
        if (deliveryDistance <= 20) {
            return 1;
        } else if (deliveryDistance <= 60) {
            return 2;
        } else if (deliveryDistance <= 100) {
            return 3;
        } else {
            return -1;
        }
    }


    public static void printDeliveryDays(int days) {
        if (days >= 0) {
            System.out.println("Потребуется дней: " + days);
        } else {
            System.out.println("Доставка на такое расстояние не осуществляется");
        }
    }
}