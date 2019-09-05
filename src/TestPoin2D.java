public class TestPoin2D {
    public static void main(String[] args) {
        Poin2D poin2D = new Poin2D();
        System.out.println(poin2D + "\n");


        poin2D = new Poin2D(2,3);
        System.out.println(poin2D + "\n");

        poin2D.setX(3);
        poin2D.setY(4);
        System.out.println(poin2D + "\n");

        poin2D.setXY(5,6);
        System.out.println(poin2D + "\n");
    }
}
