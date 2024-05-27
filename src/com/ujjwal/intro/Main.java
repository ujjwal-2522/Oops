package com.ujjwal.intro;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // store 5 roll nos
        int[] numbers = new int[5];

        //store 5 names
        String[] names = new String[5];

        // data of 5 students: {roll no,name,marks}
        int[] rno = new int[5];
        String[] name = new String[5];
        float[] marks = new float[5];


        Student[] students = new Student[5];
        //Make a class for your own datatype to include all this alltogether


        //just declare
//        Student kunal;
//        kunal= new Student();
        Student kunal = new Student(13,"kuanl kush",86.5f);
        Student rahul=new Student();
//        kunal.rno=13;
//        kunal.name="kunal kush";
//        kunal.marks=84.5f;

//        kunal.changeName("shoe lover");
//        kunal.greeting();
        System.out.println(kunal.rno);
        System.out.println(kunal.name);
        System.out.println(kunal.marks);
        Student random=new Student(kunal);
        System.out.println(random.name);
    }
}

    //create a class
    class Student{
        int rno;
        String name;
        float marks=90;

        //we need a way to add the values of the above
        // preperties object by object
        //we need one word to access every object=this

       void greeting(){
           System.out.println("my name is "+name);
       }
       void changeName(String newName){
           name=newName;
       }
        Student(){
            //this is how you call constructor from another constructor
            //internally : new Student(13,"rahul",100.0f);
            this(13,"rahul",100.0f);
        }
        //Student arpit =new Student(13,"arpit",86.6f)
        //here,this will be replaced with arpit
        Student(int rno,String name,float marks){
            this.rno=rno; //internally "this"=kunal
            this.name=name;
            this.marks=marks;
        }
        Student(Student other){
           this.name= other.name;
           this.rno=other.rno;
           this.marks=other.marks;
        }
    }

