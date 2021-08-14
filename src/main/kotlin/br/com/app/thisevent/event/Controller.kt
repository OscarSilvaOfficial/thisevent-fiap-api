package br.com.app.thisevent.event

import br.com.app.thisevent.event.entities.Event
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("events")
class Controller(private val service: Services) {

  @GetMapping
  fun getEvents(): MutableList<Event> = service.getAllEvents()
  
  @GetMapping("/{id}")
  fun getEventById(@PathVariable(value="id") id: Long) =  service.getEventById(id)
  
  @PostMapping
  fun postEvent(@RequestBody event: Event) = service.addEvent(event)
  
  @PutMapping("/{id}")
  fun updateEvent(@PathVariable(value="id") id: Long, @RequestBody updatedEvent: Event) =
    service.putTask(id, updatedEvent)
  
  @DeleteMapping("/{id}")
  fun deleteEvent(@PathVariable(value="id") id: Long) =
    service.deleteTask(id)
  
}