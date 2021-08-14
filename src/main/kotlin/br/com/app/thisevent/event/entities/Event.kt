package br.com.app.thisevent.event.entities

import javax.persistence.*

@Entity
data class Event (
  
  @Id
  @GeneratedValue(strategy=GenerationType.IDENTITY)
  val id: Long,
  val name: String,
  val date: String,

)
