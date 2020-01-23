package com.example.crud;
import com.mongodb.DB;
import com.mongodb.MongoClient;

public class DataBase {
    public static void main(String[] args){
        System.out.print("Probando conexión");
        MongoClient mongo = null;
        try{
            mongo = new MongoClient("localhost", 27017);
        }catch(UnknownError e){
            e.printStackTrace();
        }
        if(mongo != null){
            DB db = mongo.getDB("basedatos");

        }
    }
}
