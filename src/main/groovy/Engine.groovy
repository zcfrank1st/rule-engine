import core.strategy.RuleManipulateStrategy
import io.github.javaconductor.gserv.GServ

/**
 * Created by zcfrank1st on 04/01/2017.
 */

class Engine {
    static void main(String[] args) {

        def gserv = new GServ()
        def ruleResource = gserv.resource("/rule") {
            post "/", { instream  ->
                Map data = to.json(instream)
                RuleManipulateStrategy<Map<String, String>> strategy = Class.forName("implement.${data.get("strategy")}").newInstance()
                writeJSON strategy.calculate(null)
            }
        }

        gserv.http {
            resource ruleResource
        }.start(8080)
    }
}