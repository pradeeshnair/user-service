package tech.tm7.config;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.config.AbstractMongoClientConfiguration;

/**
 * MongoConfig
 */
@Configuration
public class MongoConfig extends AbstractMongoClientConfiguration {

    @Override
    public MongoClient mongoClient() {
        // Add Mongo url
        return MongoClients.create("mongodb+srv://<username>:<password>@<clusterurl>/test?retryWrites=true&w=majority");
    }

    @Override
    protected String getDatabaseName() {
        return "test";
    }

}