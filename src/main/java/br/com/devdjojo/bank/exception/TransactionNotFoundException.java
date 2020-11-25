package br.com.devdjojo.bank.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND, reason = "Bank transactions were not found")
public class TransactionNotFoundException extends RuntimeException  {
}
