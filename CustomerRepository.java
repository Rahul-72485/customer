package org.jsp.userbootapp.repository;

import java.util.Optional;

import org.jsp.userbootapp.dto.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {

	
}
