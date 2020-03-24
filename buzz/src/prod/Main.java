package prod;

public class Main {
    public static void main(String[] args) {
        for (int i = 0; i < 100 ; i++) {
            String[] iArray = Integer.toString(i).split("");

            if((i%5) == 0 ){
                System.out.println( "fizz");
            }
            if((i%7) == 0 || (((i+7)%10) == 0)){
                System.out.println( "buzz");
            }
            if((i%7) != 0 && (i%5) != 0 ){
                System.out.println( i);
            }

        }
    }
}
