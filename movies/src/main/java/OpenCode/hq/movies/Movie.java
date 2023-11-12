package OpenCode.hq.movies;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.DocumentReference;

import java.util.List;

@Document(collation = "movies")
@Data
@AllArgsConstructor //for creating a constructor that takes all the private fields
@NoArgsConstructor //Another constructor that takes no parameter
public class Movie {
    @Id //ttelling the prigram this is an id
    private ObjectId id;
    private String imdbId; //This will represent the imdb id of  the movies
    private String title;
    private String releaseDate;
    private String trailerLink;
    private String poster;
    private List<String>  genres;
    private List<String> backdrops;
    @DocumentReference
    private List<Review> reviewIds;
}
