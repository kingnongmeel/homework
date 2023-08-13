package homework;

import java.util.List;

public interface Mapper {
    List<DTO> selectAllMovie();

    DTO selectMovieByNo(int no);

    int registMovie(DTO dto);

    int modifyMovie(DTO dto);

    int deleteMovie(DTO dto);

    List<DTO> findYear(int result);
}
