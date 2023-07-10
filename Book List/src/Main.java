import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Book> bookList = new ArrayList<>();
        bookList.add(new Book("AAA",58,"Mehmet","2001"));
        bookList.add(new Book("BBB",124,"Cenk","2005"));
        bookList.add(new Book("CCC",243,"Ali","2003"));
        bookList.add(new Book("DDD",212,"Damla","2004"));
        bookList.add(new Book("EEE",46,"Seher","2006"));
        bookList.add(new Book("FFF",75,"Osman","2008"));
        bookList.add(new Book("GGG",153,"Taha","2009"));
        bookList.add(new Book("HHH",70,"Zeynep","2010"));
        bookList.add(new Book("III",259,"Halil","2002"));
        bookList.add(new Book("JJJ",360,"Demir","2007"));

        Map<String, String> bookAuthorMap = bookList.stream().collect(Collectors.toMap(Book:: getName, Book::getAuthorName));

        for (Map.Entry<String, String> k : bookAuthorMap.entrySet()) {
            System.out.println(k.getKey() + " " + k.getValue());
        }

        System.out.println();

        List<Book> newBookList = bookList.stream().filter(book -> book.getPageNumber() > 100).collect(Collectors.toList());
        for (Book book : newBookList) {
            System.out.println(book.getName() + " " + book.getPageNumber());
        }
    }
}