package ex01;

public class Main {

    public static void main(String[] args) {

        Parent obj = new Child();

        obj.display(5);

    }

}

// 결과괎 : Parent: 5, 오버로딩 발생으로 parent의 display 메소드가 호출

