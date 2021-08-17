package br.com.app.thisevent.event

import br.com.app.thisevent.event.entities.Event
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.stereotype.Service

@Service
class EventServices(private val repository: EventRepository){
  fun getAllEvents(): MutableList<Event> = repository.findAll()
  
  fun addEvent(event: Event) = repository.save(event)
  
  fun getEventById(id: Long): ResponseEntity<Event> = repository.findById(id).map { event -> ResponseEntity.ok(event) }
    .orElse(ResponseEntity.notFound().build())
  
  fun deleteTask(id: Long): ResponseEntity<Void> =
    repository.findById(id).map { event ->
      repository.delete(event)
      ResponseEntity<Void>(HttpStatus.ACCEPTED)
    }.orElse(ResponseEntity.notFound().build())
  
  fun putTask(id: Long, updatedEvent: Event): ResponseEntity<Event> =
    repository.findById(id).map { event ->
      val updatedTask: Event =
        event.copy(
          name = updatedEvent.name,
          date = updatedEvent.date
        )
      ResponseEntity.ok().body(repository.save(updatedTask))
    }.orElse(ResponseEntity.notFound().build())
}