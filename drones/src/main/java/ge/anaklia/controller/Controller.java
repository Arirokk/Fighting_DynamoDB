package ge.anaklia.controller;

import ge.anaklia.model.Device;
import ge.anaklia.repository.DevicesRepository;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/")
public class Controller {

    private final DevicesRepository devicesRepositoryImpl;

    @GetMapping("/save")
    public void save() {
        devicesRepositoryImpl.save();
    }
    @GetMapping("/get")
    public ResponseEntity<List<Device>> findAll() {
        return new ResponseEntity<>(devicesRepositoryImpl.findAll(), HttpStatus.OK);
    }
}
