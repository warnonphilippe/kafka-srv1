package be.phw.kafka.srv1.config;

import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Source;
import be.phw.kafka.srv1.messaging.ConsumerChannel;
import be.phw.kafka.srv1.messaging.ProducerChannel;

/**
 * Configures Spring Cloud Stream support.
 *
 * See http://docs.spring.io/spring-cloud-stream/docs/current/reference/htmlsingle/
 * for more information.
 */
//ProducerChannel.class, ConsumerChannel.class
@EnableBinding(value = {Source.class, ConsumerChannel.class, ProducerChannel.class})
public class MessagingConfiguration {

}
