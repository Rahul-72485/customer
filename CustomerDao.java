package org.jsp.userbootapp.dao;

import java.util.List;
import java.util.Optional;

import org.jsp.userbootapp.dto.Customer;
import org.jsp.userbootapp.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class CustomerDao {
	@Autowired
	private CustomerRepository repository;

	public Customer saveCustomer(Customer customer) {
		return repository.save(customer);
	}

	public Customer updateUser(Customer customer) {
		return repository.save(customer);
	}

	public Optional<Customer> findCustomer(int id) {
		return repository.findById(id);
	}

	public List<Customer> findAll() {
		return repository.findAll();
	}

	public void deleteCustomer(int id) {
		repository.deleteById(id);
	}

	
}
