package com.springbootapiexample.repository;

import com.springbootapiexample.entity.ThemeParkRide;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ThemeParkRideRepository extends CrudRepository<ThemeParkRide, Long> {
    List<ThemeParkRide> findByName(String name);
}
