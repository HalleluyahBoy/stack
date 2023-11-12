package OpenCode.hq.movies;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//instead of mapping it to the default local host
@RequestMapping("api/v1/movies")
public class MovieController {
    @GetMapping
    public String allMovies() {
        return "All movies";
    }
}
