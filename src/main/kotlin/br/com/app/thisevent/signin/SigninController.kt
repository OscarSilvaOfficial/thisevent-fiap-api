package br.com.app.thisevent.signin

import br.com.app.thisevent.event.UserServices
import br.com.app.thisevent.user.entities.User
import javax.validation.Valid;
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("signin")
class SigninController(private val service: UserServices) {
  
  
  @PostMapping
  fun signin(@Valid @RequestBody user: User): Any  {
    try {
      return service.getByEmail(user.email)
    } catch (e: Exception) {
      val user = User(email=user.email)
      return service.create(user)
    }
  }
  
}