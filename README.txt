# twitter_with_cassandra


/home/treinamento/Downloads/jdk-12.0.1/bin/java -Didea.launcher.port=33595 -Didea.launcher.bin.path=/opt/idea-IC-182.4129.33/bin -Dfile.encoding=UTF-8 -classpath /home/treinamento/IdeaProjects/cassandra_with_twitter/target/classes:/home/treinamento/.m2/repository/com/datastax/cassandra/cassandra-driver-core/3.7.1/cassandra-driver-core-3.7.1.jar:/home/treinamento/.m2/repository/io/netty/netty-handler/4.0.56.Final/netty-handler-4.0.56.Final.jar:/home/treinamento/.m2/repository/io/netty/netty-buffer/4.0.56.Final/netty-buffer-4.0.56.Final.jar:/home/treinamento/.m2/repository/io/netty/netty-common/4.0.56.Final/netty-common-4.0.56.Final.jar:/home/treinamento/.m2/repository/io/netty/netty-transport/4.0.56.Final/netty-transport-4.0.56.Final.jar:/home/treinamento/.m2/repository/io/netty/netty-codec/4.0.56.Final/netty-codec-4.0.56.Final.jar:/home/treinamento/.m2/repository/com/google/guava/guava/19.0/guava-19.0.jar:/home/treinamento/.m2/repository/io/dropwizard/metrics/metrics-core/3.2.2/metrics-core-3.2.2.jar:/home/treinamento/.m2/repository/org/slf4j/slf4j-api/1.7.25/slf4j-api-1.7.25.jar:/home/treinamento/.m2/repository/com/github/jnr/jnr-ffi/2.1.7/jnr-ffi-2.1.7.jar:/home/treinamento/.m2/repository/com/github/jnr/jffi/1.2.16/jffi-1.2.16.jar:/home/treinamento/.m2/repository/org/ow2/asm/asm/5.0.3/asm-5.0.3.jar:/home/treinamento/.m2/repository/org/ow2/asm/asm-commons/5.0.3/asm-commons-5.0.3.jar:/home/treinamento/.m2/repository/org/ow2/asm/asm-analysis/5.0.3/asm-analysis-5.0.3.jar:/home/treinamento/.m2/repository/org/ow2/asm/asm-tree/5.0.3/asm-tree-5.0.3.jar:/home/treinamento/.m2/repository/org/ow2/asm/asm-util/5.0.3/asm-util-5.0.3.jar:/home/treinamento/.m2/repository/com/github/jnr/jnr-x86asm/1.0.2/jnr-x86asm-1.0.2.jar:/home/treinamento/.m2/repository/com/github/jnr/jnr-posix/3.0.44/jnr-posix-3.0.44.jar:/home/treinamento/.m2/repository/com/github/jnr/jnr-constants/0.9.9/jnr-constants-0.9.9.jar:/home/treinamento/.m2/repository/org/twitter4j/twitter4j-stream/4.0.6/twitter4j-stream-4.0.6.jar:/home/treinamento/.m2/repository/org/twitter4j/twitter4j-core/4.0.6/twitter4j-core-4.0.6.jar:/opt/idea-IC-182.4129.33/lib/idea_rt.jar com.intellij.rt.execution.application.AppMainV2 com.example.crudtwitter.HelloTweet
HelloTweet!
SLF4J: Failed to load class "org.slf4j.impl.StaticLoggerBinder".
SLF4J: Defaulting to no-operation (NOP) logger implementation
SLF4J: See http://www.slf4j.org/codes.html#StaticLoggerBinder for further details.
3.11.4
createKeyspace - init
createKeyspace - end
Create repository
useKeyspace - init
useKeyspace - end
Using repository library
	createTable - init
	createTable - command: CREATE TABLE IF NOT EXISTS tweets(id bigint PRIMARY KEY, CreatedDate text,Content text,Source text,IsTruncated text,Latitude text,Longitude text,IsFavorited text,UserName text,Contributors text,Language text);
	createTable - end

Create table tweets
	createTableTweetsByLang - init
	createTableTweetsByLang - command: CREATE TABLE IF NOT EXISTS tweetsByLang(id bigint, content text,userName text,language text,PRIMARY KEY (id, language));
	createTableTweetsByLang - end

Create table tweetsByLang - step 2
	insertTweet - init
	insertTweet - command: INSERT INTO tweets(id, content, latitude, longitude, userName, language) VALUES (0, 'Message_0', 'lat0', 'lon0', 'User_0', 'BR');
	insertTweet - end

	insertTweetsByLang - init
	insertTweetsByLang - command: INSERT INTO tweetsByLang(id, content, userName, language) VALUES (0, 'Message_0', 'User_0', 'BR');
	insertTweetsByLang - end

