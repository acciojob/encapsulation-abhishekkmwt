package com.driver;

public class Main {
  public static void main(String[] args){
      RWOnly obj=new RWOnly();

      obj.setName("abhi");
      String ans1=obj.getName();

      System.out.println(ans1);

  }
}