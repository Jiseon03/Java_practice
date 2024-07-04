package hotel;

public class room {
	private boolean isUsing;
	//true : 사용중
	//false : 사용 가능(빈 객실)
	public room() {}

	public room(boolean isUsing) {
		this.isUsing = isUsing;
	}

	public boolean isUsing() {
		return isUsing;
	}

	public void setUsing(boolean isUsing) {
		this.isUsing = isUsing;
	}


}
