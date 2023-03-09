package natashalearn.springframework.spring6restmvc.mapper;

import natashalearn.springframework.spring6restmvc.entities.Customer;
import natashalearn.springframework.spring6restmvc.model.CustomerDTO;
import org.mapstruct.Mapper;

@Mapper
public interface CustomerMapper {
    Customer customerDtoToCustomer(CustomerDTO dto);
    CustomerDTO customerToCustomerDto(Customer customer);
}
