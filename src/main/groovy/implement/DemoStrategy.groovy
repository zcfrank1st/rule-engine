package implement

import com.google.gson.Gson
import core.model.Rule
import core.strategy.RuleManipulateStrategy

/**
 * Created by zcfrank1st on 04/01/2017.
 */
class DemoStrategy implements RuleManipulateStrategy<Object> {
    private static final Gson gson = new Gson()

    @Override
    Object calculate(Object input) {
        return gson.toJson(new Rule(1))
    }
}
