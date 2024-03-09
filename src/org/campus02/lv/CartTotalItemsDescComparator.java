package org.campus02.lv;

import java.util.Comparator;

public class CartTotalItemsDescComparator implements Comparator<Cart> {
    @Override
    public int compare(Cart o1, Cart o2) {
        int res = Integer.compare(o2.getTotalItems(), o1.getTotalItems());
        if (res == 0) {
            return Integer.compare(o1.getNumArticles(), o2.getNumArticles());
        }
        return res;
    }
}
