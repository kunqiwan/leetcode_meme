package twoSum;

import java.util.HashMap;
import java.util.List;

public class lec1463 {
    public String destCity(List<List<String>> paths) {
        HashMap<String, String> route = new HashMap<String, String>();
        for (List<String> path : paths) {
            route.put(path.get(0), path.get(1));
        }
        String first = paths.get(0).get(1);
        while(route.containsKey(first)){
            first = route.get(first);
        }
        return  first;
    }
}
