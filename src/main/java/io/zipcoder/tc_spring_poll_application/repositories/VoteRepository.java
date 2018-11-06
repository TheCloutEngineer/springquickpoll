package io.zipcoder.tc_spring_poll_application.repositories;

import io.zipcoder.tc_spring_poll_application.domain.Vote;
import org.springframework.data.repository.CrudRepository;

public interface VoteRepository extends CrudRepository<Vote, Long> {
}
