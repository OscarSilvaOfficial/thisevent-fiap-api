package br.com.app.thisevent.user

import br.com.app.thisevent.user.entities.User
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class Services {
  
  @Autowired
  private lateinit var repository: Repository
  
  fun create(user: User): User {
    return repository.save(user)
  }
  
}