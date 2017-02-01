public class Greeter{
    private String userName="Clint";
    public static void main(String... args){
        Greeter greeter = new Greeter();
        greeter.greet();
    }
    String getUserName(){
        return userName;
    }
    String getProgName(){
        return null;
    }
    public void greet(){
        System.out.println("Hello, "+userName);
    }
    void parseArgs(String... args ){
        int len = args.length;
        if( len > 0 ){
            userName = correctCase(args[len-1]);
        }
    }
    String correctCase(String str){
       if(str.length()==0) return str;
       StringBuilder sb = new StringBuilder(str);
       sb.setCharAt(0, Character.toUpperCase(sb.charAt(0)));
       return sb.toString();
    }
}
