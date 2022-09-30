public class Main {
    public static void main(String[] args) {
        int clientOS = 1;
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else {
            if (clientOS == 1)
                System.out.println("Установите версию приложения для Android по ссылке");
        }

        int clientDeviceYear = 2018;
        if (clientOS == 0) {
            if (clientDeviceYear < 2015) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            } else {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            }
        } else if (clientDeviceYear > 2015 && clientOS == 0) {
            System.out.println("Установите приложение для iOS по ссылке");
        } else {
            System.out.println("Установите приложение для Android по ссылке");
        }

        int year = 2024;
        if (year % 4 == 0 && year % 100 != 0) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }

        int deliveryDistance = 95;
        int deliveryTime = 1;
        if (deliveryDistance <= 20) {
            System.out.println("Потребуется дней " + (deliveryTime));
        }else {
        if (deliveryDistance > 20 && deliveryDistance < 60) {
        System.out.println("Потребуется дней " + (deliveryTime + 1));
        }else {
        if (deliveryDistance > 60) {
        System.out.println("Потребуется дней " + (deliveryTime + 2));
            }

        int monthNumber = 12;
        switch (monthNumber) {
            case 12:
            case 1:
            case 2:
            System.out.println("Принадлежит к сезону зима");
            break;
            case 3:
            case 4:
            case 5:
                System.out.println("Принадлежит к сезону весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Принадлежит к сезону лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Принадлежит к сезону осень");
                break;
            default:
                System.out.println("Такого сезона не существует");

        }

            }

            }
            }

        }


