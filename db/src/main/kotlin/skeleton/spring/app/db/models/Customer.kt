package skeleton.spring.app.db.models

import org.springframework.data.annotation.CreatedDate
import org.springframework.data.annotation.Id
import org.springframework.data.relational.core.mapping.Table
import java.time.Instant

@Table("CUSTOMERS")
data class Customer(
    @Id
    val id: Long? = null,
    val name: String,
    @CreatedDate
    val createdAt: Instant = Instant.now()
) {
}