package ex02;

public class Button {
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