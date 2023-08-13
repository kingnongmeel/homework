package homework;

import java.util.List;
import java.util.Map;

public class Controller {

    private final Service movieService;
    private final PrintResult printResult;

    public Controller() {
        movieService = new Service();
        printResult = new PrintResult();
    }


    public void selectAllMovie() {
        List<DTO> movieList = movieService.selectAllMovie();

        if(movieList != null) {
            printResult.printMovieList(movieList);
        } else {
            printResult.printErrorMessage("selectList");
        }

    }

    public void selectNoMovie(Map<String, String> parameter) {
        int no = Integer.parseInt(parameter.get("no"));
        DTO noList = movieService.selectMovieByNo(no);

        if(noList != null) {
            printResult.printNoList(noList);
        } else {
            printResult.printErrorMessage("selectNo");
        }
    }

    public void registMovie (Map<String, String> parameter) {
        String title = parameter.get("title");
        int year = Integer.parseInt(parameter.get("year"));
        int rating = Integer.parseInt(parameter.get("rating"));
        int genre = Integer.parseInt(parameter.get("genre"));

        DTO dto = new DTO();
        dto.setTitle(title);
        dto.setYear(year);
        dto.setRating(rating);
        dto.setGenre(genre);

        if(movieService.registMovie(dto)) {
            printResult.printSuccessMessage("regist");
        } else {
            printResult.printErrorMessage("regist");
        }
    }

    public void modifyMovie(Map<String, String> parameter) {


        int no = Integer.parseInt(parameter.get("no"));
        String title = parameter.get("title");
        int year = Integer.parseInt(parameter.get("year"));
        int rating = Integer.parseInt(parameter.get("rating"));
        int genre = Integer.parseInt(parameter.get("genre"));

        DTO dto = new DTO();
        dto.setNo(no);
        dto.setTitle(title);
        dto.setYear(year);
        dto.setRating(rating);
        dto.setGenre(genre);

        if(movieService.modifyMovie(dto)) {
            printResult.printSuccessMessage("modify");
        } else {
            printResult.printErrorMessage("modify");
        }

    }

    public void deleteMovie(Map<String, String> parameter) {
        int no = Integer.parseInt(parameter.get("no"));

        DTO dto = new DTO();
        dto.setNo(no);

        if(movieService.deleteMovie(dto)) {
            printResult.printSuccessMessage("delete");
        } else {
            printResult.printErrorMessage("delete");
        }

    }

    public void yearFind(Map<String, String> parameter) {
        int result = Integer.parseInt(parameter.get("year"));

        List<DTO> dtos = movieService.findYear(result);

        if(dtos != null ) {
            printResult.printFindYear(dtos);
        } else {
            printResult.printErrorMessage("findYear");
        }

    }

    public void ratingFind(Map<String, String> parameter) {
        int rating1 = Integer.parseInt(parameter.get("rating1"));
        int rating2 = Integer.parseInt(parameter.get("rating2"));

        RatingDTO rdto = new RatingDTO();
        rdto.setRating1(rating1);
        rdto.setRating2(rating2);

        List<DTO> dtos = movieService.findRating(rdto);

        if(dtos != null) {
            printResult.findRating(dtos);
        } else {
            printResult.printErrorMessage("ratingFind");
        }
    }
}
