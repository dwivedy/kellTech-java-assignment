package com.dwivedyKT;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * TempTracker holds the business logic for temperature.
 *  @author Pawan Dwivedy
 */
public class TempTracker implements TempTrackerInterface {
	
	private List<Integer> tempList;
	
	
	

	public TempTracker() {
		super();
		this.tempList = new ArrayList<Integer>();
	}

	@Override
	public void insert(int temperature) throws Exception {
		try {
			if (temperature >= 0 && temperature <= 150) {
				this.tempList.add(temperature);
				
			}else {
				System.out.println("Temperature range between 0\u00B0C and 150\u00B0C");
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}

	@Override
	public int get_max() throws Exception {
		return Collections.max(this.tempList);
	}

	@Override
	public int get_min() throws Exception {
		return Collections.min(this.tempList);
	}

	@Override
	public float get_mean() throws Exception {
		return (float)this.tempList.stream().mapToInt(val -> val).average().orElse(0.0);
	}

	@Override
	public int get_mode() throws Exception {
		int mode = this.tempList.get(0);
        int maxCount = 0;
        for (int i = 0; i < this.tempList.size(); i++) {
            int value = this.tempList.get(i);
            int count = 0;
            for (int j = 0; j < this.tempList.size(); j++) {
                if (this.tempList.get(j) == value) count++;
                if (count > maxCount) {
                    mode = value;
                    maxCount = count;
                    }
                }
        }
        if (maxCount > 1) {
            return mode;
        }
        return 0;
   
	}

	public List<Integer> getTempList() {
		return tempList;
	}

	public void setTempList(List<Integer> tempList) {
		this.tempList = tempList;
	}

	@Override
	public String toString() {
		return "TempTracker [tempList=" + tempList + "]";
	}

	
	
	
	
	
	

}
