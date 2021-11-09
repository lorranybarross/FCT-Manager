package src.model;

public class Constants {
    // MAXIMUM
    public final static int MAX_EMPLOYEES = 10000;
    public final static int MAX_DEPARTMENTS = 50;
    // TECHNICIAN
    public final static String[] techLevels = new String[] { "T1", "T2" };
    public final static double[] techSalaries = new double[] { 1.1, 1.2 };

    // SUBSTITUTE
    public final static String[] subsLevels = new String[] { "S1", "S2" };
    public final static double[] subsSalaries = new double[] { 1.05, 1.1 };
    public final static int[] subsWorkloads = new int[] { 12, 24 };

    // PERMANENT
    public final static String[] permLevels = new String[] { "D1", "D2", "D3" };
    public final static double[] permSalaries = new double[] { 1.05, 1.1, 1.2 };
    public final static double additional = 0.05;

    public static int getMaxEmployees() {
        return MAX_EMPLOYEES;
    }

    public static int getMaxDepartments() {
        return MAX_DEPARTMENTS;
    }

    // **************
    // TECHNICIAN
    // **************
    public static String validateTechLevel(String l) {
        for (int i = 0; i < techLevels.length; i++)
            if (l == techLevels[i])
                return l;
        return techLevels[0];
    }

    public static double techAdditional(String level) {
        for (int i = 0; i < techLevels.length; i++)
            if (level == techLevels[i])
                return techSalaries[i];
        return techSalaries[0];
    }

    public static String getTechLevel(int i) {
        return techLevels[i - 1];
    }

    public static String[] getTechLevels() {
        return techLevels;
    }

    // **************
    // SUBSTITUTE
    // **************
    public static String validateSubstituteLevel(String l) {
        for (int i = 0; i < subsLevels.length; i++)
            if (l == subsLevels[i])
                return l;
        return subsLevels[0];
    }

    public static int validateSubstituteWorkload(int wl) {
        for (int i = 0; i < subsWorkloads.length; i++)
            if (wl == subsWorkloads[i])
                return wl;
        return subsWorkloads[0];
    }

    public static double subsAdditional(String level) {
        for (int i = 0; i < subsLevels.length; i++)
            if (level == subsLevels[i])
                return subsSalaries[i];
        return subsSalaries[0];
    }

    public static String getSubstituteLevel(int i) {
        return subsLevels[i - 1];
    }

    public static String[] getSubstituteLevels() {
        return subsLevels;
    }

    // **************
    // PERMANENT
    // **************
    public static String validatePermanentLevel(String l) {
        for (int i = 0; i < permLevels.length; i++)
            if (l == permLevels[i])
                return l;
        return permLevels[0];
    }

    public static double permAdditional(String level) {
        for (int i = 0; i < permLevels.length; i++)
            if (level == permLevels[i])
                return permSalaries[i];
        return permSalaries[0];
    }

    public static double permExtra() {
        return additional;
    }

    public static String getPermanentLevel(int i) {
        return permLevels[i - 1];
    }

    public static String[] getPermanentLevels() {
        return permLevels;
    }
}
