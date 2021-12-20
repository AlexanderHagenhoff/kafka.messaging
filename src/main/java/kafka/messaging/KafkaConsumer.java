package kafka.messaging;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Retention(RUNTIME)
@Target(value = {METHOD})
public @interface KafkaConsumer {

    String kafkaTopic() default "";

    boolean asynchronous() default false;
}
