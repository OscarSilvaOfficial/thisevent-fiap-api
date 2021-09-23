package br.com.app.thisevent.user.entities

import javax.persistence.*

@Entity
@Table(name = "users")
data class User(@Column(unique = true) val email: String) {
  
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  val id: Long = 0
  
}