public class StringToLower {
    public static void main(String[] args) {
        String s = "HELLO WORLD";
        String res = "";
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch>= 65 && ch<=90)
            {
                ch += 32;
                res += ch;
            }
            else {
                res+= ch;
            }
        }
        System.out.println(res);
    }
}
