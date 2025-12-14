class Cub {
    int a = 33, cube;
    void show() {
        cube = a * a * a;
        System.out.println("cube=" + cube);
    }
    public static void main(String args[]) {
        Cub c = new Cub();
        c.show();
    }
}