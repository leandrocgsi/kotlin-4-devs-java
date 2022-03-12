package br.com.erudio.exception

import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.ResponseStatus

@ResponseStatus(HttpStatus.NOT_FOUND)
class ResourceNotFoundException(exception: String?) : RuntimeException(exception) {
    companion object {
        private const val serialVersionUID = 1L
    }
}