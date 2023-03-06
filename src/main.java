public class main {
    public static void main(String[] args) {
        Boksor b1 = new Boksor("a", 10, 120, 100, 30);
        Boksor b2 = new Boksor("b", 20, 85, 85, 40);
        Musabaka mac = new Musabaka(b1, b2, 85, 100);
        mac.Basla();
    }
}
