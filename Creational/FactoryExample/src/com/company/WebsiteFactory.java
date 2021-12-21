package com.company;

import com.company.websites.Blog;
import com.company.websites.Shop;
import com.company.websites.SiteTypeEnum;
import com.company.websites.Website;

public class WebsiteFactory {
    public static Website getWebsite(SiteTypeEnum siteType) {
        switch (siteType) {
            case BLOG: {
                return new Blog();
            }
            case SHOP: {
                return new Shop();
            }
            default:{
               return null;
            }
        }
    }
}
