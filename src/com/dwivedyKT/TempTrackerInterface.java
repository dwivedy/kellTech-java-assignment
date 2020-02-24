package com.dwivedyKT;

public interface TempTrackerInterface {

	/**
	 * records a new temperature
	 * @param temperature
	 * @throws Exception
	 */
	void insert(int temperature) throws Exception;

	/**
	 * returns the highest temperature
	 * 
	 * @return int:returns the highest temperature
	 * @throws Exception
	 */
	int get_max() throws Exception;

	/**
	 * returns the minimum temperature
	 * 
	 * @return int:returns the minimum temperature
	 * @throws Exception
	 */
	int get_min() throws Exception;

	/**
	 * returns the mean temperature
	 * 
	 * @return int:returns the mean temperature
	 * @throws Exception
	 */
	float get_mean() throws Exception;

	/**
	 * returns the mode temperature
	 * 
	 * @return float:returns the mode temperature
	 * @throws Exception
	 */
	int get_mode() throws Exception;

}
