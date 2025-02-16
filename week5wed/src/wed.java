public class wed {
    public static void main(String[] args) {
        String [] a1={"1","2","3","4"};
        String [] a2;
        a2= new String [3];
        System.arraycopy(a1,1,a2,0,3);
        for (int i=0; i<a2.length; i++){
            System.out.println(a2[i]);
        }


    }
}
