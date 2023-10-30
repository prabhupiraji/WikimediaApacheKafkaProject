package org.Kafka.wikimedia.producer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages ="org.Kafks.wikimedia.producer")
public class SpringbootKafkawikimediaProducerapplication implements CommandLineRunner{
    public static void main( String[] args )
    {
        System.out.println( "Hello World inside producer main entry" );
        SpringApplication.run(SpringbootKafkawikimediaProducerapplication.class);
    }
    @Autowired
    private wikimediachangesproducer wikimediaChangesProducer;
    
    @Override
    public void run(String... args) throws Exception {
        wikimediaChangesProducer.sendMessage();
    }

}
