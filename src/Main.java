
//Задача №1
public static void printLeapYear (short yaer) {
    short startYear = 1584;
    int everyFourthYear = yaer % 4;
    int everyFourHundredthYear = yaer % 400;
    int everyHundredthYear = yaer % 100;
    if ((everyFourthYear == 0 || everyFourHundredthYear == 0 && everyHundredthYear != 0) && yaer >= startYear) {
        System.out.println(yaer + " год является високосным");
    } else {
        System.out.println(yaer + " год не является високосным");
    }
}
//Задача №2
public static void printVersionDevice (byte clientOS, short clientDeviceYear) {

    if (clientDeviceYear < 2015 && clientOS == 1) {
        System.out.println("Установите версию приложения для Android по ссылке" + " Установите облегченную версию приложения для Android по ссылке");
    } else if (clientDeviceYear < 2015 && clientOS == 0) {
        System.out.println("Установите версию приложения для iOS по ссылке" + " Установите облегченную версию приложения для IOS по ссылке");
    } else if (clientDeviceYear >= 2015 && clientOS == 1) {
        System.out.println("Установите версию приложения для Android по ссылке");
    } else if (clientDeviceYear >= 2015 && clientOS == 0) {
        System.out.println("Установите версию приложения для iOS по ссылке");
    }
}
//Задача №3
public static void printDelivery (byte deliveryDistance) {
    byte day1 = 1;
    byte day2 = 2;
    byte day3 = 3;
    if (deliveryDistance > 0 && deliveryDistance <= 20) {
        System.out.println("Потребуется дней: " + day1);
    } else if (deliveryDistance > 20 && deliveryDistance <= 60) {
        System.out.println("Потребуется дней: " + day2);
    } else if (deliveryDistance > 60 && deliveryDistance <= 100) {
        System.out.println("Потребуется дней: " + day3);
    } else {
        System.out.println("Доставка не осуществляется");
    }
}
void main() {
    {
//Задача №1
        System.out.println("Задача №1");
        short year = 2024;
        printLeapYear(year);
//Задача №1
    }
    {
//Задача №2
        System.out.println("Задача №2");
        byte clientOS = 0;
        short clientDeviceYear = 2015;
        printVersionDevice(clientOS, clientDeviceYear);
//Задача №2
    }
    {
//Задача №3
        System.out.println("Задача №3");
        byte deliveryDistance = 21;
        printDelivery(deliveryDistance);
//Задача №3
    }

}
