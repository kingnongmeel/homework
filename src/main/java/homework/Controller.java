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
        System.out.println(movieList);

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
}
