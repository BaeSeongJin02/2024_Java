package ex14;

//button 코드를 분석해보시오
public class Window {
	//456p 9장 sec02.exam03
    Button button1 = new Button();
    Button button2 = new Button();
    Button button3 = new Button();

    Window() {
        button1.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick() {
                System.out.println("공부를 한다.");
            }
        });

        button2.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick() {
               System.out.println("잠을 잔다.");
            }
        });
        
        button3.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick() {
                System.out.println("밥을 먹는다.");
            }
        });
    }

    public static void main(String[] args) {
        Window window = new Window();

        window.button1.onClick();  
        window.button2.onClick();  
        window.button3.onClick();
    }
}
