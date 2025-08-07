import java.lang.Thread.State;

class ExceptionHandling{
    public static void main(String[] args){
        try{
            int number= 10/0;
        }catch(ArithmeticException e){
            System.out.println("cannot divide by Zero ");
        }
    }
}