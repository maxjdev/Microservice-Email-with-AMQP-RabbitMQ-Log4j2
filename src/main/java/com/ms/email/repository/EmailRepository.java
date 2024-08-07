package com.ms.email.repository;

import com.ms.email.model.Email;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface EmailRepository extends CrudRepository<Email, UUID> {
}
