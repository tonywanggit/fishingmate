package com.fishingmate.infrastructure.config;

import com.mongodb.MongoClientURI;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.MongoDbFactory;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.SimpleMongoDbFactory;
import org.springframework.data.mongodb.core.convert.DefaultDbRefResolver;
import org.springframework.data.mongodb.core.convert.DefaultMongoTypeMapper;
import org.springframework.data.mongodb.core.convert.MappingMongoConverter;
import org.springframework.data.mongodb.core.mapping.MongoMappingContext;

import javax.annotation.Resource;
import java.net.UnknownHostException;

/**
 * Created by tony on 2017/5/17.
 */
@Configuration
public class BeanConfig {

    @Resource
    private MongoClientURI fishingMateMongoUri;

    @Bean
    public MongoTemplate mongoTemplate() throws UnknownHostException {

        MongoDbFactory mongoDbFactory = new SimpleMongoDbFactory(fishingMateMongoUri);

        MappingMongoConverter converter = new MappingMongoConverter(new DefaultDbRefResolver(mongoDbFactory), new MongoMappingContext());
        converter.setTypeMapper(new DefaultMongoTypeMapper(null));

        //设置自定义转换

        return new MongoTemplate(mongoDbFactory, converter);
    }

}











































