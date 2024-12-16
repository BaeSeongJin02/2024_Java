package ex10;
//Window 클래스는 Button 클래스의 setOnClickListener 메소드를 사용한다. 다음 질문에 답하시오.
//1. 익명 구현 객체를 사용하지 않고, Button.OnClickListener를 구현한 별도의 클래스를 만들어
//button1에 적용하도록 코드를 수정하시오.
//2. Window 클래스에 새로운 버튼 button3를 추가하려고 한다. button3 클릭 시 
//"이메일을 보냅니다."를 출력하려고 한다. 코드를 수정하시오.(단, 익명 구현 객체를 사용하시오)
public class Window {
	  Button button1 = new Button();
	  Button button2 = new Button();

	  Button.onClickListener listener = new Button.OnClickListener() {
	        @Override
	        public void onClick() {
	            System.out.println("전화를 겁니다. ");
	        }
	    };
	    
	  Window() {
	        button1.setOnClickListener( listener );
	        button2.setOnClickListener(new Button.OnClickListener() {
	            @Override
	            public void onClick() {
	                System.out.println("메시지를 보냅니다. ");
	            }
	      });
	  }
}
