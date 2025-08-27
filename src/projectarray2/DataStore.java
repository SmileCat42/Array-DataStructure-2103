/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projectarray2;

import projectarray.*;
import java.util.ArrayList;
/**
 *
 * @author Windows10
 */
public class DataStore {
    static int n=13;
    public static class Products {
        public int code;
        public String name;
        public int type;
        public float price;
        public String pic;
        
        public Products(){
            
        }
        public Products(int a, String b, int c, float d, String e){
            code = a;
            name = b;
            type = c;
            price = d;
            pic = e;
        }

        public void setAll(int a, String b, int c, float d, String e){
            code = a;
            name = b;
            type = c;
            price = d;
            pic = e;
        }
        static int getN(){
            return n;
        }
        
    }

    
    public static ArrayList<Products> list = new ArrayList<>();



        static{
        list.add(new Products(10233,"Adidas sneaker",1,4600,"/sc/sneakerAdi.jpg"));
        list.add(new Products(10472,"Nike sneaker",1,4200,"/sc/sneakerNike.jpg"));
        list.add(new Products(10785,"Skecher sneaker",1,2500,"/sc/ske.jpg"));
        list.add(new Products(20096,"Umbro Glove",2,800,"/sc/ub.jpg"));
        list.add(new Products(20504,"Nike football shirt",2,1500,"/sc/shirtNike.jpg"));
        list.add(new Products(30319,"Ping stick golf",3,1300,"/sc/golfstick.jpg"));
        list.add(new Products(30873,"Anyday golf bag",3,5000,"/sc/golfbag.jpg"));
        list.add(new Products(40152,"Yonex strike",4,2400,"/sc/yon.png"));
        list.add(new Products(40197,"Kawasaki strike",4,1700,"/sc/kawa.jpg"));
        list.add(new Products(40601,"Victor shuttlecock",4,200,"/sc/shuttle.jpg"));
        list.add(new Products(50290,"Puma football",5,800,"/sc/puma.jpg"));
        list.add(new Products(50475,"Mikasa volleyball",5,1200,"/sc/volley.jpg"));
        list.add(new Products(50778,"Wilson basketball",5,1500,"/sc/wilson.jpg"));
    }
}
