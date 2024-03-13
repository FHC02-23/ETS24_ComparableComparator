package org.campus02.lv.cartcomparators;


import org.campus02.lv.Cart;

import java.util.Comparator;

/**
 * Sort by number of articles descending (desc)
 * if equals, sort by total items ascending (asc)
 */
public class ArticlesDescItemsAscComparator implements Comparator<Cart> {
    @Override
    public int compare(Cart cart, Cart t1) {
        int result = Integer.compare(t1.getNumArticles(), cart.getNumArticles());
        if (result == 0) {
            return Integer.compare(cart.getTotalItems(), t1.getTotalItems());
        }
        return result;
    }
}
