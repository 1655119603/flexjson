package flexjson.mock;

import java.util.HashMap;
import java.util.Map;

public class MapNoTyping {

    private Map<String,Object> data = new HashMap<String,Object>();

    public Map<String, Object> getData() {
        return data;
    }

    public void setData(Map<String, Object> data) {
        this.data = data;
    }

}
