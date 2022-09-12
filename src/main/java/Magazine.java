public class Magazine implements Printable{
    String name;

    public Magazine(String name) {
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
        System.out.println("Печать журнала: " + getName());
    }

    @Override
    public void printBooks() {

    }

    public void printMagazines(){
        System.out.println("Только журналы: " + getName());
    }
}
