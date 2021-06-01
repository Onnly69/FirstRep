public class arr {
    public static void main(String[] args) {
        int [] TAB = {1,2,3,4,5,6,7,8,9};

        for (int i = 0; i < TAB.length ; i++) {
            System.out.print( TAB[i] );
        }
        System.out.println();
        System.out.println("array inversat");

        for (int i = TAB.length-1; i >=0 ; i--) {
            System.out.print( TAB[i] );
        }
    }
}
