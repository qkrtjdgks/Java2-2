import javax.swing.ProgressMonitor;

class point {
    private int x,y;
    public void set(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public void showPoint() {
        System.out.println("("+ x +","+y+")");
    }
}

class ColorPoint extends Point {
    private String color;
    public void setColor(String color) {
        this.color = color;
    }
    public void showColorPoint() {
        System.out.println(color);
        showPoint();
    }
}

public class Ex5_01 {
    public static void main(String[] args) {
     Point p = new Point();   
    }
}