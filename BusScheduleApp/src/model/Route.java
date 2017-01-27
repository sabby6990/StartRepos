package model;

import java.util.ArrayList;
import java.util.Date;

public class Route {
	Long routeId;
	ArrayList<String> stopNames;
	Date routeTime;
	
	public Route(Long routeId, ArrayList<String> stopNames, Date routeTime) {
		super();
		this.routeId = routeId;
		this.stopNames = stopNames;
		this.routeTime = routeTime;
	}

	/**
	 * @return the routeId
	 */
	public Long getRouteId() {
		return routeId;
	}

	/**
	 * @return the stopNames
	 */
	public ArrayList<String> getStopNames() {
		return stopNames;
	}

	/**
	 * @return the routeTime
	 */
	public Date getRouteTime() {
		return routeTime;
	}
	


}
