package org.teeplay.mongo;

import java.util.List;

import com.google.code.morphia.Datastore;
import com.google.code.morphia.Morphia;
import com.google.code.morphia.query.Query;
import com.google.code.morphia.query.UpdateOperations;

public class MongoBaseDao<T> {
	
	private Datastore ds;
	
	private String dbName = "tee";
	
	public MongoBaseDao() {
		Morphia morphia = new Morphia();
		ds = morphia.createDatastore(MongoDBConnection.getMongo(), dbName);
	}

	public MongoBaseDao(String dbname) {
		Morphia morphia = new Morphia();
		ds = morphia.createDatastore(MongoDBConnection.getMongo(), dbname);
	}
	
	public void add(T t){
		ds.save(t);
	}
	
	public void delete(T t){
		ds.delete(t);
	}
	
	public void deleteQuery(Query<T> query){
		ds.delete(query);
	}
	public int update(T t,UpdateOperations<T> op){
		return ds.update(t, op).getUpdatedCount();
	}
	
	public void update(Query<T> query, UpdateOperations<T> op){
		ds.update(query, op);
	}
	
	public List<T> query(Query<T> query){
		return query.asList();
	}
	public Datastore getDS(){
		return ds;
	}
}
