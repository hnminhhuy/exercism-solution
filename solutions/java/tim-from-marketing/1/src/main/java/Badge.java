class Badge {
    private static final String SPERATOR = " - ";

    public String print(Integer id, String name, String department) {
        String badge = "";

        badge += id != null ? String.format("[%d]", id) + Badge.SPERATOR : "";
        badge += name != null ? name + Badge.SPERATOR : "";
        badge += department != null ? department.toUpperCase() : "OWNER";

        return badge;
    }
}
