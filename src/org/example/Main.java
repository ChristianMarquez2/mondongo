
package org.example;

import com.mongodb.client.*;
import com.mongodb.client.MongoCollection;
import org.bson.Document;
import com.mongodb.client.result.UpdateResult;
import com.mongodb.client.result.DeleteResult;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.MongoCollection;
import org.bson.Document;
import com.mongodb.client.FindIterable;
import com.mongodb.client.result.UpdateResult;
import com.mongodb.client.result.DeleteResult;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        try (MongoClient mongoClient = MongoClients.create("mongodb://localhost:27017")) {
            MongoDatabase database = mongoClient.getDatabase("miBaseDeDatos");
            MongoCollection<Document> collection = database.getCollection("miColeccion");
            Document documento = new Document("nombre", "Azazel")
                    .append("apellido", "NAITSIRHC")
                    .append("edad", 21);
            collection.insertOne(documento);
            System.out.println("Documento insertado con éxito");
        }
    }
}