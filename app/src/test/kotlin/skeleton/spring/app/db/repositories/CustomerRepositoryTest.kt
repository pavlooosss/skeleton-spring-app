package skeleton.spring.app.db.repositories

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.ActiveProfiles
import skeleton.spring.app.db.models.Customer

import org.junit.jupiter.api.Assertions.assertNotNull
import org.springframework.beans.factory.annotation.Autowired

@SpringBootTest
@ActiveProfiles("test")

class CustomerRepositoryTest(
) {
    @Autowired
    private lateinit var customerRepository: CustomerRepository

    @Test
    fun `successfully create customer`() {
        val customerToSave = Customer(name = "Customer to save")
        val newCustomer = customerRepository.save(customerToSave)
        assertNotNull(newCustomer.id)
        assertEquals(customerToSave.createdAt, newCustomer.createdAt, "created date should be equals")
    }

}