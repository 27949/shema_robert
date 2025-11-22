package p27949.q8;

import java.util.Date;

public class Section extends Library {
    private String sectionName;
    private String sectionCode;

    public Section(int id, Date createdDate, Date updatedDate, String libraryName, String location, String phoneNumber, String sectionName, String sectionCode) throws LibraryException {
        super(id, createdDate, updatedDate, libraryName, location, phoneNumber);
        if (sectionName == null || sectionName.length() < 3) {
            throw new LibraryException("Section name must be at least 3 characters long");
        }
        this.sectionName = sectionName;
        this.sectionCode = sectionCode;
    }

    // Getters and Setters
    public String getSectionName() {
        return sectionName;
    }

    public void setSectionName(String sectionName) {
        this.sectionName = sectionName;
    }

    public String getSectionCode() {
        return sectionCode;
    }

    public void setSectionCode(String sectionCode) {
        this.sectionCode = sectionCode;
    }
}
