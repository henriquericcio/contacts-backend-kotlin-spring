package com.henriquericcio.contacts.infra.http

import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.ResponseStatus

@ResponseStatus(code = HttpStatus.NOT_FOUND, reason = "Not Found")
class NotFoundException : Exception()