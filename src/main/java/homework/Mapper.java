package homework;

import java.util.List;

public interface Mapper {
    List<DTO> selectAllMovie();

    DTO selectMovieByNo(int no);
}
