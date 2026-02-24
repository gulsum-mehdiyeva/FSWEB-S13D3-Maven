package org.example;

public class Person {
    String firstname;
    String lastName;
    int age;
    String adress;
    boolean boy;
    String okul;

   public Person(String firstname, String lastName,int age){
this.firstname=firstname;
        this.lastName=lastName;
        this.age=age;
    }
   public  Person(String firstname, String lastName,int age,String adress,boolean boy,String okul){
this(firstname,lastName,age);
this.adress=adress;
this.boy=boy;
this.okul=okul;
    }
    public String getFirstName(){
        return this.firstname;
    }
    public String getLastName (){
        return this.lastName;
    }
    public int getAge(){
        return age;
    }
    public boolean isTeen() {
        if(age>=13 && age<=19){
            return true;
        } else{
            return false;
        }
    }
}
