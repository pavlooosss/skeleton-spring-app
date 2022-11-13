package skeleton.spring.app.db.repositories

import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository
import skeleton.spring.app.db.models.Customer

@Repository
interface CustomerRepository: CrudRepository<Customer, Long>
