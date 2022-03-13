package uz.jl.springdata.db;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;
import uz.jl.springdata.domain.Book;
import uz.jl.springdata.repository.BookRepository;

@Component
@Profile({"dev", "tes"})
public record Init(BookRepository bookRepository) implements CommandLineRunner {

    @Override
    public void run(String... args) throws Exception {
        Book book1 = new Book("Who will cry when we die", "PNG readers");
        bookRepository.save(book1);
    }

}
