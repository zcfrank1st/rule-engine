package implement

import com.google.gson.Gson
import core.strategy.RuleManipulateStrategy

/**
 * Created by zcfrank1st on 04/01/2017.
 */
class DemoStrategy implements RuleManipulateStrategy<Map<String, String>> {
    private static final Gson gson = new Gson()

    @Override
    Map<String, String> calculate(Map<String, String> input) {
        Map<String, String> map = new HashMap<>()
        map.put("hello", "world")
        return map
    }
}
