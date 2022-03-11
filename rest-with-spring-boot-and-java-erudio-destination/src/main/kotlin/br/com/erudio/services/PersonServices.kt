package br.com.erudio.services

import br.com.erudio.exception.ResourceNotFoundException
import br.com.erudio.model.Person
import br.com.erudio.repository.PersonRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class PersonServices {

    @Autowired
    private lateinit var repository: PersonRepository

    fun create(person: Person): Person = repository.save(person)

    fun findAll(): List<Person> = repository.findAll()

    fun findById(id: Long): Person =
        repository.findById(id)
            .orElseThrow { ResourceNotFoundException("No records found for this ID") }

    fun update(person: Person): Person {
        val entity: Person = repository.findById(person.id!!)
            .orElseThrow { ResourceNotFoundException("No records found for this ID") }
        entity.firstName = person.firstName
        entity.lastName = person.lastName
        entity.address = person.address
        entity.gender = person.gender
        return repository.save(entity)
    }

    fun delete(id: Long) {
        val entity: Person = repository.findById(id)
            .orElseThrow { ResourceNotFoundException("No records found for this ID") }
        repository.delete(entity)
    }
}