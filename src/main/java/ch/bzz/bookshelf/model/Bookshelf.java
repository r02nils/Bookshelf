package ch.bzz.bookshelf.model;

import java.util.Map;

public class Bookshelf {

    private Map<String, Book> bookMap;

    public Map<String, Book> getBookMap() {
        return bookMap;
    }

    public void setBookMap(Map<String, Book> bookMap) {
        this.bookMap = bookMap;
    }
}
