class Loops {
    public static void main(String[] args) {
        int n=5;
        for(int i=0;i<=n;i++) {
            for(int j=0;j<2*n;j++) {
                if(j+i>=n+1 && j-i<=n-1 ){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println("  ");
        }
    }
}