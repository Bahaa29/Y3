package oss;

import java.util.Iterator;
import java.util.ArrayList;
import java.util.List;

public class waitress {
    Menu pancakeHouseMenu;
    Menu dinerMenu;

    public waitress(Menu pancakeHouseMenu, Menu dinerMenu) {
        this.pancakeHouseMenu = pancakeHouseMenu;
        this.dinerMenu = dinerMenu;
    }

    // implicit iteration
    public void printMenu() {
        List<menuItem> breakfastItems = ((PancakeHouseMenu) pancakeHouseMenu).getMenuItems();
        for (menuItem m : breakfastItems) {
            printMenuItem(m);
        }

        menuItem[] lunchItems = ((DinerMenu) dinerMenu).getMenuItems();
        for (menuItem m : lunchItems) {
            printMenuItem(m);
        }
    }

    public void printMenuItem(menuItem menuItem) {
        System.out.print(menuItem.getName() + ", ");
        System.out.print(menuItem.getPrice() + " -- ");
        System.out.println(menuItem.getDescription());
    }
}