package ex10;

public class Window {
    Button button1 = new Button();
    Button button2 = new Button();

    // Button.OnClickListener를 구현한 별도의 클래스 생성
    static class CallClickListener implements Button.OnClickListener {
        @Override
        public void onClick() {
            System.out.println("전화를 겁니다.");
        }
    }

    Window() {
        // button1에 CallClickListener를 적용
        button1.setOnClickListener(new CallClickListener());

        // button2는 기존 익명 구현 객체를 유지
        button2.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick() {
                System.out.println("메시지를 보냅니다.");
            }
        });
    }
}

//button3에 익명 구현 객체 설정
Button button3 = new Button();

button3.setOnClickListener(new Button.OnClickListener() {
    @Override
    public void onClick() {
        System.out.println("이메일을 보냅니다.");
    }
});
