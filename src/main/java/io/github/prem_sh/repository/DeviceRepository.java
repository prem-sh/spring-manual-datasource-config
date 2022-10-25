package io.github.prem_sh.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import io.github.prem_sh.models.Device;

public interface DeviceRepository extends JpaRepository<Device, Integer>{

}
