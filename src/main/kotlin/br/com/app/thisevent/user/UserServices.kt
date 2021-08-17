package br.com.app.thisevent.event

import br.com.app.thisevent.user.UserRepository
import br.com.app.thisevent.user.entities.User
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.stereotype.Service

@Service
class UserServices(private val repository: UserRepository){
  fun getAll(): MutableList<User> = repository.findAll()
  
  fun create(user: User) = repository.save(user)
  
  fun getById(id: Long): ResponseEntity<User> = repository.findById(id).map { user -> ResponseEntity.ok(user) }
    .orElse(ResponseEntity.notFound().build())
  
  fun delete(id: Long): ResponseEntity<Void> =
    repository.findById(id).map { user ->
      repository.delete(user)
      ResponseEntity<Void>(HttpStatus.ACCEPTED)
    }.orElse(ResponseEntity.notFound().build())
  
  fun update(id: Long, updated: User) =
    repository.findById(id).map { event ->
      val updated: User =
        event.copy(
          fullname=updated.fullname,
          email=updated.email,
        )
      ResponseEntity.ok().body(repository.save(updated))
    }.orElse(ResponseEntity.notFound().build())
}