
package sptv21library;


import entity.Author;
import entity.Book;
import entity.History;
import entity.Reader;
import java.util.GregorianCalendar;
import java.util.Scanner;


public class App {
    private Book[] books;
    
    public App() {
        books =  new Book[0];        
}
    
    public void run(){
        Scanner scanner = new Scanner(System.in);
        boolean repeat = true;
        Reader reader = null;
        History history = null;
        do{
            System.out.println("Задачи:");
            System.out.println("0. Выключить программу: ");
            System.out.println("1. Добавить книгу: ");
            System.out.println("2. Добавить читателя: ");
            System.out.println("3. Выдать книгу: ");
            System.out.println("4. Вернуть книгу: ");
            System.out.println("5. Добавить книгу: ");
            System.out.println("Выберите задачу: ");
            
            int task = scanner.nextInt();
            scanner.nextLine();
            switch (task) {
                case 0:
                    repeat = false;
                    break;
                case 1:
                    System.out.println("1. Добавить книгу");
                    System.out.print("Введите название книги: ");
                    String bookName = scanner.nextLine();
                    System.out.print("Введите год издания книги: ");
                    String publishedYear = scanner.nextLine();
                    System.out.print("Введите количество экземпляров книги: ");
                    String quantity = scanner.nextLine();
                    
                    Book book = createBook(bookName, new Integer(quantity), Integer.parseInt(publishedYear));
                    System.out.print("Введите количество авторов книги: ");
                    int countAuthorsInBook = scanner.nextInt(); scanner.nextLine();
                    for (int i = 0; i < countAuthorsInBook; i++){
                        System.out.print("Введите имя автора "+(i+1)+": ");
                        String firstname = scanner.nextLine();
                        System.out.print("Введите фамилию автора "+(i+1)+": ");
                        String lastname = scanner.nextLine();
                        System.out.print("Введите год рождения автора "+(i+1)+": ");
                        String birthday = scanner.nextLine();
                        book.addAuthor(createAuthor(firstname, lastname, new Integer(birthday)));   
                    }
                    System.out.println(book);
                    Book[] newBooks = new Book[books.length+1];
                    newBooks[newBooks.length-1] = book;
                    this.books = newBooks;
                    break;
                case 2:
                    System.out.println("2. Добавить читателя");
                    reader = new Reader();
                    reader.setFirstname("Иван");
                    reader.setLastname("Иванов");
                    reader.setPhone("56565656556");
                    System.out.println(reader);
                case 3:
                    System.out.println("3. Выдать книгу");
                    history = new History();
                    history.setBook(book);
                    history.setReader(reader);
                    history.setTakeOnBook(new GregorianCalendar().getTime());
                    System.out.println(history);
                case 4:
                    System.out.println("4. Забрать книгу");
                    history.setReturnBook(new GregorianCalendar().getTime());
                    System.out.println(history);
                case 5:
                    System.out.println("5. Добавить книгу)");
                    System.out.println("Введите название книги: ");
                    String bookname = scanner.nextLine();
                    System.out.println("Введите количество книг: ");
                    String quantity = scanner.nextInt();
                    System.out.println("Введите год издания книги: ");
                    int year = scanner.nextInt();

                    System.out.println("Введите имя автора ");
                    String authorname = scanner.nextLine();
                    System.out.println("Введите фамилию автора: ");
                    String authorlastname = scanner.nextLine();
                    System.out.println("Введите год рождения автора: ");
                    int birthday = scanner.nextInt();

                    book = createBook(bookname, quantity, year);
                    book.addAuthor(createAuthor(authorname, authorlastname, birthday));
                    System.out.println(book);

                default:
                    System.out.println("Выберите задачу из списка");
            }

        }while (repeat);
        System.out.println("Закрытие ");

    }
    public Book createBook(String bookName, int quantity, int publishedYear){
        Book book = new Book();
        book.setBookName(bookName);
        book.setPublisedYear(publishedYear);
        book.setQuantity(quantity);
        return book;
    }
    public Author createAuthor(String firstname, String lastname, int birthday){
        Author author = new Author();
        author.setBirthday(birthday);
        author.setFirstname(firstname);
        author.setLastname(lastname);
        return author;
    }

    private Book createBook(String bookname, String quantity, int year) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}