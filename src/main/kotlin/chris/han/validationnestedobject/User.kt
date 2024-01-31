package chris.han.validationnestedobject

import jakarta.validation.Valid
import jakarta.validation.constraints.Min
import jakarta.validation.constraints.NotBlank

data class User(
  @field:NotBlank(message = "Name must not be blank")
  val name: String,
  @field:Min(value = 18, message = "Age must be at least 18")
  val age: Int,
  @field:Valid val address: List<Address>?
)
data class Address(
  @field:NotBlank(message = "Street must not be blank")
  val street: String,
  @field:NotBlank(message = "City must not be blank")
  val city: String,
  @field:NotBlank(message = "State must not be blank")
  val state: String
)
