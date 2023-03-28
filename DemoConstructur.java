
package konstruktor;


public class DemoConstructur {
    public static void main(String[] args) {
        user gojex=new user("faturahman al ghozy aditya","fatur keren ganteng pinter");
        
        gojex.setUsername("apapa");
        gojex.setPassword("apa");
        
        System.out.println("username: "+gojex.username);
        System.out.println("password: "+gojex.password);
    }
}
