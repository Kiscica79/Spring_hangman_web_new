package hu.progmatic.spring_hangman_web_new.repo;

import hu.progmatic.spring_hangman_web_new.model.Word;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WordRepo extends JpaRepository <Word, String> {

}

