public class Book implements Printable{
   String name;

    public Book(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void print() {
        System.out.println("Печать книги: " + getName());
    }
    public void printBooks(){
        System.out.println("Только книги: " + getName());
    }

    @Override
    public void printMagazines() {

    }
}
