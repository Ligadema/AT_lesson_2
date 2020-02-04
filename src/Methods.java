public class Methods {

    private int a = 4;
    private int b = 5;
    public boolean x;
    public boolean y;
    public int squareA = (int)Math.pow(a, 2);
    public int squareB = (int)Math.pow(b, 2);
    public int cubeA = (int)Math.pow(a, 3);
    public int cubeB = (int)Math.pow(b, 3);

    public Methods() {
        System.out.println("Минимальное значение: " + Math.min(a, b));
    }
    {
        if (a % 2 == 0) {
            x = true;
        } else {
            x = false;
        }
        if (b % 2 == 0) {
            y = true;
        } else {
            y = false;
        }
    }
}