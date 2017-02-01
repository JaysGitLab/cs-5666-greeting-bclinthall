public class Greeter{

    public static void main(String... args){
        Greeter greeter = new Greeter();
        greeter.greet();
    }
    public void greet(){
        System.out.println("Hello, Clint");
    }
    GreeterArgs parseArgs(String... args ){
        int len = args.length;
        GreeterArgs gArgs = new GreeterArgs();
        if( len > 0 ){
            gArgs.setName(args[len-1]);
        }
        return gArgs;
    }
    static class GreeterArgs{
        private String name="Clint";
        void setName(String name){
            this.name = name;
        }
        String getName(){
            return name;
        }
    }
}
