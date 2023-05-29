package ge.anaklia.configuration;

import com.amazonaws.client.builder.AwsClientBuilder;
import com.amazonaws.regions.Regions;
import com.amazonaws.services.dynamodbv2.AmazonDynamoDB;
import com.amazonaws.services.dynamodbv2.AmazonDynamoDBClient;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBMapper;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBMapperConfig;
import ge.anaklia.configuration.properties.DynamoDBProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DynamoDBConfig {

    @Bean
    public DynamoDBMapper dynamoDBMapper(DynamoDBProperties properties) {
        var endpointConfiguration = new AwsClientBuilder.EndpointConfiguration(
            properties
                .getEndpoint(),
            Regions.US_EAST_1
                .getName());

        AmazonDynamoDB amazonDynamoDB = AmazonDynamoDBClient.builder()
            .withEndpointConfiguration(endpointConfiguration)
            .build();

        DynamoDBMapperConfig config = DynamoDBMapperConfig.builder()
            .withSaveBehavior(DynamoDBMapperConfig.SaveBehavior.UPDATE)
            .withConsistentReads(DynamoDBMapperConfig.ConsistentReads.CONSISTENT)
            .build();

        return new DynamoDBMapper(amazonDynamoDB, config);
    }

}
