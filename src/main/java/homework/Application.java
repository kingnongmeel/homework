package homework;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Application {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Controller controller = new Controller();

        do {
            System.out.println("======== 나의 영화 저장소 ========");
            System.out.println("1. 나의 영화 저장소 전체 조회");
            System.out.println("2. 영화 넘버로 조회 ");
            System.out.println("3. 나의 영화 신규 저장 ");
            System.out.println("4. 나의 영화 수정 ");
            System.out.println("5. 나의 영화 삭제 ");
            System.out.println("6. 연대별 영화 조회 ");
            System.out.println("7. 선택한 평점 범위 내 영화 조회 ");
            System.out.print("메뉴 관리 번호 입력 : ");
            int no = sc.nextInt();

            switch (no) {
                case 1:
                    controller.selectAllMovie(); break;
                case 2:
                    controller.selectNoMovie(inputNo()); break;
                case 3 : controller.registMovie(inputRegist()); break;
                case 4 : controller.modifyMovie(modifyMovie()); break;
                case 5 : controller.deleteMovie(inputDelete()); break;
                case 6 : controller.yearFind(inputYear()); break;
                case 7 : controller.ratingFind(inputRating()); break;
                default:
                    System.out.println("잘못된 메뉴를 선택하셨습니다.");
            }
        } while (true);
    }



    private static Map<String, String> inputNo() {
        Scanner sc = new Scanner(System.in);
        System.out.print("조회할 넘버를 입력하세요 : ");
        String no = sc.nextLine();

        Map<String, String> parameter = new HashMap<>();
        parameter.put("no", no);

        return parameter;
    }
    private static Map<String, String> inputRegist() {
        Scanner sc = new Scanner(System.in);

        System.out.println("추가할 영화 제목을 입력하시오 : ");
        String title = sc.nextLine();
        System.out.println("추가할 영화 제작 년도를 입력하시오 : ");
        String year = sc.nextLine();
        System.out.println("추가할 영화 평점을 입력하시오 : ");
        String rating = sc.nextLine();
        System.out.println("추가할 영화 장르를 입력하시오 : ");
        String genre = sc.nextLine();

        Map<String, String> parameter = new HashMap<>();
        parameter.put("title", title);
        parameter.put("year", year);
        parameter.put("rating", rating);
        parameter.put("genre", genre);

        return parameter;

    }
    private static Map<String, String> modifyMovie() {
        Scanner sc = new Scanner(System.in);

        System.out.print("수정할 영화 넘버 선택 ! : ");
        String no = sc.nextLine();

        System.out.println("수정할 영화 제목을 입력하시오 : ");
        String title = sc.nextLine();
        System.out.println("수정할 영화 제작 년도를 입력하시오 : ");
        String year = sc.nextLine();
        System.out.println("수정할 영화 평점을 입력하시오 : ");
        String rating = sc.nextLine();
        System.out.println("수정할 영화 장르를 입력하시오 : ");
        String genre = sc.nextLine();

        Map<String, String> parameter = new HashMap<>();

        parameter.put("no", no);
        parameter.put("title", title);
        parameter.put("year", year);
        parameter.put("rating", rating);
        parameter.put("genre", genre);

        return parameter;
    }
    private static Map<String, String> inputDelete() {
        Scanner sc = new Scanner(System.in);
        System.out.print("삭제할 영화 넘버를 입력하세요 : ");
        String no = sc.nextLine();

        Map<String, String> parameter = new HashMap<>();
        parameter.put("no", no);

        return parameter;
    }

    private static Map<String, String> inputYear() {
        Scanner sc = new Scanner(System.in);

        System.out.print("검색할 연대를 입력하시오 (ex.1990,2000,2010) : ");
        String year = sc.nextLine();

        Map<String, String> parameter = new HashMap<>();
        parameter.put("year", year);

        return parameter;
    }
    private static Map<String, String> inputRating() {
        Scanner sc = new Scanner(System.in);

        System.out.print("검색할 최소 평점을 입력하시오 : ");
        String rating1 = sc.nextLine();
        System.out.print("검색할 최대 평점을 입력하시오 : ");
        String rating2 = sc.nextLine();

        Map<String, String> parameter = new HashMap<>();
        parameter.put("rating1", rating1);
        parameter.put("rating2", rating2);

        return parameter;
    }
}
