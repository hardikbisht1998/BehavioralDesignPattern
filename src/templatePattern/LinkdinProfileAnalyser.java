package templatePattern;

public class LinkdinProfileAnalyser extends PortalAnalyser {
    @Override
    protected boolean logIn() {
        return false;
    }

    @Override
    protected boolean logOut() {
        return false;
    }

    @Override
    protected String scrapper(String id) {

//        logic to login to linkdin take the data from linkdin id providedd and return in string
        return "Hardik";
    }

    @Override
    protected Profile stringToPrfile(String data) {

//        some logic to take value from string and convert in profile format
        Profile profile = new Profile();
        profile.setEmailId("Hardikbisht@gmail.com");
        profile.setName("Hardik Bisht");
        return profile;
    }
}
