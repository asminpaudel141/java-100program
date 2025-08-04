class FinallyExample{
    public static void main(String[] args) {
        try{
            int div=10/0;
        }catch (ArithmeticException e){
            System.out.println("Exception catch");
        }finally{
            System.out.println("Finally block always executed");
        }
    }
}