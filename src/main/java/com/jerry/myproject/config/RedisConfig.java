package com.jerry.myproject.config;


/**
 * @author Jerry
 * @Description
 * @createTime 2021年02月25日 15:51:00
 */
//@Configurable
public class RedisConfig {

//
//    @Bean
//    public RedisTemplate<String, Object> redisTemplate(RedisConnectionFactory connectionFactory) {
//        RedisTemplate<String, Object> redisTemplate = new RedisTemplate<>();
//        redisTemplate.setConnectionFactory(connectionFactory);
//        //Use Jackson 2Json RedisSerializer to serialize and deserialize the value of redis (default JDK serialization)
//        //json序列化
//        Jackson2JsonRedisSerializer jackson2JsonRedisSerializer = new Jackson2JsonRedisSerializer(Object.class);
//        ObjectMapper objectMapper = new ObjectMapper();
//        objectMapper.setVisibility(PropertyAccessor.ALL, JsonAutoDetect.Visibility.ANY);
//        //将类名称序列化到json串中，去掉会导致得出来的的是LinkedHashMap对象，直接转换实体对象会失败
//        objectMapper.enableDefaultTyping(ObjectMapper.DefaultTyping.NON_FINAL);
//        //设置输入时忽略JSON字符串中存在而Java对象实际没有的属性
//        objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
//        jackson2JsonRedisSerializer.setObjectMapper(objectMapper);
//
//        //Use String RedisSerializer to serialize and deserialize the key value of redis
//        //string序列化
//        RedisSerializer redisSerializer = new StringRedisSerializer();
//        //key
//        redisTemplate.setKeySerializer(redisSerializer);
//        redisTemplate.setHashKeySerializer(redisSerializer);
//        //value
//        redisTemplate.setValueSerializer(jackson2JsonRedisSerializer);
//        redisTemplate.setHashValueSerializer(jackson2JsonRedisSerializer);
//
//        redisTemplate.afterPropertiesSet();
//        return redisTemplate;
//
//    }

}
