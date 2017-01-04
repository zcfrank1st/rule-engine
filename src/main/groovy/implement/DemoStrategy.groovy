package implement

import core.strategy.RuleManipulateStrategy

/**
 * Created by zcfrank1st on 04/01/2017.
 */
class DemoStrategy implements RuleManipulateStrategy<Object> {
    @Override
    Object calculate(Object input) {
        return "hello"
    }
}
