package kodilla.testing;

public class FunctionResult implements Execute {
    @Override
    public void process(String str) {
        String result = str.replace("1", "i").replace("3", "e");
        System.out.println("Original, but not beautifull: " + str);
        System.out.println("#1. *** " + result + " ***");
        System.out.println("#2. " + result.toUpperCase());
        String reverse = "";
        for (int i = result.length() - 1; i >= 0; i--) {
            reverse += result.charAt(i);
        }
        System.out.println("#3. #" + reverse + "#");
    }
}