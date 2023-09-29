package hu.progmatic.spring_hangman_web_new.service;

import hu.progmatic.spring_hangman_web_new.model.Word;
import hu.progmatic.spring_hangman_web_new.repo.WordRepo;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

@Service
public class WordService {

    private WordRepo wordRepo;

    public WordService(WordRepo wordRepo) {
        this.wordRepo = wordRepo;
    }


    public List<Word> getAllWords() {
        return wordRepo.findAll();
    }

    public Word getRandomWord() {
        List<Word> words  = getAllWords();
        Collections.shuffle(words);
        return words.get(0);
    }



}
