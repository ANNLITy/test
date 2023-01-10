public class Main {
    public static void main(String[] args) {
        int[] first = new int[3];
        first[0]=1;
        first[1]=2;
        first[2]=3;
        for (int i = 0; i < first.length; i++) {
            System.out.println(first[i]);
            if(i!= first.length-1) {
                System.out.println(", ");
            }
        }
        System.out.println();
        for (int i = first.length-1;i>=0; i--) {
            System.out.println(first[i]);
            if(i!=0) {
                System.out.println(", ");
            }
        }
    }
}