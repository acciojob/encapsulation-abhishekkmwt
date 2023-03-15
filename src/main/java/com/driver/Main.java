package com.driver;

public class Main {
  public static void main(String[] args){
      RWOnly obj=new RWOnly();

      obj.setter("abhi");
      String ans1=obj.getter();

      System.out.println(ans1);

  }
}