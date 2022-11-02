/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pedrapapeltesoura;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;
import com.mongodb.client.model.Updates;
import java.net.UnknownHostException;
import org.bson.Document;

/*
public class Conectar {
    public void getValues(){
        System.out.println("getValues");
        //conexão com a porta do mongo
        MongoClient mongo = new MongoClient("localhost", 27017);
        //27017 é a porta do mongo
        //objeto db que busca o banco cliente
        MongoDatabase db = mongo.getDatabase("usuarios");
        //objeto que busca a collection cadastro, chamado de docs
        MongoCollection<Document> docs = db.getCollection("registrados");
        //"varre" a collection mostrando os itens que estão nela, os seus
        for (Document doc : docs.find()){
            System.out.println("item: " + doc);
        }
        //mostra que deu tudo certo
        System.out.println("getValues ok");
    }
    
    public void insertValues() {
        System.out.println("insertValues");
        //conexão mongo
        MongoClient mongo = new MongoClient("localhost", 27017);
        MongoDatabase db = mongo.getDatabase("usuarios");
        MongoCollection<Document> docs = db.getCollection("registros");
        
        Entrada user = createUser();//cria um user obj da classe conectar, chamando o método createUser() - logo abaixo
        
        Document doc = createDocument(user);//cria um doc que referencia o conteúdo de user do createDocument()
        //obs: o banco só entende objetos do tipo Document
        
        docs.insertOne(doc);//insere no mongo o conteúdo de doc
        System.out.println("insertValues ok");
    }
    
    public Entrada createUser() {
        //esse método deve ser uma entrada externa (Interface, Scanner ou JOptionPanel)
        Entrada u = new Entrada();
        u.setId(id);
        u.setEmail(email);
        u.setUsuario(usuario);
        u.setSenha(senha);
        return u;
    }
    
    public Document createDocument(Entrada user){
        Document docBuilder = new Document();
        docBuilder.append("id", user.getId());
        docBuilder.append("email", user.getEmail());
        docBuilder.append("usuario", user.getUsuario());
        docBuilder.append("senha", user.getSenha());
        return docBuilder;
    }
    
    public void updateValues(){
        System.out.println("updateValues");
        Entrada user = createUser();
        MongoClient mongo = new MongoClient("localhost", 27017);
        
        MongoDatabase db = mongo.getDatabase("usuarios");
        MongoCollection<Document> docs = db.getCollection("registros");
        docs.updateOne(Filters.eq("_id", 2),
            Updates.set("email", "teste@gmail.com"));
        System.out.println("Documento teve sucesso no update");
        for(Document doc : docs.find()){
            System.out.println("item update: " + doc);
        }
        }
        
        public void deleteValues(){
            System.out.println("deleteValues");
            Entrada user = createUser();
            MongoClient mongo = new MongoClient("localhost", 27017);
            
            
            MongoDatabase db = mongo.getDatabase("usuarios");
            MongoCollection<Document> docs = db.getCollection("registros");
            
            docs.deleteOne(Filters.eq("_id", 2));
            System.out.println("Documento teve sucesso no delete");
            for(Document doc : docs.find()){
                System.out.println("item update: "+doc);
            }
        }
    
    
}*/
public class Conectar {


    BasicDBObject document = new BasicDBObject();


    public void insertValues(Entrada u) {

        System.out.println("insertValues");

        MongoClient mongo = new MongoClient("localhost", 27017);

        MongoDatabase db = mongo.getDatabase("basedados");

        MongoCollection<Document> docs = db.getCollection("teste");

        Entrada registro = inserir(u);

        Document doc = createDocument(registro);

        docs.insertOne(doc);

        System.out.println("insertValues ok");

    }

    public void getValues() {

        System.out.println("getValues");

        try (
                 MongoClient mongo = new MongoClient("localhost", 27017)) {

            MongoDatabase db = mongo.getDatabase("basedados");

            MongoCollection<Document> docs = db.getCollection("teste");

            for (Document doc : docs.find()) {

                System.out.println("item: " + doc);

            }

        }

        System.out.println("getValues ok");

    }

    public Entrada inserir(Entrada u) {
        u.setEmail(u.getEmail());
        //colecao.insert(document);
        u.setUsuario(u.getUsuario());
        //colecao.insert(document);
        u.setSenha(u.getSenha());
        //colecao.insert(document);
        return u;
    }

    
    public Document createDocument(Entrada user) {

        Document docBuilder = new Document();

        docBuilder.append("email", user.getEmail());

        docBuilder.append("usuario", user.getUsuario());

        docBuilder.append("senha", user.getSenha());

        return docBuilder;

    }

}
