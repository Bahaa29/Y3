package oss;

public class MainTest
{
    public static void main(String args[]) {
        PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
        DinerMenu dinerMenu = new DinerMenu();
        waitress waitress = new waitress(pancakeHouseMenu, dinerMenu);
        waitress.printMenu();
    }
}
