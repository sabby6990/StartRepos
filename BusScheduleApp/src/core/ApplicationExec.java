package core;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import model.Route;

public class ApplicationExec {

	private static Date getdate1() {
		Calendar cal = Calendar.getInstance();
		cal.set(Calendar.MONTH, 1);
		cal.set(Calendar.DATE, 21);
		cal.set(Calendar.YEAR, 2017);
		cal.set(Calendar.HOUR, 13); // 1 o clock
		cal.set(Calendar.MINUTE, 45);
		return cal.getTime();

	}
	private static Date getdate11() {
		Calendar cal = Calendar.getInstance();
		cal.set(Calendar.MONTH, 1);
		cal.set(Calendar.DATE, 21);
		cal.set(Calendar.YEAR, 2017);
		cal.set(Calendar.HOUR, 15); // 1 o clock
		cal.set(Calendar.MINUTE, 30);
		return cal.getTime();

	}

	private static Date getdate2() {
		Calendar cal = Calendar.getInstance();
		cal.set(Calendar.MONTH, 1);
		cal.set(Calendar.DATE, 21);
		cal.set(Calendar.YEAR, 2017);
		cal.set(Calendar.HOUR, 13); // 1 o clock
		cal.set(Calendar.MINUTE, 45);
		return cal.getTime();

	}

	// user input time
	private static Date userTimeInput() {
		Calendar cal = Calendar.getInstance();
		cal.set(Calendar.MONTH, 1);
		cal.set(Calendar.DATE, 21);
		cal.set(Calendar.YEAR, 2017);
		cal.set(Calendar.HOUR, 12); // 12.30 o clock
		cal.set(Calendar.MINUTE, 45);
		return cal.getTime();
	}

	public static ArrayList<Route> busDetail1() {
		ArrayList<Route> routeLst = new ArrayList<>();
		ArrayList<String> stopNameList = new ArrayList<>();
		stopNameList.add("A");
		stopNameList.add("B");
		stopNameList.add("C");
		stopNameList.add("D");
		stopNameList.add("E");
		Route route = new Route(1L, stopNameList, getdate1());
		 Route route2= new Route(3L, stopNameList, getdate11());
		routeLst.add(route);
		 routeLst.add(route2);
		return routeLst;

	}

	public static ArrayList<Route> busDetail2() {
		ArrayList<Route> routeLst = new ArrayList<>();
		ArrayList<String> stopNameList = new ArrayList<>();
		stopNameList.add("A");
		stopNameList.add("D");
		stopNameList.add("F");
		stopNameList.add("Y");
		stopNameList.add("E");
		Route route = new Route(2L, stopNameList, getdate2());
		routeLst.add(route);
		return routeLst;

	}

	public static void main(String[] args) {
		Map<String, ArrayList<Route>> scheduleMap = new HashMap<>();

		scheduleMap.put("BUS 229", busDetail1());
		scheduleMap.put("BUS 240", busDetail2());

		// user inputs
		String source = "D";
		String dest = "E";
		Date desiredTime = userTimeInput(); // should be sydate

		// iterate the list of busses
		for (Map.Entry<String, ArrayList<Route>> entry : scheduleMap.entrySet()) {

			ArrayList<Route> routeList = entry.getValue();

			// iterate the list of routes each bus will take
			for (Route routeObj : routeList) {
				ArrayList<String> stopNames = routeObj.getStopNames();

				// check if source and destination exist in the route list
				if (stopNames.contains(source) && stopNames.contains(dest)) {

					int sourceIndex = stopNames.indexOf(source);
					int destIndex = stopNames.indexOf(dest);

					if (sourceIndex > destIndex) {
						System.out.println("There are no busses going that route");
					} else {
						// route found yipiieee
						SimpleDateFormat sdf = new SimpleDateFormat("yyyy-mm-dd hh:mm");

						if (desiredTime.before(routeObj.getRouteTime())
								|| desiredTime.equals(routeObj.getRouteTime())) {

							System.out.println(entry.getKey() + " is available ||time --> " + routeObj.getRouteTime()
									+ " || route--> route id=" + routeObj.getRouteId() + " --> " + stopNames);
						}

					}

				}

			}
		}

	}

}
