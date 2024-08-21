public class StringtoUpper {
    public static void main(String[] args) {
        String s = "hello world";
        String res = "";
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch>= 97 && ch<=122)
            {
                ch -= 32;
                res += ch;
            }
            else {
                res+= ch;
            }
        }
        System.out.println(res);
    }
}