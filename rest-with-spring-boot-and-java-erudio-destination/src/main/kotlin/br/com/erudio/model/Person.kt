package br.com.erudio.model

import jakarta.persistence.*
import java.io.Serializable

@Entity
@Table(name = "person")
class Person : Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long? = null

    @Column(name = "first_name", nullable = false, length = 80)
    var firstName: String? = null

    @Column(name = "last_name", nullable = false, length = 80)
    var lastName: String? = null

    @Column(nullable = false, length = 100)
    var address: String? = null

    @Column(nullable = false, length = 6)
    var gender: String? = null
    override fun hashCode(): Int {
        val prime = 31
        var result = 1
        result = prime * result + if (address == null) 0 else address.hashCode()
        result = prime * result + if (firstName == null) 0 else firstName.hashCode()
        result = prime * result + if (gender == null) 0 else gender.hashCode()
        result = prime * result + if (id == null) 0 else id.hashCode()
        result = prime * result + if (lastName == null) 0 else lastName.hashCode()
        return result
    }

    override fun equals(obj: Any?): Boolean {
        if (this === obj) return true
        if (obj == null) return false
        if (javaClass != obj.javaClass) return false
        val other = obj as Person
        if (address == null) {
            if (other.address != null) return false
        } else if (address != other.address) return false
        if (firstName == null) {
            if (other.firstName != null) return false
        } else if (firstName != other.firstName) return false
        if (gender == null) {
            if (other.gender != null) return false
        } else if (gender != other.gender) return false
        if (id == null) {
            if (other.id != null) return false
        } else if (id != other.id) return false
        if (lastName == null) {
            if (other.lastName != null) return false
        } else if (lastName != other.lastName) return false
        return true
    }

    companion object {
        private const val serialVersionUID = 1L
    }
}