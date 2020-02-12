package com.capgemini.Lab2;

public abstract class MediaItem extends Item {
	
	private int runtime;
	

	
	public MediaItem(int id, String name, int copies, int runtime) {
		// TODO Auto-generated constructor stub
		super(id,name,copies);
		this.runtime=runtime;
	}

	@Override
	public void print() {

	}

	public int getRuntime() {
		return runtime;
	}

	public void setRuntime(int runtime) {
		this.runtime = runtime;
	}


}
