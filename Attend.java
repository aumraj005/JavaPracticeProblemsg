public class Attend {
    public static void main(String[] args) {
        int h = 12;
        int m = 00;
        if ((h >= 5 && h < 12) && (m == 11 && m == 0)) {
            System.out.println("MORNING");
        } else if ((h > 12 && h < 15) || (h == 15 && m <= 30)) {
            System.out.println("AFTERNOON");
        } else if ((h > 15 && h < 19) || (h == 15 && m > 30) || (h == 19 && m <= 30)) {
            System.out.println("EVENING");
        } else {
            System.out.println("NIGHT");
        }
    }
}


