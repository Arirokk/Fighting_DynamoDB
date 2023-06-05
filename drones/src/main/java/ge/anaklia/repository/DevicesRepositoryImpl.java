package ge.anaklia.repository;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBMapper;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBScanExpression;
import com.amazonaws.services.dynamodbv2.datamodeling.PaginatedScanList;
import ge.anaklia.model.Device;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@AllArgsConstructor

public class DevicesRepositoryImpl implements DevicesRepository {

    private final DynamoDBMapper mapper;

    @Override
    public void save() {
        Device device = new Device();
        device.setDevice_name("penetrator");
        mapper.save(device);
    }

    @Override
    public List<Device> findAll() {
        DynamoDBScanExpression scanExpression = new DynamoDBScanExpression();
        return mapper.scan(Device.class, scanExpression);
    }
}
