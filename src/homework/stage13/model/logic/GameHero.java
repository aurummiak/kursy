package homework.stage13.model.logic;

import homework.stage13.model.entity.Artifact;

import java.util.Enumeration;

public class GameHero {

    public static final double FIRE_RESIST = 0.1;
    public static final double WATER_RESIST = 0.2;
    public static final double WIND_RESIST = 0.3;
    public static final double GEO_RESIST = 0.4;

    public static double calculateTotalRecovery(Artifact[] artifacts) {
        double total = 0.0;

        if (artifacts == null || artifacts.length == 0) {
            return 0;
        }

        for (int i = 0; i < artifacts.length; i++) {
            total += artifacts[i].getRecovery();
        }

        return total;
    }

    public static double calculateTotalPower(Artifact[] artifacts) {
        double total = 0.0;

        if (artifacts == null || artifacts.length == 0) {
            return 0;
        }

        for (int i = 0; i < artifacts.length; i++) {
            total += artifacts[i].getPower();
        }

        return total;
    }

    public static double calculateTotalStamina(Artifact[] artifacts) {
        double total = 0.0;

        if (artifacts == null || artifacts.length == 0) {
            return 0;
        }

        for (int i = 0; i < artifacts.length; i++) {
            total += artifacts[i].getStamina();
        }

        return total;
    }

    public static boolean checkTreatmentFromArtifacts(Artifact[] artifacts) {
        boolean result = false;

        for (int i = 0; i < artifacts.length; i++) { // хилл будет при условии, если 3 и больше актефактов имеют тритмент
            if (getNumberOfTreatmentArtifacts(artifacts) >= 3) {
                result = true;
            } else {
                result = false;
            }
        }
        return result;
    }

    public static int getNumberOfTreatmentArtifacts(Artifact[] artifacts) {
        int healArts = 0;
        int i = 0, j = 0;
        for (; i < artifacts.length; i++) {
            if (!artifacts[i].isTreatment()) {
                i++; // not
            } else {
                j++; // heal
            }
        }
        healArts = j;
        return healArts;
    }
}
