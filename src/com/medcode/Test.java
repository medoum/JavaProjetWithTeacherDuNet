package com.medcode;


import java.util.ArrayList;



public class Test {
  public static ArrayList<String> importantData;
  public int b;
    static {
      importantData = getDataFromInternet();
    }
  public Test(){
      b = 5;
  }
  public static ArrayList<String>  getDataFromInternet(){
      System.out.println("Downloading data from internet... ");
      ArrayList<String> data = new ArrayList<>();
      data.add("Google");
      data.add("Facebook");
      data.add("Twitter");
      return data;
  }
}