Inserted tweet in tables
	insertTweet - init
	insertTweet - command: INSERT INTO tweets(id, content, latitude, longitude, userName, language) VALUES (1, 'Message_1', 'lat1', 'lon1', 'User_1', 'US');
	insertTweet - end

	insertTweetsByLang - init
	insertTweetsByLang - command: INSERT INTO tweetsByLang(id, content, userName, language) VALUES (1, 'Message_1', 'User_1', 'US');
	insertTweetsByLang - end

Inserted tweet in tables
	insertTweet - init
	insertTweet - command: INSERT INTO tweets(id, content, latitude, longitude, userName, language) VALUES (2, 'Message_2', 'lat2', 'lon2', 'User_2', 'ES');
	insertTweet - end

	insertTweetsByLang - init
	insertTweetsByLang - command: INSERT INTO tweetsByLang(id, content, userName, language) VALUES (2, 'Message_2', 'User_2', 'ES');
	insertTweetsByLang - end

Inserted tweet in tables
	insertTweet - init
	insertTweet - command: INSERT INTO tweets(id, content, latitude, longitude, userName, language) VALUES (3, 'Message_3', 'lat3', 'lon3', 'User_3', 'BR');
	insertTweet - end

	insertTweetsByLang - init
	insertTweetsByLang - command: INSERT INTO tweetsByLang(id, content, userName, language) VALUES (3, 'Message_3', 'User_3', 'BR');
	insertTweetsByLang - end

Inserted tweet in tables
	insertTweet - init
	insertTweet - command: INSERT INTO tweets(id, content, latitude, longitude, userName, language) VALUES (4, 'Message_4', 'lat4', 'lon4', 'User_4', 'US');
	insertTweet - end

	insertTweetsByLang - init
	insertTweetsByLang - command: INSERT INTO tweetsByLang(id, content, userName, language) VALUES (4, 'Message_4', 'User_4', 'US');
	insertTweetsByLang - end

Inserted tweet in tables
	selectAll - init
	selectAll - command: SELECT * FROM tweets
		Id = 2, Message = Message_2, Latitude = lat2, Longitude = lon2, User = User_2, Language = ES
		Id = 3, Message = Message_3, Latitude = lat3, Longitude = lon3, User = User_3, Language = BR
		Id = 4, Message = Message_4, Latitude = lat4, Longitude = lon4, User = User_4, Language = US
		Id = 0, Message = Message_0, Latitude = lat0, Longitude = lon0, User = User_0, Language = BR
		Id = 1, Message = Message_1, Latitude = lat1, Longitude = lon1, User = User_1, Language = US
	selectAll - end

	selectAllTweetsByLang - init
	selectAllTweetsByLang - command: SELECT * FROM tweetsByLang
		Id = 2, Message = Message_2, User = User_2, Language = ES
		Id = 3, Message = Message_3, User = User_3, Language = BR
		Id = 4, Message = Message_4, User = User_4, Language = US
		Id = 0, Message = Message_0, User = User_0, Language = BR
		Id = 1, Message = Message_1, User = User_1, Language = US
	selectAllTweetsByLang - end

	deleteTweet - init
	deleteTweet - command: DELETE FROM tweets WHERE id = 2;
	deleteTweet - end

	selectAll - init
	selectAll - command: SELECT * FROM tweets
		Id = 3, Message = Message_3, Latitude = lat3, Longitude = lon3, User = User_3, Language = BR
		Id = 4, Message = Message_4, Latitude = lat4, Longitude = lon4, User = User_4, Language = US
		Id = 0, Message = Message_0, Latitude = lat0, Longitude = lon0, User = User_0, Language = BR
		Id = 1, Message = Message_1, Latitude = lat1, Longitude = lon1, User = User_1, Language = US
	selectAll - end

	selectAllTweetsByLang - init
	selectAllTweetsByLang - command: SELECT * FROM tweetsByLang
		Id = 2, Message = Message_2, User = User_2, Language = ES
		Id = 3, Message = Message_3, User = User_3, Language = BR
		Id = 4, Message = Message_4, User = User_4, Language = US
		Id = 0, Message = Message_0, User = User_0, Language = BR
		Id = 1, Message = Message_1, User = User_1, Language = US
	selectAllTweetsByLang - end

	deleteTable - init
	deleteTable - command: DROP TABLE IF EXISTS tweets
	deleteTable - end

Deleted tweets
deleteKeyspace - init
deleteKeyspace - end
Delete keyspace library

Process finished with exit code 0
