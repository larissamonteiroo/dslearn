package com.devsuperior.dslearnbds.repositories;

import com.devsuperior.dslearnbds.entities.Deliver;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NotificationRepository extends JpaRepository<Deliver, Long> {

}
