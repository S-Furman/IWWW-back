package pl.furman.addressbook.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pl.furman.addressbook.model.Address;
import pl.furman.addressbook.repository.AddressRepository;

import java.util.List;
@Service
@RequiredArgsConstructor
public class AddressService {
    private final AddressRepository addressRepository;
    public List<Address> getPosts() {
        return addressRepository.findAll();
    }

    public Address postAddress(Address address) {
        System.out.println(address);
        return addressRepository.save(address);
    }

    public void deleteAddress(Long id) {
        addressRepository.deleteById(id);
    }
}
