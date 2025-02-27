class Access_Modifiers {
    // Private member - accessible only within this class
    private String privateMessage = "This is a private message";
    
    // Protected member - accessible within the same package and subclasses
    protected String protectedMessage = "This is a protected message";
    
    // Public member - accessible from anywhere
    public String publicMessage = "This is a public message";

    // Public method to access private member
    public String getPrivateMessage() {
        return privateMessage;
    }
}

public class AccessModifiersDemo {
    public static void main(String[] args) {
        Access_Modifiers obj = new Access_Modifiers();
        
        // Accessing public member directly
        System.out.println(obj.publicMessage);
        
        // Accessing protected member directly (allowed within the same package)
        System.out.println(obj.protectedMessage);
        
        // Accessing private member through a public method
        System.out.println(obj.getPrivateMessage());
    }
}
