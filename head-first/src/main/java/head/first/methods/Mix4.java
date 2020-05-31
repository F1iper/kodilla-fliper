package head.first.methods;

public class Mix4 {
    int counter = 0;

    public static void main(String[] args) {
        int amount = 0;
        Mix4[] m4a = new Mix4[20];
        int x = 0;
        while (x < 19) {
            m4a[x] = new Mix4();
            m4a[x].counter ++;
            amount ++;
            amount += m4a[x].maybeNew(x);
            x++;
        }
        System.out.println(amount + " " + m4a[1].counter);
    }

    public int maybeNew(int index) {
        if (index < 1) {
            Mix4 m4 = new Mix4();
            m4.counter = m4.counter + 1;
            return 1;
        }
        return 0;
    }
}