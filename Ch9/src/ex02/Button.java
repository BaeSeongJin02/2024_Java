package ex02;

public class Button {
	//시험 문제 출제!!!!!!
	
	OnClickListener listener;

	public void SetOnClickLIstener(OnClickListener listener) {
		this.listener = listener;
	}
	
	public void Touch() {
		if (listener != null)
			listener.OnClick();
	}
	
	
	public interface OnClickListener {		//OnClickListener를 Button 안에 넣음
		void OnClick();
	}
	
}
