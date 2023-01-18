package pl.furman.addressbook.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import pl.furman.addressbook.model.Address;
import pl.furman.addressbook.service.AddressService;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api")
public class AddressController {
    private final AddressService addressService;
    @GetMapping("/addresses")
    public List<Address> getAddresses(){
        return addressService.getPosts();
    }

    @GetMapping("/addresses/{id}")
    public Address getSingleAddress(@PathVariable long id){
        return addressService.getSinglePost(id);
    }

    @PostMapping("/addresses")
    public Address postAddress(@RequestBody Address address) {
        return addressService.postAddress(address);
    }

}
