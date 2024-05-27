package com.ujjwal.intro;

public class WrapperExample {
    public static void main(String[] args) {
//        int a=10;
//        int b=12;

        Integer a=45;//this is created as object
        Integer b=67;
        swap(a,b);
        System.out.println(a+""+b);
//
//        A obj;
//        for(int i=0;i<1000000000;i++){
//            obj=new A("random name");
//        }

        A obj=new A("TUBIGUYG");
        System.out.println(obj);

        final A kunal = new A("kunal kush");
        kunal.name="other name";

//        //when a non primitive is final, you cannot reassign it
//        kunal=new A("other object");

//        final int bonus=2;
//        bonus=3; can't change
    }
   //This will not swap-
//    static void swap(int a, int b){
//        int temp=a;
//        a=b;
//        b=temp;
//    }
    //This will also not swap-
    static void swap(Integer a,Integer b){
        Integer temp=a;
        a=b;
        b=temp;

    }

}
class A{
    final int num=10;
    String name ;

    public A(String name) {
        System.out.println("object created");
        this.name = name;
    }

//To get message whenever garbage collection hits-
    @Override
    protected void finalize() throws Throwable {
        System.out.println("object is destroyed");
    }
}
