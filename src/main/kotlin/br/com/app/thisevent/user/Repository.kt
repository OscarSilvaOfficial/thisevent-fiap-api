package br.com.app.thisevent.user

import br.com.app.thisevent.user.entities.User
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository
import javax.transaction.Transactional

@Repository
@Transactional(Transactional.TxType.MANDATORY)
interface Repository : JpaRepository<User, Long>