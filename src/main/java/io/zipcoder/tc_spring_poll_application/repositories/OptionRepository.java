package io.zipcoder.tc_spring_poll_application.repositories;

import io.zipcoder.tc_spring_poll_application.domain.Option;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OptionRepository extends JpaRepository<Option, Long> {

}
