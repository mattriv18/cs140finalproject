package projectview;

import javax.swing.Timer;

public class TimerControl {
	static final int TICK = 500;
	boolean autoStepOn = false;
	Timer timer;
	GUIMediator gui;
	
	public TimerControl(GUIMediator gm) {
		gui = gm;
	}

	public boolean isAutoStepOn() {
		return autoStepOn;
	}

	public void setAutoStepOn(boolean autoStepOn) {
		this.autoStepOn = autoStepOn;
	}
	
	public void toggleAutoStep() {
		autoStepOn = !autoStepOn;
	}
	
	void setPeriod(int period) {
		timer.setDelay(period);
	}
	
	public void start() {
		timer = new Timer(TICK, e -> {if(autoStepOn) gui.step();});
		timer.start();
	}
}
