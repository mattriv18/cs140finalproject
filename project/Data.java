package project;

public class Data {
	public static int DATA_SIZE = 2048;
	private int[] data = new int[DATA_SIZE];
	private int changedIndex = -1;
	
	public int getData(int index) {
		if(index < 0 || index > data.length) {
			throw new MemoryAccessException("Illegal access to data memory index" + index);
		}
		return data[index];
	}
	
	public void setData(int index, int value) {
		if(index < 0 || index > data.length) {
			throw new MemoryAccessException("Illegal access to data memory index" + index);
		}
		data[index] = value;
		changedIndex = index;
	}

	public int getChangedIndex() {
		return changedIndex;
	}
	
	public int[] getData() {
		return data;
	}
	
	public void clearData(int start, int end) {
		for(int i = start; i < end; i++) {
			data[i] = 0;
		}
		changedIndex = -1;
	}
}
