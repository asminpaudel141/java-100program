
public class Convert_char_String_String_Char {
    public static void main(String[] args){
        // convert char to String
        char ch='A';
        String str=Character.toString(ch);
        System.out.println("Char to String: "+str);

        // convert String to char
        String s="Hello";
        char c=s.charAt(0);
        System.out.println("String to char: "+c);
    }
}
