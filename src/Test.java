import java.util.*;

public class Test {
    public static void main(String[] args) {

        List<String> nameList = new ArrayList<>();
        List<String> nicknameList = new LinkedList<>();

        nameList.add("John");
        nameList.add("Cameron");

        nicknameList.add("Prim");
        nicknameList.add("Stephan");

        List<String> resultNameList = findUserInfo(nameList);
        List<String> resultNicknameList = findUserInfo(nicknameList);

        System.out.println(resultNameList);
        System.out.println(resultNicknameList);

    }

    static List<String> findUserInfo(List<String> nameList) {
        return new LinkedList<>();
    }
}


