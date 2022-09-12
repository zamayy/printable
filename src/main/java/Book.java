public class Book implements Printable{
    String name;

    @Override
    public void print() {
        System.out.println("Печать книги");
    }
    public void printBooks(Printable[] print){
        System.out.println(name);
    }
}
