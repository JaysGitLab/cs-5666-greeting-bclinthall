public class Greeter{
    private String name="Clint";
    public static void main(String... args){
        Greeter greeter = new Greeter();
        greeter.parseArgs(args);
        greeter.greet();
    }
    String getName(){
        return name;
    }
    public void greet(){
        System.out.println("Hello, "+name);
    }
    void parseArgs(String... args ){
        int len = args.length;
        if( len > 0 ){
            StringBuilder nameSb = new StringBuilder(args[len-1]);
            nameSb.setCharAt(0, Character.toUpperCase(nameSb.charAt(0)));
            name = nameSb.toString();
        }
    }
}
