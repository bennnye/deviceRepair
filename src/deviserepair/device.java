package deviserepair;

public class device {

protected String identificationCode;
protected String makeAndModel;
protected String Owner;
protected String problemDescription;
protected String repairNotes;
protected int priority;

    public device(String identificationCode, String makeAndModel, String Owner, String problemDescription, String repairNotes, int priority) {
        this.identificationCode = identificationCode;
        this.makeAndModel = makeAndModel;
        this.Owner = Owner;
        this.problemDescription = problemDescription;
        this.repairNotes = repairNotes;
        this.priority = priority;
    }

    public String getIdentificationCode() {
        return identificationCode;
    }

    public String getMakeAndModel() {
        return makeAndModel;
    }

    public String getOwner() {
        return Owner;
    }

    public String getProblemDescription() {
        return problemDescription;
    }

    public String getRepairNotes() {
        return repairNotes;
    }

    public int getPriority() {
        return priority;
    }

    public void setIdentificationCode(String identificationCode) {
        this.identificationCode = identificationCode;
    }

    public void setMakeAndModel(String makeAndModel) {
        this.makeAndModel = makeAndModel;
    }

    public void setOwner(String Owner) {
        this.Owner = Owner;
    }

    public void setProblemDescription(String problemDescription) {
        this.problemDescription = problemDescription;
    }

    public void setRepairNotes(String repairNotes) {
        this.repairNotes = repairNotes;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }
    
    public String toString(){
        return identificationCode + ", " + makeAndModel + ", " + Owner + ", " + problemDescription + ", " + repairNotes + ", " + priority;
    }
    
}
