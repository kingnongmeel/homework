package homework;

import java.util.List;

public class PrintResult {
    public void printMovieList(List<DTO> movieList) {
        movieList.forEach(System.out::println);
        System.out.println(movieList);
        System.out.println("리저트 응답");
    }

    public void printErrorMessage(String errorCode) {
        String errorMessage = "";
        switch (errorCode) {
            case "selectList" : errorMessage = "영화 목록 조회에 실패하였습니다."; break;
            case "selectNoList" : errorMessage = "No 선택 조회 실패하였습니다.";
        }
        System.out.println(errorMessage);
    }

    public void printNoList(DTO noList) {
        System.out.println(noList);
    }
}

