public class week7 {
    public static int mystery(int n){
        if (n<10){
            return n;
        }else {
            int a=n/10;
            int b =n%10;
            return mystery(a+b);
        }
    }

    public static void main(String[] args) {
        System.out.println(mystery(612));
    }
}
