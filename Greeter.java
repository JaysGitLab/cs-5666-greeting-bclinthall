public class Greeter{
    private String name="Clint";
    public static void main(String... args){
        Greeter greeter = new Greeter();
        greeter.parseArgs(args);
        greeter.greet();
    }
    void setName(String name){
        this.name = name;
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
            setName(args[len-1]);
        }
    }
}
