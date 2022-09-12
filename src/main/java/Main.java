public class Main {
    public static void main(String[] args) {
        Book book1 = new Book();
        book1.name = "За закрытыми дверями";
        Magazine magazine1 = new Magazine();
        magazine1.name = "Maxim";
        Printable[] print = {book1, magazine1};
        for(int i=0;i<print.length;i++){
            if(print[i] instanceof Book){
               ((Book) print[i]).printBooks(print);
            }
            if(print[i] instanceof Magazine){
                ((Magazine) print[i]).printMagazines(print);
            }
        }
    }
}
