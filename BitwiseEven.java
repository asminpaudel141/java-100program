public class BitwiseEven{
    public static boolean isEven(int n){
        if((n&1) == 0)
            return true;
        else
            return false;
    }
    public static void main(String[] args){
        int n=14;
        if(isEven(n) ==true){
            System.out.print("true");
        }else{
            System.out.println("False");
        }
    }
}