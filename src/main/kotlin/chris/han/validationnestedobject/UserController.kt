package chris.han.validationnestedobject

import jakarta.validation.Valid
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

@RestController
class UserController {
  @PostMapping("/users")
  fun createUser(
    @Valid
    @RequestBody user: User
  ): User {
    return user
  }
}
