public class DoubleMul {

    public static void main (String[] args) {
        int dan = 9;
        int su = 9;
        for (int i = 1; i <= dan; i++) {
            if (i%2 == 0) {
                System.out.print(i+ "단\n");
            }
            else {
                System.out.print( "<" + i + "단>\n");
            }
            for (int j = 1; j <= su; j++) {
                System.out.println(i + "x" + j + "=" + (i*j));
            }
        }
    }
}
