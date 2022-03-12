package uz.jl.springdata.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import uz.jl.springdata.domain.Book;

public interface BookRepository extends JpaRepository<Book, Long> {
}
