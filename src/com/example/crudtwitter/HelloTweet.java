package com.example.crudtwitter;

import com.datastax.driver.core.Cluster;
import com.datastax.driver.core.Session;
import com.datastax.driver.core.ResultSet;
import com.datastax.driver.core.Row;

public class HelloTweet {

    public static void main(String[] args) {
        System.out.println("HelloTweet!");

        Cluster cluster = null;

        try {
            cluster = Cluster.builder().addContactPoint("localhost").build();

            Session session = cluster.connect();

            ResultSet rs = session.execute("Select release_version from system.local");
            Row row = rs.one();
            System.out.println(row.getString("release_version"));

            KeyspaceRepository sr = new KeyspaceRepository(session);

            //Cria keyspace
            sr.createKeyspace("library", "SimpleStrategy", 1);
            System.out.println("Create repository");

            sr.useKeyspace("library");
            System.out.println("Using repository library");

            // Cria tabela tweets
            TweetRepository tweets = new TweetRepository(session);
            tweets.createTable();
            System.out.println("Create table tweets");

            // TODO: Change to use twitter4j api to get real tweets
            for (int i = 0; i < 5; i++) {
                Tweet tw = new Tweet("id" + i,"User_" + i, "Message_" + i);
                tweets.insertTweet(tw);
                System.out.println("Inserted tweet");
            }

            tweets.selectAll(); // Apresenta todas as tuplas
            tweets.deleteTweet("id2"); // Deleta um tweet da tabela
            tweets.selectAll();

            tweets.deleteTable("tweets");
            System.out.println("Deleted tweets");

            sr.deleteKeyspace("library");
            System.out.println("Delete keyspace library");

        } finally {
            if (cluster != null) cluster.close();
        }

    }

}

