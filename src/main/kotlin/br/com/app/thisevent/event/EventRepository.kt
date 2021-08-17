package br.com.app.thisevent.event

import br.com.app.thisevent.event.entities.Event
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository
import javax.transaction.Transactional

@Repository
@Transactional(Transactional.TxType.MANDATORY)
interface EventRepository : JpaRepository<Event, Long>
