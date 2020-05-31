package head.first.methods;

public class XCopy {

    public static void main(String[] args) {
        int org = 42;
        XCopy x = new XCopy();
        int y = x.go(org);
        System.out.println(org + " " + y);

    }
    int go (int org){
        org = org *2;
        return org;
    }
}
