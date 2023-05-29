package ge.anaklia.configuration.properties;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.validation.annotation.Validated;

@Configuration
@ConfigurationProperties(prefix = "aws.dynamodb")
@Data
@Validated
public class DynamoDBProperties {

    String endpoint;
}
