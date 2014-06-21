package lecho.lib.hellocharts.gestures;

import android.view.MotionEvent;

public class DummyTouchHandler implements ChartTouchHandler {

	public DummyTouchHandler() {
	}

	public boolean computeScroll() {
		return false;
	}

	public boolean handleTouchEvent(MotionEvent event) {
		return false;
	}

	@Override
	public void setZoomEnabled(boolean isZoomEnabled) {
		// do nothing

	}

	@Override
	public void setZoomMode(ZoomMode zoomMode) {
		// do nothing

	}

	@Override
	public void setTouchEnabled(boolean isTouchEnabled) {
		// do nothing

	}
}