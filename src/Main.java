
//Задача №1
public static void printLeapYear (short yaer1) {
    System.out.println(yaer1);
    short startYear = 1584;
    int everyFourthYear = yaer1 % 4;
    int everyFourHundredthYear = yaer1 % 400;
    int everyHundredthYear = yaer1 % 100;
    if ((everyFourthYear == 0 || everyFourHundredthYear == 0 && everyHundredthYear != 0) && yaer1 >= startYear) {
        System.out.println(yaer1 + " год является високосным");
    } else {
        System.out.println(yaer1 + " год не является високосным");
    }
}

void main() {
    System.out.println("Задача №1");
    short year = 2024;
    printLeapYear(year);

}
