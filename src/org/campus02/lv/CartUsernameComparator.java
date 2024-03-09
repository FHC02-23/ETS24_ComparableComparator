package org.campus02.lv;

import java.util.Comparator;

public class CartUsernameComparator implements Comparator<Cart> {
    @Override
    public int compare(Cart o1, Cart o2) {
        // sortiere aufsteigend nach username
        return o1.getUsername().compareTo(o2.getUsername());
    }
}
