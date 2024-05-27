package gfgclass.singletonDesignPattern;

public class logging {


    //Lazy intiallization
    public static logging instance;


    //Constructor is always private
    private logging(){

    }


    public static logging getInstance(){
        if(instance==null){
            instance=new logging();
        }
        return instance;
    }

    public void printmsg(String msg){
        System.out.println("msg is " +msg);
    }

    public static void main(String[] args) {
        logging Logging=logging.getInstance();
        Logging.printmsg("my msg");
    }



    //Early intiallization
//    public static logging instance =new logging();
//
//
//    private logging(){
//
//    }
//
//
//    public void printmsg(String msg){
//        System.out.println("msg is " +msg);
//    }
//
//    public static void main(String[] args) {
//        logging Logging=logging.instance;
//        Logging.printmsg("my msg");
//    }
}
