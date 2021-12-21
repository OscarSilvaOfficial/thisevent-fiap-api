package br.com.app.thisevent.user

import br.com.app.thisevent.user.entities.User
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface UserRepository : JpaRepository<User, Long> {
  fun findByEmail(email: String): User
}
