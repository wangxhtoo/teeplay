package org.teeplay.mongo;

import java.net.UnknownHostException;

import org.teeplay.util.TeeUtil;

import com.mongodb.DB;
import com.mongodb.Mongo;
import com.mongodb.MongoException;
import com.mongodb.MongoOptions;
import com.mongodb.ServerAddress;

public class MongoDBConnection {
	
	private static Mongo mongo;
	
	private MongoDBConnection(){
		
	}
	
	public static Mongo getMongo(){
		ServerAddress address;
		MongoOptions options;
		if(mongo == null){
			try {
				address = new ServerAddress(TeeUtil.MASTER_MONGO_DB_HOST);
				options = new MongoOptions();
				/**
				 * 是否连接自动重试
				 */
				options.autoConnectRetry = true;
				
				/**
				 * 连接数
				 */
				options.connectionsPerHost = 100;
				
				/**
				 * 连接超时时间
				 */
				options.connectTimeout = 30000;
				/**
				 * 最大等待时间
				 */
				options.maxWaitTime = 120000;
				/**
				 * 保持连接
				 */
				options.socketKeepAlive = true ;
				/**
				 * 0，不限时间
				 */
				options.socketTimeout = 0;
				/**
				 * 最大重试时间，单位秒
				 */
				options.maxAutoConnectRetryTime = 1;
				
				options.threadsAllowedToBlockForConnectionMultiplier = 50;
				
				mongo = new Mongo(address,options);
			} catch (UnknownHostException e) {
				e.printStackTrace();
			} catch (MongoException e) {
				e.printStackTrace();
			}
		}
		return mongo;
	}

	public static DB getDB(String dbname){
		return MongoDBConnection.getMongo().getDB(dbname);
	}
}
