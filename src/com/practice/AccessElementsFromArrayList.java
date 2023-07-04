package com.practice;

import java.util.ArrayList;
import java.util.List;

public class AccessElementsFromArrayList {
public static void main(String[] args) {
	List<String> topCompanies=new ArrayList<>();
	System.out.println("Is the top companies list empty?:"+ topCompanies.isEmpty());
	topCompanies.add("Google");
	topCompanies.add("Microsoft");
	topCompanies.add("Facebook");
	topCompanies.add("Amazon");
	topCompanies.add("xyz");
    System.out.println("here is top company :"+ topCompanies.size() +" companies in the world  ");
    System.out.println(topCompanies);
    
    //retrieve the element at a given index
    String bestCompanieString=topCompanies.get(0);
    String secondBestCompanyString=topCompanies.get(1);
    String lastCompanyString=topCompanies.get(topCompanies.size()-1);
    
    System.out.println("best company" + bestCompanieString);
    System.out.println("Second best Comapanies" + secondBestCompanyString);
    System.out.println(lastCompanyString);

    topCompanies.set(4, "walmart");
    System.out.println(topCompanies); 
}
}
