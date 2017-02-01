public class Greeter{
    private String name="Clint";
    public static void main(String... args){
        Greeter greeter = new Greeter();
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
            name = args[len-1];
        }
    }
}
