package com.geekster.MappingPractice.repositories;

import com.geekster.MappingPractice.model.Address;
import org.springframework.data.jpa.repository.JpaRepository;


public interface IAddressRepo extends JpaRepository<Address,String> {
}
