package head.first.methods;

public class References {

    private String name;
    private double size;

    public References(String name, double size) {
        this.name = name;
        this.size = size;
    }

    public static void main(String[] args) {

        References b1 = new References("Byte 1", 255.255);
        References b2 = new References("Byte 1", 255.255);
        References b3 = b2;

        int a = 10;
        int b = 20;
        int c = a;

        System.out.println("" + a + b + c);
        System.out.println(c == a);
        int d = c * 10;
        int e = a * 10;
        System.out.println(d == e);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "Bytes{" +
                "name='" + name + '\'' +
                ", size=" + size +
                '}';
    }
}