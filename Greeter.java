public class Greeter{
    private String userName="Clint";
    private String progName="Hal";
    public static void main(String... args){
        Greeter greeter = new Greeter();
        greeter.parseArgs(args);
        greeter.greet();
    }
    String getUserName(){
        return userName;
    }
    String getProgName(){
        return progName;
    }
    public void greet(){
        System.out.println(makeGreeting());
    }
    private String makeGreeting(){
         return "Hello, " + userName + ". My name is " + progName + ". How are you today, " + userName + "?"; 
    }
    void parseArgs(String... args ){
        int len = args.length;
        for(int i=0; i<len; i++){
            String arg = args[i];
            if(arg.equals("-me")){
                if(i==len-1){
                    printUsage();
                }else{
                    progName = correctCase(args[i+1]);
                    i++;
                }
            }else if(i==len-1){
                userName = correctCase(arg);
            }
        }
    }
    void printUsage(){
        System.out.println("usage: java Greeter [arguments] [user-name]\t\tGreets you by the name you specify, or the default name, 'Clint' if none is specified.");
        System.out.println("arguments:");
        System.out.println("\t-me <name>\t\tthe '-me' argument specifies the name which I shall call myself");
    }
    String correctCase(String str){
       if(str.length()==0) return str;
       StringBuilder sb = new StringBuilder(str);
       sb.setCharAt(0, Character.toUpperCase(sb.charAt(0)));
       return sb.toString();
    }
}
