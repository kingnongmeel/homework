package homework;

import org.apache.ibatis.session.SqlSession;

import java.util.List;

import static homework.Template.getSqlSession;

public class Service {
    private Mapper mapper;
    public List<DTO> selectAllMovie() {
        SqlSession sqlSession = getSqlSession();

        mapper = sqlSession.getMapper(Mapper.class);
        List<DTO> movieList = mapper.selectAllMovie();
        System.out.println(movieList);

        sqlSession.close();

        return movieList;

    }

    public DTO selectMovieByNo(int no) {
        SqlSession sqlSession = getSqlSession();

        mapper = sqlSession.getMapper(Mapper.class);
        DTO noList = mapper.selectMovieByNo(no);

        sqlSession.close();

        return noList;


    }
}
