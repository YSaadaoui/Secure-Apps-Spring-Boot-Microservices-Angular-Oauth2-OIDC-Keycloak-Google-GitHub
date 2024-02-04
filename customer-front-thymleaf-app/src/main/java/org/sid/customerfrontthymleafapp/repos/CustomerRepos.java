package org.sid.customerfrontthymleafapp.repos;

import org.sid.customerfrontthymleafapp.entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepos extends JpaRepository<Customer,Long> {
}
