public class CombinedStrings {
    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = "World";
        for (int i = 0; i < s1.length(); i++) {
            char ch1 = s1.charAt(i);
            char ch2 = s2.charAt(i);
            System.out.print(ch1 + ""+ ch2);
        }
    }
}
