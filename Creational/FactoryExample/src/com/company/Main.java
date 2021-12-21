package com.company;

import com.company.websites.SiteTypeEnum;
import com.company.websites.Website;

public class Main {

    public static void main(String[] args) {
        Website website = WebsiteFactory.getWebsite(SiteTypeEnum.BLOG);

        System.out.println(website);

        website = WebsiteFactory.getWebsite(SiteTypeEnum.SHOP);

        System.out.println(website);
    }
}
