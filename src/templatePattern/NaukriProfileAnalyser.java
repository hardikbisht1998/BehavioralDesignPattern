package templatePattern;

public class NaukriProfileAnalyser extends PortalAnalyser {
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
        //        logic to login to naukri take the data from naukri id providedd and return in string

        return "Roshan";
    }

    @Override
    protected Profile stringToPrfile(String data) {
//        some logic to take value from string and convert in profile format
        Profile profile = new Profile();
        profile.setEmailId("Roshanbsht@gmail.com");
        profile.setName("Roshan Bisht");
        return profile;
    }
}
