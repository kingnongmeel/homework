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
            System.out.print("메뉴 관리 번호 입력 : ");
            int no = sc.nextInt();

            switch (no) {
                case 1:
                    controller.selectAllMovie(); break;
                case 2:
                    controller.selectNoMovie(inputNo()); break;
//                case 3 : controller.registMovie(); break;
//                case 4 : controller.modifyMovie(); break;
//                case 5 : controller.deleteMovie(); break;
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
}
