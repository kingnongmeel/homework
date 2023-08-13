package homework;

import java.util.List;

public class PrintResult {
    public void printMovieList(List<DTO> movieList) {
        movieList.forEach(System.out::println);
    }
    public void printFindYear(List<DTO> dtos) {
        dtos.forEach(System.out::println);
    }

    public void printErrorMessage(String errorCode) {
        String errorMessage = "";
        switch (errorCode) {
            case "selectList" : errorMessage = "영화 목록 조회에 실패하였습니다."; break;
            case "selectNoList" : errorMessage = "No 선택 조회 실패하였습니다.";
            case "regist" : errorMessage = "영화 추가 실패하였습니다.";
            case "modify" : errorMessage = "영화 수정이 실패하였습니다.";
            case "delete" : errorMessage = "영화 삭제가 실패하였습니다.";
            case "findYear" : errorMessage = "영화 연대별 조회가 실패하였습니다.";
        }
        System.out.println(errorMessage);
    }

    public void printNoList(DTO noList) {
        System.out.println(noList);
    }

    public void printSuccessMessage(String successCode) {
        String successMessage = "";
        switch(successCode) {
            case "regist" : successMessage = "영화 추가 완료."; break;
            case "modify" : successMessage = "영화 수정 완료."; break;
            case "delete" : successMessage = "영화 삭제 완료."; break;
        }
        System.out.println(successMessage);
    }

}

