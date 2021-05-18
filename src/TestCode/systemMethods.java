/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ocs;

/**
 *
 * @author Rezwana Hasan
 */
import java.awt.List;
import java.util.ArrayList;
import java.util.Collections;
public class systemMethods {
    
    public boolean signUp(String Name, String Username, int Password, int Phone, String Address){
        String n = Name;
        String u = Username;
        int p = Password;
        int ph = Phone;
        String a = Address;
        if(n.equals("Rezwana") && u.equals("Rezwana") && (p==123) && (ph==123456) && a.equals("Banani")){
            return true;
        }
        else{
            return false;
        }
    }
    
    public boolean login(String Username, int Password){
        String u = Username;
        int p = Password;
        if(u.equals("Rezwana") && p==123){
            return true;
        }
        else{
        return false;
        }
    }
   

    
    public String AddItem(int Item_ID) {
        if(Item_ID == 811){
           return ("Tk2000");
        }
        else{
            return "Wrong Id.";
        }
    }
    
    

    
    public boolean SearchUser(){
    ArrayList<String> arr = new ArrayList<String>();
    if(!arr.contains("Rezwana")){
      return true;   
    }
    return false;
    }
    

    
    public String Check_amount(String id){ 
    if(!id.equals("811")){
      return "Invalid ID.";   
    }
    return "Amount : 2000 taka";
    }
    
    
    public String ViewCart_details(){
    ArrayList<String> arr = new ArrayList<String>();
    
    arr.add("Kurta for women");
    arr.add("Price : 2000");
    arr.add("T-shirt for men");
    arr.add("Price : 650");
   

    if(!arr.isEmpty()){
       return "Your cart contains the following items : Kurta,T-shirt"; 
    }
    return "Please select items first";
    }
    
    
    public String ViewProducts(){
    ArrayList<String> arr = new ArrayList<String>();
    arr.add("Kurta for kids (male - Tk1200)");
    arr.add("Kurta for women - Tk2000");
    arr.add("T-shirt for men - Tk1400");
    arr.add("Punjabi for Men - Tk 2200");
    arr.add("Kurta for kids (female) - Tk 1300");
    arr.add("T-shirt for girls - Tk 600");
    if(!arr.isEmpty()){
       return "You can now view the products"; 
    }
    return "No products available.";
    }
    
    
    public String Feedback(String exp){
        String e = exp;
        if(e.equals("Good") || e.equals("Bad") || e.equals("")){
            return "Feedback recorded.";
        } 
        else{
            return "No feedback given.";
        }
    }
    
       
 
    public String discount(int amountPurchased){
        if(amountPurchased >5000){
           return "Discount allowed";
        }
        else{
           return "Discount denied";
        }
     }
    
    public String membership(int s){
        if(s >10000){
           return "Membership card is ready";
        }
        else{
           return " No membership card available";
        }
     }
    
 
    
    
}




