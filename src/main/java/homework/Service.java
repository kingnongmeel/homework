package homework;

import org.apache.ibatis.session.SqlSession;

import java.util.List;

import static homework.Template.getSqlSession;

public class Service {
    private Mapper mapper;

    public boolean modifyMovie(DTO dto) {
        SqlSession sqlSession = getSqlSession();
        mapper = sqlSession.getMapper(Mapper.class);

        int result = mapper.modifyMovie(dto);

        if(result > 0) {
            sqlSession.commit();
        } else {
            sqlSession.rollback();
        }

        sqlSession.close();

        return result > 0;

    }

    public List<DTO> selectAllMovie() {
        SqlSession sqlSession = getSqlSession();

        mapper = sqlSession.getMapper(Mapper.class);
        List<DTO> movieList = mapper.selectAllMovie();

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

    public boolean registMovie(DTO dto) {

        SqlSession sqlSession = getSqlSession();
        mapper = sqlSession.getMapper(Mapper.class);

        int result = mapper.registMovie(dto);

        if(result > 0) {
            sqlSession.commit();
        } else {
            sqlSession.rollback();
        }

        sqlSession.close();

        return result > 0;
    }

    public boolean deleteMovie(DTO dto) {
        SqlSession sqlSession = getSqlSession();
        mapper = sqlSession.getMapper(Mapper.class);

        int result = mapper.deleteMovie(dto);

        if(result > 0) {
            sqlSession.commit();
        } else {
            sqlSession.rollback();
        }
        sqlSession.close();

        return result > 0;
    }

    public List<DTO> findYear(int result) {
        SqlSession sqlSession = getSqlSession();

        mapper = sqlSession.getMapper(Mapper.class);
        List<DTO> dtos = mapper.findYear(result);

        sqlSession.close();

        return dtos;
    }
}
