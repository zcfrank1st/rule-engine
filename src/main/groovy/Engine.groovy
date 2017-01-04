import core.strategy.RuleManipulateStrategy

/**
 * Created by zcfrank1st on 04/01/2017.
 */

class Engine {
    static void main(String[] args) {
        // TODO 可以提供API请求
        RuleManipulateStrategy strategy = Class.forName("implement." + args[0]).newInstance()
        println(strategy.calculate(""))
    }
}