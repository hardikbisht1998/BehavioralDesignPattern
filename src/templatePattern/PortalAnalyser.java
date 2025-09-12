package templatePattern;

public abstract class PortalAnalyser {

    int rankProfile(Profile profile, String Expectation) {
//        Some logic to calculate profile rank according to expaction role;
        return 49;
    }

    boolean sendNotification(Profile profile) {
        //if email available send it by mail or by message
        //if both not there send false and store in list so someone else maualyy look into it

        return true;
    }

    public final void analyseProfile(String id, int top, String expectation) {
        logIn();
        String data = scrapper(id);
        Profile profile = stringToPrfile(data);

        // Optional hook
        if (!validateProfile(profile)) {
            System.out.println("Profile validation failed for " + profile.getName());
            return;
        }

        int rank = rankProfile(profile, expectation);
        System.out.println(profile.getName() + " has ranked " + rank);

        if (rank > top) {
            sendNotification(profile);
        }

        logOut();
    }

    // Hook method (subclasses may override)
    protected boolean validateProfile(Profile profile) {
        return true; // default: always valid
    }

    protected abstract boolean logIn();

    protected abstract boolean logOut();

    protected abstract String scrapper(String id);

    protected abstract Profile stringToPrfile(String data);
}
