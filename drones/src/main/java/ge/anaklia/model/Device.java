package ge.anaklia.model;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBHashKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTable;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@DynamoDBTable(tableName = "devices-list")
public class Device {

    @DynamoDBHashKey
    private String device_name;
}
