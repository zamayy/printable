public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("Рассуждение о методе");
        Book book2 = new Book("За закрытыми дверями");
        Magazine magazine1 = new Magazine("Игромания");
        Magazine magazine2 = new Magazine("Maxim");
        Printable[] printables = {book1, book2, magazine1, magazine2};
        Printable[] books = {book1, book2};
        Printable[] magazines = {magazine1, magazine2};
        for(Printable printable : printables){
            printable.print();
        }
        System.out.println();
        for(Printable printable : books){
            printable.printBooks();
        }
        System.out.println();
        for(Printable printable : magazines){
            printable.printMagazines();
        }
    }
}
