package models;

public enum UserRole {
    STANDARD("STANDARD","Standard User"),
    PREMIUM("PREMIUMUSER", "Premium User"),
    GOLD("GOLDUSER","Gold User"),
    TITAN("TITANUSER", "Titan User"),
    DIAMOND("DIAMONDUSER", "Diamond User"),
    SUPERVISOR("SUPERUSER", "Super User"),
    ADMINISTRATOR("ADMINISTRATOR", "Admin User"),
    ROOT("ROOT", "Root User");
    
    private String name;
    private String description;

    UserRole(String name, String description){
        this.name = name;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
