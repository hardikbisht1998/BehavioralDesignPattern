package templatePattern;

import java.util.ArrayList;
import java.util.List;

public class TemplateTester {


    public void tester(int top) {

        List<String> naukriIds = new ArrayList<>();
        List<String> linkedinIds = new ArrayList<>();

        naukriIds.add("naukri-123");
        linkedinIds.add("linkedin-456");

        PortalAnalyser naukriAnalyser = new NaukriProfileAnalyser();
        PortalAnalyser linkedinAnalyser = new LinkdinProfileAnalyser();

        for (String id : naukriIds) {
            naukriAnalyser.analyseProfile(id, top, "");
        }

        for (String id : linkedinIds) {
            linkedinAnalyser.analyseProfile(id, top, "");
        }
    }

}

