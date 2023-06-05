package ge.anaklia.repository;

import ge.anaklia.model.Device;

import java.util.List;

public interface DevicesRepository {
    public void save();
    public List<Device> findAll();
}
