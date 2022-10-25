package io.github.prem_sh.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.github.prem_sh.repository.DeviceRepository;
import io.github.prem_sh.models.Device;


@RestController
@RequestMapping("/device")
public class DeviceController {
	@Autowired DeviceRepository deviceRepository;
	
	@GetMapping("/all")
	ResponseEntity<List<Device>> getAllDevices(){
		return new ResponseEntity<List<Device>>(deviceRepository.findAll(), HttpStatus.OK);
	}
	
	@GetMapping("/{id}")
	ResponseEntity<Device> getById(@PathVariable Integer id){
		return new ResponseEntity<Device>(deviceRepository.findById(id).get(), HttpStatus.OK);
	}
	
	@DeleteMapping("/{id}")
	ResponseEntity<String> gdeleteById(@PathVariable Integer id){
		deviceRepository.deleteById(id);
		return new ResponseEntity<String>("deleted", HttpStatus.OK);
	}
	
	@PostMapping("/")
	ResponseEntity<Device> getById(@RequestBody Device device){
		return new ResponseEntity<Device>(deviceRepository.save(device), HttpStatus.OK);
	}
	
	@PutMapping("/{id}")
	ResponseEntity<Device> getById(@RequestBody Device device, @PathVariable Integer id){
		device.setId(id);
		return new ResponseEntity<Device>(deviceRepository.save(device), HttpStatus.OK);
	}
}
