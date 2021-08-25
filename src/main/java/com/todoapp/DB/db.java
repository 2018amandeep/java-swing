package com.todoapp.DB;
import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;
import java.util.Iterator;
import java.util.*;
import java.util.ArrayList;


public class db {
    MongoClient mongoClient = new MongoClient("localhost",27017);
    MongoDatabase database= mongoClient.getDatabase("tododb");
    MongoCollection<Document> collection = database.getCollection("new");
 
    public void add(String key, String value)
    {
        collection.insertOne(new Document(key,value));
    }
    public String[] getAllTheDocuments()
    {
        Iterator it = collection.find().iterator();
        int counter=0;
        String[] arr = new String[100];
        while(it.hasNext())
        {
            Document doc = (Document) it.next();
            String s = doc.getString("todo");
            arr[counter] = s;
            counter++;
        }
        return arr;
    }
   
}
