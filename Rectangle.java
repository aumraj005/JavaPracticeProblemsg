import java.util.Scanner;

class rect{
    int len;
    int bre;
    rect(int len , int bre){
        this.len = len;
        this.bre = bre;
    }

    int area(){
        return this.len * this.bre;
    }
    int peri(){
        return (2 *(this.len + this.bre));
    }
}
public class Rectangle {
    public static void main(String[] args) {
        rect re = new rect(5,6);
        System.out.println(re.peri());
    }
}
