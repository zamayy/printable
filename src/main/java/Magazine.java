public class Magazine implements Printable {
    String name;

    @Override
    public void print() {
        System.out.println("Печать газеты");
    }
    public void printMagazines(Printable[] print){
        System.out.println(name);
    }
}