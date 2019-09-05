public class TestPoin3D {
    public static void main(String[] args) {
        Poin3D poin3D = new Poin3D();
        System.out.println(poin3D);

        poin3D = new Poin3D(2,3,4);
        System.out.println(poin3D);

        poin3D.setX(4);
        poin3D.setY(5);
        poin3D.setZ(6);
        System.out.println(poin3D);

        poin3D.setXYZ(7,8,9);
        System.out.println(poin3D);
    }
}
