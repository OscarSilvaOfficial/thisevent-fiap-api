package br.com.app.thisevent.user.entities

import com.fasterxml.jackson.annotation.JsonIgnore
import javax.persistence.*

@Entity
@Table(name = "users")
data class User(
  
  @Id
  @GeneratedValue(strategy= GenerationType.IDENTITY)
  @JsonIgnore
  val id: Long,
  val fullname: String,
  val email: String,
  var password: String

)