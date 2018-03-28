package spi;

import com.sun.tools.javac.util.ServiceLoader;

import java.util.Iterator;

public class DoSearch {
    public static void main(String[] args) {
        ServiceLoader<Search> sl = ServiceLoader.load(Search.class);
        Iterator<Search> s = sl.iterator();
        if (s.hasNext()) {
            Search ss = s.next();
            ss.search();
        }
    }
}