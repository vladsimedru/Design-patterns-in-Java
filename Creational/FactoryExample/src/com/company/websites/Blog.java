package com.company.websites;

import com.company.pages.AboutPage;
import com.company.pages.CommentPage;
import com.company.pages.ContactPage;
import com.company.pages.PostPage;

public class Blog extends Website {
    @Override
    public void createWebsite() {
        pages.add(new AboutPage());
        pages.add(new PostPage());
        pages.add(new CommentPage());
        pages.add(new ContactPage());
    }

    @Override
    public String toString() {
        return "Blog{" +
                "pages=" + pages +
                '}';
    }
}
