import java.util.Scanner; // import java scanner class
public class pyramidcal {
    public static void main(String[] args){
        Scanner myobj = new Scanner(System.in);
        System.out.print("enter your height of triangle here: ");
        int Height = myobj.nextInt(), num = 1;
        while(num <= Height){
            for (int i = 1; i <= num; i++){
                if( num > 2 && num < Height && i < num && i > 1){
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            num++;
            System.out.println("");
        }
    }
}
