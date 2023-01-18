package pl.furman.addressbook.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.furman.addressbook.model.Address;

@Repository
public interface AddressRepository extends JpaRepository<Address, Long> {
}
