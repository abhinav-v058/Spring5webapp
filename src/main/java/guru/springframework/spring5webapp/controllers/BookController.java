package guru.springframework.spring5webapp.controllers;

import guru.springframework.spring5webapp.repositories.BookRepositories;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BookController {

    private BookRepositories bookRepository;

    public BookController(BookRepositories book_repo){
        this.bookRepository = book_repo;
    }

    @RequestMapping("/books")
    public String getBooks(Model model){
        model.addAttribute("books",bookRepository.findAll());

        return "books";
    }
}
