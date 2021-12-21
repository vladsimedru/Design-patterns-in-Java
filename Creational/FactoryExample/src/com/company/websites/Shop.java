package com.company.websites;

import com.company.pages.CartPage;
import com.company.pages.ItemPage;
import com.company.pages.SearchPage;

public class Shop extends Website {
    @Override
    public void createWebsite() {
        pages.add(new ItemPage());
        pages.add(new CartPage());
        pages.add(new SearchPage());
    }

    @Override
    public String toString() {
        return "Shop{" +
                "pages=" + pages +
                '}';
    }
}
