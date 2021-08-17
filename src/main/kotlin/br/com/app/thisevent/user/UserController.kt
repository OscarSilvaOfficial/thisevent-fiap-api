package br.com.app.thisevent.user

import br.com.app.thisevent.event.UserServices
import br.com.app.thisevent.user.entities.User
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("users")
class UserController(private val service: UserServices) {

  @GetMapping
  fun getUsers(): MutableList<User> = service.getAll()
  
  @GetMapping("/{id}")
  fun getUser(@PathVariable(value="id") id: Long) =  service.getById(id)
  
  @PostMapping
  fun createUser(@RequestBody user: User) = service.create(user)
  
  @PutMapping("/{id}")
  fun updateUser(@PathVariable(value="id") id: Long, @RequestBody updatedUser: User) =
    service.update(id, updatedUser)
  
  @DeleteMapping("/{id}")
  fun deleteUser(@PathVariable(value="id") id: Long) = service.delete(id)
  
}