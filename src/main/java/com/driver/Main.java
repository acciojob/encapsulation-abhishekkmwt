package com.driver;

public class Main {
  public static void main(String[] args){
      RWOnly obj=new RWOnly();
      String ans=obj.name; //Error as name is private in RWOnly class and cant be accessed outside class.
      obj.name="abhishek";
      System.out.println(ans);

      obj.setter("abhi");
      String ans1=obj.getter();

      System.out.println(ans1);

  }
}