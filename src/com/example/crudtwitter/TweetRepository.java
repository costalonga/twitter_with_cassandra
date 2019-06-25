package com.example.crudtwitter;

import java.util.ArrayList;
import java.util.List;
import com.datastax.driver.core.Session;
import com.datastax.driver.core.ResultSet;
import com.datastax.driver.core.Row;

public class TweetRepository {

    private static final String TABLE_NAME = "tweets";
    private Session session;

    public TweetRepository(Session session) {this.session = session;}

    // Criar tabela tweets
    public void createTable() {
        System.out.println("\tcreateTable - init");
        StringBuilder sb = new StringBuilder("CREATE TABLE IF NOT EXISTS ")
                .append(TABLE_NAME).append("(")
                .append("id text PRIMARY KEY, ")
                .append("user text,")
                .append("message text);");
//                .append("createdAt text,")
//                .append("language text,")
//                .append("source text);");

        final String query = sb.toString();
        session.execute(query);
        System.out.println("\tcreateTable - end");
    }

    // Inserir uma tupla na tabela tweets
    // @param tweet
    public void insertTweet(Tweet tweet) {
        System.out.println("\tinsertTweet - init");
        StringBuilder sb = new StringBuilder("INSERT INTO ")
                .append(TABLE_NAME).append("(id, user, message) ")
                .append("VALUES (").append(tweet.getId()).append(", '")
                .append(tweet.getUser()).append("', '")
                .append(tweet.getMessage()).append("');");

        System.out.println("\tinsertTweet - end");
        final String query = sb.toString();
        session.execute(query);
    }

    // Apresentar todas as tuplas da tabela tweets
    // @return
    public List<Tweet> selectAll() {
        System.out.println("\tselectAll - init");
        StringBuilder sb = new StringBuilder("SELECT * FROM ").append(TABLE_NAME);

        final String query = sb.toString();
        ResultSet rs = session.execute(query);

        List<Tweet> tweets = new ArrayList<Tweet>();

        for (Row r : rs) {
            Tweet tw = new Tweet(r.getString("id"),
                    r.getString("user"),
                    r.getString("message"));

            System.out.println("Id = " + r.getString("id") + ", "
                    + r.getString("user")
                    + r.getString("message"));

            tweets.add(tw);
        }
        System.out.println("\tselectAll - end");
        return tweets;
    }

    // Apagar uma determinada tupla
    public void deleteTweet(String id) {
        System.out.println("\tdeleteTweet - init");
        StringBuilder sb = new StringBuilder("DELETE FROM ")
                .append(TABLE_NAME)
                .append(" WHERE id = '")
                .append(id).append("';");

        final String query = sb.toString();
        session.execute(query);
        System.out.println("\tdeleteTweet - end");
    }

    // Drop tabela tweets
    //@param tableName the name of the table to delete
    public void deleteTable(String tableName) {
        System.out.println("\tdeleteTable - init");
        StringBuilder sb = new StringBuilder("DROP TABLE IF EXISTS ").append(tableName);

        final String query = sb.toString();
        session.execute(query);
        System.out.println("\tdeleteTable - end");
    }
}

