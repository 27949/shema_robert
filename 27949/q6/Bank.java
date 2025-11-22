package p27949.q6;

import java.util.Date;

public class Bank extends Entity {
    private String bankName;
    private String branchCode;
    private String address;

    public Bank(int id, Date createdDate, Date updatedDate, String bankName, String branchCode, String address) throws BankingException {
        super(id, createdDate, updatedDate);
        if (branchCode == null || branchCode.length() < 3) {
            throw new BankingException("Branch code must be at least 3 characters");
        }
        this.bankName = bankName;
        this.branchCode = branchCode;
        this.address = address;
    }

    // Getters and Setters
    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getBranchCode() {
        return branchCode;
    }

    public void setBranchCode(String branchCode) {
        this.branchCode = branchCode;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
