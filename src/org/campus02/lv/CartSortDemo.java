package org.campus02.lv;

import java.util.ArrayList;
import java.util.Collections;

public class CartSortDemo {

    public static void main(String[] args) {

        ArrayList<Cart> carts = new ArrayList<>();
        carts.add(new Cart("john", 4, 10, 125.90));
        carts.add(new Cart("jane", 1, 1, 6.70));
        carts.add(new Cart("bob", 10, 10, 1_000));
        carts.add(new Cart("pete", 3, 12, 80_000));

        Collections.sort(carts);
        System.out.println(carts);


        // sortiere nach username
        //Collections.sort(carts, new CartUsernameComparator());
        carts.sort(new CartUsernameComparator());
        System.out.println("Sortierung nach username:");
        System.out.println(carts);

        // Task
        // sortiere absteigend nach totalItems
        carts.sort(new CartTotalItemsDescComparator());
        System.out.println("Sortierung nach totalItems");
        System.out.println(carts);
    }
}
